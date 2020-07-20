package pl.fxboot.demo;

import pl.fxboot.demo.serverconnection.ServerConnectionService;
import pl.fxboot.demo.service.interfaces.DataService;
import pl.fxboot.demo.service.DataServiceImpl;


public class Test {
    private static DataService dataServiceImpl;

    public static void main(String[] args) {
        dataServiceImpl = new DataServiceImpl();
        String testSymbol = "DE30";

        System.out.println("Ask -> " + dataServiceImpl.getSymbolName(testSymbol));

        System.out.println("Ask -> " + dataServiceImpl.getAskPrice(testSymbol));

        System.out.println("Bid -> " + dataServiceImpl.getBidPrice(testSymbol));

        System.out.println("Category Name -> "+dataServiceImpl.getCategoryName(testSymbol));

        System.out.println("Contract Size -> "+dataServiceImpl.getContractSize(testSymbol));

        System.out.println("Symbol Currency -> " +dataServiceImpl.getSymbolCurrency(testSymbol));

        System.out.println("Symbol Currency Pair -> "+dataServiceImpl.getSymbolCurrencyPair(testSymbol));

        System.out.println("Description -> "+dataServiceImpl.getDescription(testSymbol));

        System.out.println("Expiration -> "+dataServiceImpl.getExpiration(testSymbol));

        System.out.println("Group Name -> "+dataServiceImpl.getGroupName(testSymbol));

        System.out.println("High -> " + dataServiceImpl.getHighPrice(testSymbol));

        System.out.println("Low -> " + dataServiceImpl.getLowPrice(testSymbol));

        System.out.println("Epoch Time -> " + dataServiceImpl.getSymbolEpochTime(testSymbol) + " ms");

        System.out.println("Date -> " + dataServiceImpl.getSymbolDateTime(testSymbol));
    }
}

