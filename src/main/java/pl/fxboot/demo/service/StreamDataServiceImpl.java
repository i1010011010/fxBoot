package pl.fxboot.demo.service;
import org.springframework.stereotype.Service;
import pl.fxboot.demo.serverconnection.ServerConnectionService;
import pl.fxboot.demo.streamlistenerimpl.TickAsk;
import pro.xstore.api.message.error.APICommunicationException;
import java.io.IOException;


@Service
public class StreamDataServiceImpl extends ServerConnectionService {


    public StreamDataServiceImpl(ServerConnectionService connectionService) {
    }

    public StreamDataServiceImpl() {

    }

//zła metoda
    public void getStreamAskPrice(String symbol) {
        try {
            establishConnection().connectStream(new TickAsk());
            establishConnection().subscribePrice(symbol);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (APICommunicationException e) {
            e.printStackTrace();
        }


    }



    public void getStreamBidPrice(String symbol) {
        //Metoda jeszcze niebsłużona
    }
}
