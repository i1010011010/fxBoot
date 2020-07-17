package pl.fxboot.demo;

import pl.fxboot.demo.serverconnection.ServerConnectionService;
import pl.fxboot.demo.service.DataServiceImpl;
import pl.fxboot.demo.service.StreamDataServiceImpl;
import pl.fxboot.demo.streamlistenerimpl.TickAsk;
import pro.xstore.api.streaming.StreamingListener;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        DataServiceImpl dataServiceImpl = new DataServiceImpl();
        StreamDataServiceImpl streamDataServiceImpl = new StreamDataServiceImpl();
        ServerConnectionService service = new ServerConnectionService();

        service.establishStreamConnection(new StreamingListener());
        //service.establishConnection();

        System.out.println("Ask -> " + dataServiceImpl.getAskPrice("EURUSD"));

        System.out.println("Bid -> " + dataServiceImpl.getBidPrice("DE30"));

        System.out.println("High -> " + dataServiceImpl.getHighPrice("DE30"));

        System.out.println("Low -> " + dataServiceImpl.getLowPrice("DE30"));

        System.out.println("Epoch Time -> " + dataServiceImpl.getSymbolEpochTime("DE30") + " ms");

        System.out.println("Date -> " + dataServiceImpl.getSymbolDateTime("DE30"));

        streamDataServiceImpl.getStreamAskPrice("EURUSD");

        //streamDataServiceImpl.getStreamBidPrice("EURUSD");
        //streamDataServiceImpl.getSymbolTimestamp("EURUSD");
        //streamDataServiceImpl.getSymbolTimestampFormatted("EURUSD");


    }

}

