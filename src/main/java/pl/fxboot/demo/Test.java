package pl.fxboot.demo;

import pl.fxboot.demo.serverconnection.ServerConnectionService;
import pl.fxboot.demo.service.DataService;
import pl.fxboot.demo.service.DataServiceImpl;
import pl.fxboot.demo.service.StreamDataService;
import pl.fxboot.demo.service.StreamDataServiceImpl;
import pl.fxboot.demo.streamlistenerimpl.TickAsk;
import pro.xstore.api.streaming.StreamingListener;

import java.util.Arrays;

public class Test {
    private static ServerConnectionService service;
    private static DataService dataServiceImpl;
    private static StreamDataService streamDataServiceImpl;


    public static void main(String[] args) {
        service = new ServerConnectionService();
        dataServiceImpl = new DataServiceImpl();
        streamDataServiceImpl = new StreamDataServiceImpl();
        Test test = new Test();
        //test.getMassiveData();//pass

        System.out.println("Ask -> " + dataServiceImpl.getAskPrice("EURUSD"));//pass

        System.out.println("Bid -> " + dataServiceImpl.getBidPrice("DE30"));//pass

        System.out.println("High -> " + dataServiceImpl.getHighPrice("DE30"));//pass

        System.out.println("Low -> " + dataServiceImpl.getLowPrice("DE30"));//pass

        System.out.println("Epoch Time -> " + dataServiceImpl.getSymbolEpochTime("DE30") + " ms");//pass

        System.out.println("Date -> " + dataServiceImpl.getSymbolDateTime("DE30"));//pass

        streamDataServiceImpl.getStreamAskPrice("EURUSD");//pass

        streamDataServiceImpl.getStreamBidPrice("DE30");//pass

        streamDataServiceImpl.getSymbolTimestamp("EURUSD");//pass

        streamDataServiceImpl.getSymbolTimestampFormatted("EURUSD");//pass
    }

