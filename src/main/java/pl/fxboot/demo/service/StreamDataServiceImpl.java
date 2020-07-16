package pl.fxboot.demo.service;

import org.springframework.stereotype.Service;
import pl.fxboot.demo.serverconnection.ServerConnectionService;
import pro.xstore.api.message.error.APICommunicationException;

@Service
public class StreamDataServiceImpl implements StreamDataService {

    public void getStreamAskPrice(String symbol){
        ServerConnectionService connectionService = new ServerConnectionService();
        try {
            connectionService.establishConnection().subscribePrice(symbol);
        } catch (APICommunicationException e) {
            e.printStackTrace();
        }
    }

}
