package pl.fxboot.demo;

import pl.fxboot.demo.service.interfaces.DataService;
import pl.fxboot.demo.service.DataServiceImpl;

public class Test {
    private static DataService dataServiceImpl;

    public static void main(String[] args) {
        dataServiceImpl = new DataServiceImpl();
        String testSymbol = "DE30";

//-------------------------------Tests--------------------------------------------------------------
        // bulszit - testy pisze się używając frameworków dedykowanych do tego.
        System.out.println("Ask -> " + dataServiceImpl.getSymbolName(testSymbol));//pass

        System.out.println("Ask -> " + dataServiceImpl.getAskPrice(testSymbol));//pass

        System.out.println("Bid -> " + dataServiceImpl.getBidPrice(testSymbol));//pass

        System.out.println("Category Name -> "+dataServiceImpl.getCategoryName(testSymbol));//pass

        System.out.println("Contract Size -> "+dataServiceImpl.getContractSize(testSymbol));//pass

        System.out.println("Symbol Currency -> " +dataServiceImpl.getSymbolCurrency(testSymbol));//pass

        System.out.println("Symbol Currency Pair -> "+dataServiceImpl.getSymbolCurrencyPair(testSymbol));//pass

        System.out.println("Description -> "+dataServiceImpl.getDescription(testSymbol));//pass

        System.out.println("Expiration -> "+dataServiceImpl.getExpiration(testSymbol));//pass

        System.out.println("Group Name -> "+dataServiceImpl.getGroupName(testSymbol));//pass

        System.out.println("High -> " + dataServiceImpl.getHighPrice(testSymbol));//pass

        System.out.println("Low -> " + dataServiceImpl.getLowPrice(testSymbol));//pass

        System.out.println("Epoch Time -> " + dataServiceImpl.getSymbolEpochTime("DE30") + " ms");//pass

        System.out.println("Date -> " + dataServiceImpl.getSymbolDateTime("DE30"));//pass


    }
}

