package pl.fxboot.demo.service;

import org.springframework.stereotype.Service;
import pl.fxboot.demo.service.auxiliaryservice.ResponseService;
import pl.fxboot.demo.service.interfaces.StreamDataService;
import pl.fxboot.demo.service.streamlistenerimpl.*;

@Service
public class StreamDataServiceImpl implements StreamDataService {
    DataServiceImpl initialValue = new DataServiceImpl();

    @Override
    public void getStreamAskPrice(String symbol) {
        System.out.println(initialValue.getAskPrice(symbol));
        ResponseService.getStreamResponse(symbol, new TickAsk());
    }

    @Override
    public void getStreamBidPrice(String symbol) {
        System.out.println(initialValue.getBidPrice(symbol));
        ResponseService.getStreamResponse(symbol, new TickBid());
    }

    @Override
    public void getSymbolTimestamp(String symbol) {
        System.out.println(initialValue.getSymbolEpochTime(symbol));
        ResponseService.getStreamResponse(symbol, new TickTimestamp());
    }

    @Override
    public void getSymbolTimestampFormatted(String symbol) {
        System.out.println(initialValue.getSymbolDateTime(symbol));
        ResponseService.getStreamResponse(symbol, new TickTimestampFormattedToDate());
    }
}

