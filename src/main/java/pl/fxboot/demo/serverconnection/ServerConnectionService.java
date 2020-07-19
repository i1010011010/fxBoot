package pl.fxboot.demo.serverconnection;

import org.springframework.stereotype.Component;
import pl.fxboot.demo.model.ServerConnectionModel;
import pro.xstore.api.message.command.APICommandFactory;
import pro.xstore.api.message.error.APICommandConstructionException;
import pro.xstore.api.message.error.APICommunicationException;
import pro.xstore.api.message.error.APIReplyParseException;
import pro.xstore.api.message.response.APIErrorResponse;
import pro.xstore.api.streaming.StreamingListener;
import pro.xstore.api.sync.Credentials;
import pro.xstore.api.sync.ServerData;
import pro.xstore.api.sync.SyncAPIConnector;
import java.io.IOException;

@Component
public class ServerConnectionService {
    private ServerConnectionModel authModel;
    SyncAPIConnector connector;

    public ServerConnectionService() {
        authModel = new ServerConnectionModel();
        connector = authModel.getConnector();
        authModel.setLogin(11295105L);
        authModel.setPassword("S2rtttsal");

        try {
            authModel.setConnector(new SyncAPIConnector(ServerData.ServerEnum.DEMO));
            authModel.setCredentials(new Credentials(authModel.getLogin(), authModel.getPassword()));
            connector = authModel.getConnector();
            var credentials = authModel.getCredentials();
            authModel.setLoginResponse(APICommandFactory.executeLoginCommand(connector, credentials));
        } catch (APICommunicationException | IOException | APIErrorResponse | APIReplyParseException | APICommandConstructionException e) {
            e.printStackTrace();
        }
    }

    public SyncAPIConnector establishConnection() {
        return connector;
    }

    public SyncAPIConnector establishStreamConnection(StreamingListener listener) {
        try {
            if(!connector.isStreamConnected()) {
                connector.connectStream(listener);
            }
        } catch (IOException | APICommunicationException e) {
            e.printStackTrace();
        }
        return connector;
    }
}




