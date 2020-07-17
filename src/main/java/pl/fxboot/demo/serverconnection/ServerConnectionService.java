package pl.fxboot.demo.serverconnection;

import org.springframework.stereotype.Service;
import pl.fxboot.demo.model.ServerConnectionModel;
import pl.fxboot.demo.streamlistenerimpl.TickAsk;
import pl.fxboot.demo.streamlistenerimpl.TickBid;
import pro.xstore.api.message.command.APICommandFactory;
import pro.xstore.api.message.error.APICommandConstructionException;
import pro.xstore.api.message.error.APICommunicationException;
import pro.xstore.api.message.error.APIReplyParseException;
import pro.xstore.api.message.response.APIErrorResponse;

import pro.xstore.api.sync.Credentials;
import pro.xstore.api.sync.ServerData;
import pro.xstore.api.sync.SyncAPIConnector;

import java.io.IOException;

@Service
public class ServerConnectionService{
    private ServerConnectionModel authModel;


    public SyncAPIConnector establishConnection() {
        authModel = new ServerConnectionModel();
        SyncAPIConnector connector =  authModel.getConnector();
        authModel.setLogin(11295105L);
        authModel.setPassword("S2rtttsal");

        try {
            authModel.setConnector(new SyncAPIConnector(ServerData.ServerEnum.DEMO));
            authModel.setCredentials(new Credentials(authModel.getLogin(), authModel.getPassword()));
            connector = authModel.getConnector();
            var credentials = authModel.getCredentials();
            try {
                authModel.setLoginResponse(APICommandFactory.executeLoginCommand(connector, credentials));
            } catch (APICommandConstructionException | APIErrorResponse | APIReplyParseException e) {
                e.printStackTrace();
            }

            //diagnosis
//            if(authModel.getLoginResponse().getStatus()){
//                System.out.println("User Logged in");
//            }else
//            {
//                System.out.println("Logging error");
//            }

           // connector.connectStream(new TickBid());
           // connector.subscribePrice("DE30");
        } catch (IOException | APICommunicationException e) {
            e.printStackTrace();
        }
        return connector;
    }

    }




