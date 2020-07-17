package pl.fxboot.demo.service;

import org.springframework.stereotype.Service;
import pl.fxboot.demo.serverconnection.ServerConnectionService;
import pl.fxboot.demo.streamlistenerimpl.TickAsk;
import pl.fxboot.demo.streamlistenerimpl.TickBid;
import pl.fxboot.demo.streamlistenerimpl.TickTimestamp;
import pl.fxboot.demo.streamlistenerimpl.TickTimestampFormattedToDate;
import pro.xstore.api.message.error.APICommunicationException;
import pro.xstore.api.streaming.StreamingListener;

@Service
public class StreamDataServiceImpl implements StreamDataService {

    ServerConnectionService service = new ServerConnectionService();

    @Override
    public void getStreamAskPrice(String symbol) {
        getStream(symbol,new TickAsk());
    }

    @Override
    public void getStreamBidPrice(String symbol) {
        getStream(symbol,new TickBid());
    }

    @Override
    public void getSymbolTimestamp(String symbol) {
        getStream(symbol,new TickTimestamp());
    }

    @Override
    public void getSymbolTimestampFormatted(String symbol) {
        getStream(symbol,new TickTimestampFormattedToDate());
    }

    //auxiliary method
    private void getStream(String symbol, StreamingListener listener) {
        try {
            service.establishStreamConnection(listener).subscribePrice(symbol);
        } catch (APICommunicationException e) {
            e.printStackTrace();
        }
    }
}

