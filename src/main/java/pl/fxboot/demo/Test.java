package pl.fxboot.demo;
import pl.fxboot.demo.service.DataServiceImpl;
import pl.fxboot.demo.service.StreamDataServiceImpl;

public class Test {

    public static void main(String[] args) {
        DataServiceImpl dataServiceImpl = new DataServiceImpl();
        StreamDataServiceImpl streamDataServiceImpl = new StreamDataServiceImpl();

        System.out.println("Ask -> "+dataServiceImpl.getAskPrice("DE30"));

        System.out.println("Bid -> "+dataServiceImpl.getBidPrice("DE30"));

        System.out.println("High -> "+dataServiceImpl.getHighPrice("DE30"));

        System.out.println("Low -> "+dataServiceImpl.getLowPrice("DE30"));

        System.out.println("Epoch Time -> "+dataServiceImpl.getSymbolEpochTime("DE30") + " ms");

        System.out.println("Date -> "+dataServiceImpl.getSymbolDateTime("DE30"));

        streamDataServiceImpl.getStreamAskPrice("DE30");







    }
}
