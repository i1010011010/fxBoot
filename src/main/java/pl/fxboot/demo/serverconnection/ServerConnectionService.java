package pl.fxboot.demo.serverconnection;

import org.springframework.stereotype.Service;
import pl.fxboot.demo.model.ServerConnectionModel;
import pl.fxboot.demo.service.StreamingListenerImpl;
import pro.xstore.api.message.command.APICommandFactory;
import pro.xstore.api.message.error.APICommandConstructionException;
import pro.xstore.api.message.error.APICommunicationException;
import pro.xstore.api.message.error.APIReplyParseException;
import pro.xstore.api.message.response.APIErrorResponse;
import pro.xstore.api.message.response.LoginResponse;
import pro.xstore.api.streaming.StreamingListener;
import pro.xstore.api.sync.Credentials;
import pro.xstore.api.sync.ServerData;
import pro.xstore.api.sync.SyncAPIConnector;

import java.io.IOException;

@Service
public class ServerConnectionService {
    private static ServerConnectionModel authModel;


    public SyncAPIConnector establishConnection() {
        authModel = new ServerConnectionModel();

        try {
            authModel.setLogin(11295105L);
            authModel.setPassword("S2rtttsal");
            authModel.setConnector(new SyncAPIConnector(ServerData.ServerEnum.DEMO));
            authModel.setCredentials(new Credentials(authModel.getLogin(), authModel.getPassword()));
            var connector = authModel.getConnector();
            var credentials = authModel.getCredentials();
            authModel.setLoginResponse(APICommandFactory.executeLoginCommand(connector, credentials));

            //diagnosis
//            if(authModel.getLoginResponse().getStatus()){
//                System.out.println("User Logged in");
//            }else
//            {
//                System.out.println("Logging error");
//            }



            //for stream connection
            connector.connectStream(new StreamingListenerImpl());

        } catch (IOException | APIReplyParseException | APIErrorResponse | APICommandConstructionException | APICommunicationException e) {
            e.printStackTrace();
        }
        return authModel.getConnector();
    }
}