    public void getMassiveData(){
        streamDataServiceImpl.getStreamAskPrice("EURUSD");
        streamDataServiceImpl.getStreamBidPrice("EURUSD");
        streamDataServiceImpl.getStreamAskPrice("DE30");
        streamDataServiceImpl.getStreamBidPrice("DE30");
        streamDataServiceImpl.getStreamAskPrice("USDCHF");
        streamDataServiceImpl.getStreamBidPrice("USDCHF");
        streamDataServiceImpl.getStreamAskPrice("US30");
        streamDataServiceImpl.getStreamBidPrice("US30");
        streamDataServiceImpl.getStreamAskPrice("US100");
        streamDataServiceImpl.getStreamBidPrice("US100");
        streamDataServiceImpl.getStreamAskPrice("EU50");
        streamDataServiceImpl.getStreamBidPrice("EU50");
        streamDataServiceImpl.getStreamAskPrice("EURGBP");
        streamDataServiceImpl.getStreamBidPrice("EURGBP");
        streamDataServiceImpl.getStreamAskPrice("USDJPY");
        streamDataServiceImpl.getStreamBidPrice("USDJPY");
        streamDataServiceImpl.getStreamAskPrice("GOLD");
        streamDataServiceImpl.getStreamBidPrice("GOLD");
        streamDataServiceImpl.getStreamAskPrice("OIL");
        streamDataServiceImpl.getStreamBidPrice("OIL");
        streamDataServiceImpl.getStreamAskPrice("OIL.WTI");
        streamDataServiceImpl.getStreamBidPrice("OIL.WTI");

        streamDataServiceImpl.getStreamAskPrice("EURUSD");
        streamDataServiceImpl.getStreamBidPrice("EURUSD");
        streamDataServiceImpl.getStreamAskPrice("DE30");
        streamDataServiceImpl.getStreamBidPrice("DE30");
        streamDataServiceImpl.getStreamAskPrice("USDCHF");
        streamDataServiceImpl.getStreamBidPrice("USDCHF");
        streamDataServiceImpl.getStreamAskPrice("US30");
        streamDataServiceImpl.getStreamBidPrice("US30");
        streamDataServiceImpl.getStreamAskPrice("US100");
        streamDataServiceImpl.getStreamBidPrice("US100");
        streamDataServiceImpl.getStreamAskPrice("EU50");
        streamDataServiceImpl.getStreamBidPrice("EU50");
        streamDataServiceImpl.getStreamAskPrice("EURGBP");
        streamDataServiceImpl.getStreamBidPrice("EURGBP");
        streamDataServiceImpl.getStreamAskPrice("USDJPY");
        streamDataServiceImpl.getStreamBidPrice("USDJPY");
        streamDataServiceImpl.getStreamAskPrice("GOLD");
        streamDataServiceImpl.getStreamBidPrice("GOLD");
        streamDataServiceImpl.getStreamAskPrice("OIL");
        streamDataServiceImpl.getStreamBidPrice("OIL");
        streamDataServiceImpl.getStreamAskPrice("OIL.WTI");
        streamDataServiceImpl.getStreamBidPrice("OIL.WTI");

        streamDataServiceImpl.getStreamAskPrice("EURUSD");
        streamDataServiceImpl.getStreamBidPrice("EURUSD");
        streamDataServiceImpl.getStreamAskPrice("DE30");
        streamDataServiceImpl.getStreamBidPrice("DE30");
        streamDataServiceImpl.getStreamAskPrice("USDCHF");
        streamDataServiceImpl.getStreamBidPrice("USDCHF");
        streamDataServiceImpl.getStreamAskPrice("US30");
        streamDataServiceImpl.getStreamBidPrice("US30");
        streamDataServiceImpl.getStreamAskPrice("US100");
        streamDataServiceImpl.getStreamBidPrice("US100");
        streamDataServiceImpl.getStreamAskPrice("EU50");
        streamDataServiceImpl.getStreamBidPrice("EU50");
        streamDataServiceImpl.getStreamAskPrice("EURGBP");
        streamDataServiceImpl.getStreamBidPrice("EURGBP");
        streamDataServiceImpl.getStreamAskPrice("USDJPY");
        streamDataServiceImpl.getStreamBidPrice("USDJPY");
        streamDataServiceImpl.getStreamAskPrice("GOLD");
        streamDataServiceImpl.getStreamBidPrice("GOLD");
        streamDataServiceImpl.getStreamAskPrice("OIL");
        streamDataServiceImpl.getStreamBidPrice("OIL");
        streamDataServiceImpl.getStreamAskPrice("OIL.WTI");
        streamDataServiceImpl.getStreamBidPrice("OIL.WTI");

        streamDataServiceImpl.getStreamAskPrice("EURUSD");
        streamDataServiceImpl.getStreamBidPrice("EURUSD");
        streamDataServiceImpl.getStreamAskPrice("DE30");
        streamDataServiceImpl.getStreamBidPrice("DE30");
        streamDataServiceImpl.getStreamAskPrice("USDCHF");
        streamDataServiceImpl.getStreamBidPrice("USDCHF");
        streamDataServiceImpl.getStreamAskPrice("US30");
        streamDataServiceImpl.getStreamBidPrice("US30");
        streamDataServiceImpl.getStreamAskPrice("US100");
        streamDataServiceImpl.getStreamBidPrice("US100");
        streamDataServiceImpl.getStreamAskPrice("EU50");
        streamDataServiceImpl.getStreamBidPrice("EU50");
        streamDataServiceImpl.getStreamAskPrice("EURGBP");
        streamDataServiceImpl.getStreamBidPrice("EURGBP");
        streamDataServiceImpl.getStreamAskPrice("USDJPY");
        streamDataServiceImpl.getStreamBidPrice("USDJPY");
        streamDataServiceImpl.getStreamAskPrice("GOLD");
        streamDataServiceImpl.getStreamBidPrice("GOLD");
        streamDataServiceImpl.getStreamAskPrice("OIL");
        streamDataServiceImpl.getStreamBidPrice("OIL");
        streamDataServiceImpl.getStreamAskPrice("OIL.WTI");
        streamDataServiceImpl.getStreamBidPrice("OIL.WTI");

        streamDataServiceImpl.getStreamAskPrice("EURUSD");
        streamDataServiceImpl.getStreamBidPrice("EURUSD");
        streamDataServiceImpl.getStreamAskPrice("DE30");
        streamDataServiceImpl.getStreamBidPrice("DE30");
        streamDataServiceImpl.getStreamAskPrice("USDCHF");
        streamDataServiceImpl.getStreamBidPrice("USDCHF");
        streamDataServiceImpl.getStreamAskPrice("US30");
        streamDataServiceImpl.getStreamBidPrice("US30");
        streamDataServiceImpl.getStreamAskPrice("US100");
        streamDataServiceImpl.getStreamBidPrice("US100");
        streamDataServiceImpl.getStreamAskPrice("EU50");
        streamDataServiceImpl.getStreamBidPrice("EU50");
        streamDataServiceImpl.getStreamAskPrice("EURGBP");
        streamDataServiceImpl.getStreamBidPrice("EURGBP");
        streamDataServiceImpl.getStreamAskPrice("USDJPY");
        streamDataServiceImpl.getStreamBidPrice("USDJPY");
        streamDataServiceImpl.getStreamAskPrice("GOLD");
        streamDataServiceImpl.getStreamBidPrice("GOLD");
        streamDataServiceImpl.getStreamAskPrice("OIL");
        streamDataServiceImpl.getStreamBidPrice("OIL");
        streamDataServiceImpl.getStreamAskPrice("OIL.WTI");
        streamDataServiceImpl.getStreamBidPrice("OIL.WTI");

        streamDataServiceImpl.getStreamAskPrice("EURUSD");
        streamDataServiceImpl.getStreamBidPrice("EURUSD");
        streamDataServiceImpl.getStreamAskPrice("DE30");
        streamDataServiceImpl.getStreamBidPrice("DE30");
        streamDataServiceImpl.getStreamAskPrice("USDCHF");
        streamDataServiceImpl.getStreamBidPrice("USDCHF");
        streamDataServiceImpl.getStreamAskPrice("US30");
        streamDataServiceImpl.getStreamBidPrice("US30");
        streamDataServiceImpl.getStreamAskPrice("US100");
        streamDataServiceImpl.getStreamBidPrice("US100");
        streamDataServiceImpl.getStreamAskPrice("EU50");
        streamDataServiceImpl.getStreamBidPrice("EU50");
        streamDataServiceImpl.getStreamAskPrice("EURGBP");
        streamDataServiceImpl.getStreamBidPrice("EURGBP");
        streamDataServiceImpl.getStreamAskPrice("USDJPY");
        streamDataServiceImpl.getStreamBidPrice("USDJPY");
        streamDataServiceImpl.getStreamAskPrice("GOLD");
        streamDataServiceImpl.getStreamBidPrice("GOLD");
        streamDataServiceImpl.getStreamAskPrice("OIL");
        streamDataServiceImpl.getStreamBidPrice("OIL");
        streamDataServiceImpl.getStreamAskPrice("OIL.WTI");
        streamDataServiceImpl.getStreamBidPrice("OIL.WTI");

        streamDataServiceImpl.getStreamAskPrice("EURUSD");
        streamDataServiceImpl.getStreamBidPrice("EURUSD");
        streamDataServiceImpl.getStreamAskPrice("DE30");
        streamDataServiceImpl.getStreamBidPrice("DE30");
        streamDataServiceImpl.getStreamAskPrice("USDCHF");
        streamDataServiceImpl.getStreamBidPrice("USDCHF");
        streamDataServiceImpl.getStreamAskPrice("US30");
        streamDataServiceImpl.getStreamBidPrice("US30");
        streamDataServiceImpl.getStreamAskPrice("US100");
        streamDataServiceImpl.getStreamBidPrice("US100");
        streamDataServiceImpl.getStreamAskPrice("EU50");
        streamDataServiceImpl.getStreamBidPrice("EU50");
        streamDataServiceImpl.getStreamAskPrice("EURGBP");
        streamDataServiceImpl.getStreamBidPrice("EURGBP");
        streamDataServiceImpl.getStreamAskPrice("USDJPY");
        streamDataServiceImpl.getStreamBidPrice("USDJPY");
        streamDataServiceImpl.getStreamAskPrice("GOLD");
        streamDataServiceImpl.getStreamBidPrice("GOLD");
        streamDataServiceImpl.getStreamAskPrice("OIL");
        streamDataServiceImpl.getStreamBidPrice("OIL");
        streamDataServiceImpl.getStreamAskPrice("OIL.WTI");
        streamDataServiceImpl.getStreamBidPrice("OIL.WTI");

        streamDataServiceImpl.getStreamAskPrice("EURUSD");
        streamDataServiceImpl.getStreamBidPrice("EURUSD");
        streamDataServiceImpl.getStreamAskPrice("DE30");
        streamDataServiceImpl.getStreamBidPrice("DE30");
        streamDataServiceImpl.getStreamAskPrice("USDCHF");
        streamDataServiceImpl.getStreamBidPrice("USDCHF");
        streamDataServiceImpl.getStreamAskPrice("US30");
        streamDataServiceImpl.getStreamBidPrice("US30");
        streamDataServiceImpl.getStreamAskPrice("US100");
        streamDataServiceImpl.getStreamBidPrice("US100");
        streamDataServiceImpl.getStreamAskPrice("EU50");
        streamDataServiceImpl.getStreamBidPrice("EU50");
        streamDataServiceImpl.getStreamAskPrice("EURGBP");
        streamDataServiceImpl.getStreamBidPrice("EURGBP");
        streamDataServiceImpl.getStreamAskPrice("USDJPY");
        streamDataServiceImpl.getStreamBidPrice("USDJPY");
        streamDataServiceImpl.getStreamAskPrice("GOLD");
        streamDataServiceImpl.getStreamBidPrice("GOLD");
        streamDataServiceImpl.getStreamAskPrice("OIL");
        streamDataServiceImpl.getStreamBidPrice("OIL");
        streamDataServiceImpl.getStreamAskPrice("OIL.WTI");
        streamDataServiceImpl.getStreamBidPrice("OIL.WTI");

        streamDataServiceImpl.getStreamAskPrice("EURUSD");
        streamDataServiceImpl.getStreamBidPrice("EURUSD");
        streamDataServiceImpl.getStreamAskPrice("DE30");
        streamDataServiceImpl.getStreamBidPrice("DE30");
        streamDataServiceImpl.getStreamAskPrice("USDCHF");
        streamDataServiceImpl.getStreamBidPrice("USDCHF");
        streamDataServiceImpl.getStreamAskPrice("US30");
        streamDataServiceImpl.getStreamBidPrice("US30");
        streamDataServiceImpl.getStreamAskPrice("US100");
        streamDataServiceImpl.getStreamBidPrice("US100");
        streamDataServiceImpl.getStreamAskPrice("EU50");
        streamDataServiceImpl.getStreamBidPrice("EU50");
        streamDataServiceImpl.getStreamAskPrice("EURGBP");
        streamDataServiceImpl.getStreamBidPrice("EURGBP");
        streamDataServiceImpl.getStreamAskPrice("USDJPY");
        streamDataServiceImpl.getStreamBidPrice("USDJPY");
        streamDataServiceImpl.getStreamAskPrice("GOLD");
        streamDataServiceImpl.getStreamBidPrice("GOLD");
        streamDataServiceImpl.getStreamAskPrice("OIL");
        streamDataServiceImpl.getStreamBidPrice("OIL");
        streamDataServiceImpl.getStreamAskPrice("OIL.WTI");
        streamDataServiceImpl.getStreamBidPrice("OIL.WTI");

        streamDataServiceImpl.getStreamAskPrice("EURUSD");
        streamDataServiceImpl.getStreamBidPrice("EURUSD");
        streamDataServiceImpl.getStreamAskPrice("DE30");
        streamDataServiceImpl.getStreamBidPrice("DE30");
        streamDataServiceImpl.getStreamAskPrice("USDCHF");
        streamDataServiceImpl.getStreamBidPrice("USDCHF");
        streamDataServiceImpl.getStreamAskPrice("US30");
        streamDataServiceImpl.getStreamBidPrice("US30");
        streamDataServiceImpl.getStreamAskPrice("US100");
        streamDataServiceImpl.getStreamBidPrice("US100");
        streamDataServiceImpl.getStreamAskPrice("EU50");
        streamDataServiceImpl.getStreamBidPrice("EU50");
        streamDataServiceImpl.getStreamAskPrice("EURGBP");
        streamDataServiceImpl.getStreamBidPrice("EURGBP");
        streamDataServiceImpl.getStreamAskPrice("USDJPY");
        streamDataServiceImpl.getStreamBidPrice("USDJPY");
        streamDataServiceImpl.getStreamAskPrice("GOLD");
        streamDataServiceImpl.getStreamBidPrice("GOLD");
        streamDataServiceImpl.getStreamAskPrice("OIL");
        streamDataServiceImpl.getStreamBidPrice("OIL");
        streamDataServiceImpl.getStreamAskPrice("OIL.WTI");
        streamDataServiceImpl.getStreamBidPrice("OIL.WTI");

        streamDataServiceImpl.getStreamAskPrice("EURUSD");
        streamDataServiceImpl.getStreamBidPrice("EURUSD");
        streamDataServiceImpl.getStreamAskPrice("DE30");
        streamDataServiceImpl.getStreamBidPrice("DE30");
        streamDataServiceImpl.getStreamAskPrice("USDCHF");
        streamDataServiceImpl.getStreamBidPrice("USDCHF");
        streamDataServiceImpl.getStreamAskPrice("US30");
        streamDataServiceImpl.getStreamBidPrice("US30");
        streamDataServiceImpl.getStreamAskPrice("US100");
        streamDataServiceImpl.getStreamBidPrice("US100");
        streamDataServiceImpl.getStreamAskPrice("EU50");
        streamDataServiceImpl.getStreamBidPrice("EU50");
        streamDataServiceImpl.getStreamAskPrice("EURGBP");
        streamDataServiceImpl.getStreamBidPrice("EURGBP");
        streamDataServiceImpl.getStreamAskPrice("USDJPY");
        streamDataServiceImpl.getStreamBidPrice("USDJPY");
        streamDataServiceImpl.getStreamAskPrice("GOLD");
        streamDataServiceImpl.getStreamBidPrice("GOLD");
        streamDataServiceImpl.getStreamAskPrice("OIL");
        streamDataServiceImpl.getStreamBidPrice("OIL");
        streamDataServiceImpl.getStreamAskPrice("OIL.WTI");
        streamDataServiceImpl.getStreamBidPrice("OIL.WTI");

        streamDataServiceImpl.getStreamAskPrice("EURUSD");
        streamDataServiceImpl.getStreamBidPrice("EURUSD");
        streamDataServiceImpl.getStreamAskPrice("DE30");
        streamDataServiceImpl.getStreamBidPrice("DE30");
        streamDataServiceImpl.getStreamAskPrice("USDCHF");
        streamDataServiceImpl.getStreamBidPrice("USDCHF");
        streamDataServiceImpl.getStreamAskPrice("US30");
        streamDataServiceImpl.getStreamBidPrice("US30");
        streamDataServiceImpl.getStreamAskPrice("US100");
        streamDataServiceImpl.getStreamBidPrice("US100");
        streamDataServiceImpl.getStreamAskPrice("EU50");
        streamDataServiceImpl.getStreamBidPrice("EU50");
        streamDataServiceImpl.getStreamAskPrice("EURGBP");
        streamDataServiceImpl.getStreamBidPrice("EURGBP");
        streamDataServiceImpl.getStreamAskPrice("USDJPY");
        streamDataServiceImpl.getStreamBidPrice("USDJPY");
        streamDataServiceImpl.getStreamAskPrice("GOLD");
        streamDataServiceImpl.getStreamBidPrice("GOLD");
        streamDataServiceImpl.getStreamAskPrice("OIL");
        streamDataServiceImpl.getStreamBidPrice("OIL");
        streamDataServiceImpl.getStreamAskPrice("OIL.WTI");
        streamDataServiceImpl.getStreamBidPrice("OIL.WTI");

        streamDataServiceImpl.getStreamAskPrice("EURUSD");
        streamDataServiceImpl.getStreamBidPrice("EURUSD");
        streamDataServiceImpl.getStreamAskPrice("DE30");
        streamDataServiceImpl.getStreamBidPrice("DE30");
        streamDataServiceImpl.getStreamAskPrice("USDCHF");
        streamDataServiceImpl.getStreamBidPrice("USDCHF");
        streamDataServiceImpl.getStreamAskPrice("US30");
        streamDataServiceImpl.getStreamBidPrice("US30");
        streamDataServiceImpl.getStreamAskPrice("US100");
        streamDataServiceImpl.getStreamBidPrice("US100");
        streamDataServiceImpl.getStreamAskPrice("EU50");
        streamDataServiceImpl.getStreamBidPrice("EU50");
        streamDataServiceImpl.getStreamAskPrice("EURGBP");
        streamDataServiceImpl.getStreamBidPrice("EURGBP");
        streamDataServiceImpl.getStreamAskPrice("USDJPY");
        streamDataServiceImpl.getStreamBidPrice("USDJPY");
        streamDataServiceImpl.getStreamAskPrice("GOLD");
        streamDataServiceImpl.getStreamBidPrice("GOLD");
        streamDataServiceImpl.getStreamAskPrice("OIL");
        streamDataServiceImpl.getStreamBidPrice("OIL");
        streamDataServiceImpl.getStreamAskPrice("OIL.WTI");
        streamDataServiceImpl.getStreamBidPrice("OIL.WTI");

        streamDataServiceImpl.getStreamAskPrice("EURUSD");
        streamDataServiceImpl.getStreamBidPrice("EURUSD");
        streamDataServiceImpl.getStreamAskPrice("DE30");
        streamDataServiceImpl.getStreamBidPrice("DE30");
        streamDataServiceImpl.getStreamAskPrice("USDCHF");
        streamDataServiceImpl.getStreamBidPrice("USDCHF");
        streamDataServiceImpl.getStreamAskPrice("US30");
        streamDataServiceImpl.getStreamBidPrice("US30");
        streamDataServiceImpl.getStreamAskPrice("US100");
        streamDataServiceImpl.getStreamBidPrice("US100");
        streamDataServiceImpl.getStreamAskPrice("EU50");
        streamDataServiceImpl.getStreamBidPrice("EU50");
        streamDataServiceImpl.getStreamAskPrice("EURGBP");
        streamDataServiceImpl.getStreamBidPrice("EURGBP");
        streamDataServiceImpl.getStreamAskPrice("USDJPY");
        streamDataServiceImpl.getStreamBidPrice("USDJPY");
        streamDataServiceImpl.getStreamAskPrice("GOLD");
        streamDataServiceImpl.getStreamBidPrice("GOLD");
        streamDataServiceImpl.getStreamAskPrice("OIL");
        streamDataServiceImpl.getStreamBidPrice("OIL");
        streamDataServiceImpl.getStreamAskPrice("OIL.WTI");
        streamDataServiceImpl.getStreamBidPrice("OIL.WTI");

        streamDataServiceImpl.getStreamAskPrice("EURUSD");
        streamDataServiceImpl.getStreamBidPrice("EURUSD");
        streamDataServiceImpl.getStreamAskPrice("DE30");
        streamDataServiceImpl.getStreamBidPrice("DE30");
        streamDataServiceImpl.getStreamAskPrice("USDCHF");
        streamDataServiceImpl.getStreamBidPrice("USDCHF");
        streamDataServiceImpl.getStreamAskPrice("US30");
        streamDataServiceImpl.getStreamBidPrice("US30");
        streamDataServiceImpl.getStreamAskPrice("US100");
        streamDataServiceImpl.getStreamBidPrice("US100");
        streamDataServiceImpl.getStreamAskPrice("EU50");
        streamDataServiceImpl.getStreamBidPrice("EU50");
        streamDataServiceImpl.getStreamAskPrice("EURGBP");
        streamDataServiceImpl.getStreamBidPrice("EURGBP");
        streamDataServiceImpl.getStreamAskPrice("USDJPY");
        streamDataServiceImpl.getStreamBidPrice("USDJPY");
        streamDataServiceImpl.getStreamAskPrice("GOLD");
        streamDataServiceImpl.getStreamBidPrice("GOLD");
        streamDataServiceImpl.getStreamAskPrice("OIL");
        streamDataServiceImpl.getStreamBidPrice("OIL");
        streamDataServiceImpl.getStreamAskPrice("OIL.WTI");
        streamDataServiceImpl.getStreamBidPrice("OIL.WTI");

        streamDataServiceImpl.getStreamAskPrice("EURUSD");
        streamDataServiceImpl.getStreamBidPrice("EURUSD");
        streamDataServiceImpl.getStreamAskPrice("DE30");
        streamDataServiceImpl.getStreamBidPrice("DE30");
        streamDataServiceImpl.getStreamAskPrice("USDCHF");
        streamDataServiceImpl.getStreamBidPrice("USDCHF");
        streamDataServiceImpl.getStreamAskPrice("US30");
        streamDataServiceImpl.getStreamBidPrice("US30");
        streamDataServiceImpl.getStreamAskPrice("US100");
        streamDataServiceImpl.getStreamBidPrice("US100");
        streamDataServiceImpl.getStreamAskPrice("EU50");
        streamDataServiceImpl.getStreamBidPrice("EU50");
        streamDataServiceImpl.getStreamAskPrice("EURGBP");
        streamDataServiceImpl.getStreamBidPrice("EURGBP");
        streamDataServiceImpl.getStreamAskPrice("USDJPY");
        streamDataServiceImpl.getStreamBidPrice("USDJPY");
        streamDataServiceImpl.getStreamAskPrice("GOLD");
        streamDataServiceImpl.getStreamBidPrice("GOLD");
        streamDataServiceImpl.getStreamAskPrice("OIL");
        streamDataServiceImpl.getStreamBidPrice("OIL");
        streamDataServiceImpl.getStreamAskPrice("OIL.WTI");
        streamDataServiceImpl.getStreamBidPrice("OIL.WTI");

        streamDataServiceImpl.getStreamAskPrice("EURUSD");
        streamDataServiceImpl.getStreamBidPrice("EURUSD");
        streamDataServiceImpl.getStreamAskPrice("DE30");
        streamDataServiceImpl.getStreamBidPrice("DE30");
        streamDataServiceImpl.getStreamAskPrice("USDCHF");
        streamDataServiceImpl.getStreamBidPrice("USDCHF");
        streamDataServiceImpl.getStreamAskPrice("US30");
        streamDataServiceImpl.getStreamBidPrice("US30");
        streamDataServiceImpl.getStreamAskPrice("US100");
        streamDataServiceImpl.getStreamBidPrice("US100");
        streamDataServiceImpl.getStreamAskPrice("EU50");
        streamDataServiceImpl.getStreamBidPrice("EU50");
        streamDataServiceImpl.getStreamAskPrice("EURGBP");
        streamDataServiceImpl.getStreamBidPrice("EURGBP");
        streamDataServiceImpl.getStreamAskPrice("USDJPY");
        streamDataServiceImpl.getStreamBidPrice("USDJPY");
        streamDataServiceImpl.getStreamAskPrice("GOLD");
        streamDataServiceImpl.getStreamBidPrice("GOLD");
        streamDataServiceImpl.getStreamAskPrice("OIL");
        streamDataServiceImpl.getStreamBidPrice("OIL");
        streamDataServiceImpl.getStreamAskPrice("OIL.WTI");
        streamDataServiceImpl.getStreamBidPrice("OIL.WTI");

        streamDataServiceImpl.getStreamAskPrice("EURUSD");
        streamDataServiceImpl.getStreamBidPrice("EURUSD");
        streamDataServiceImpl.getStreamAskPrice("DE30");
        streamDataServiceImpl.getStreamBidPrice("DE30");
        streamDataServiceImpl.getStreamAskPrice("USDCHF");
        streamDataServiceImpl.getStreamBidPrice("USDCHF");
        streamDataServiceImpl.getStreamAskPrice("US30");
        streamDataServiceImpl.getStreamBidPrice("US30");
        streamDataServiceImpl.getStreamAskPrice("US100");
        streamDataServiceImpl.getStreamBidPrice("US100");
        streamDataServiceImpl.getStreamAskPrice("EU50");
        streamDataServiceImpl.getStreamBidPrice("EU50");
        streamDataServiceImpl.getStreamAskPrice("EURGBP");
        streamDataServiceImpl.getStreamBidPrice("EURGBP");
        streamDataServiceImpl.getStreamAskPrice("USDJPY");
        streamDataServiceImpl.getStreamBidPrice("USDJPY");
        streamDataServiceImpl.getStreamAskPrice("GOLD");
        streamDataServiceImpl.getStreamBidPrice("GOLD");
        streamDataServiceImpl.getStreamAskPrice("OIL");
        streamDataServiceImpl.getStreamBidPrice("OIL");
        streamDataServiceImpl.getStreamAskPrice("OIL.WTI");
        streamDataServiceImpl.getStreamBidPrice("OIL.WTI");

        streamDataServiceImpl.getStreamAskPrice("EURUSD");
        streamDataServiceImpl.getStreamBidPrice("EURUSD");
        streamDataServiceImpl.getStreamAskPrice("DE30");
        streamDataServiceImpl.getStreamBidPrice("DE30");
        streamDataServiceImpl.getStreamAskPrice("USDCHF");
        streamDataServiceImpl.getStreamBidPrice("USDCHF");
        streamDataServiceImpl.getStreamAskPrice("US30");
        streamDataServiceImpl.getStreamBidPrice("US30");
        streamDataServiceImpl.getStreamAskPrice("US100");
        streamDataServiceImpl.getStreamBidPrice("US100");
        streamDataServiceImpl.getStreamAskPrice("EU50");
        streamDataServiceImpl.getStreamBidPrice("EU50");
        streamDataServiceImpl.getStreamAskPrice("EURGBP");
        streamDataServiceImpl.getStreamBidPrice("EURGBP");
        streamDataServiceImpl.getStreamAskPrice("USDJPY");
        streamDataServiceImpl.getStreamBidPrice("USDJPY");
        streamDataServiceImpl.getStreamAskPrice("GOLD");
        streamDataServiceImpl.getStreamBidPrice("GOLD");
        streamDataServiceImpl.getStreamAskPrice("OIL");
        streamDataServiceImpl.getStreamBidPrice("OIL");
        streamDataServiceImpl.getStreamAskPrice("OIL.WTI");
        streamDataServiceImpl.getStreamBidPrice("OIL.WTI");



    }

}

