package pl.fxboot.demo;

import pl.fxboot.demo.service.FindServiceImpl;
import pl.fxboot.demo.service.HistoryServiceImpl;

import static pro.xstore.api.message.codes.PERIOD_CODE.PERIOD_M1;

public class TestHistoryMethods {

    public static void main(String[] args) {
        String symbol = "DE30";
        FindServiceImpl findService = new FindServiceImpl();
        HistoryServiceImpl historyService = new HistoryServiceImpl();
//-------------------------------Tests--------------------------------------------------------------
        System.out.println(historyService
                .getTickPricesRecord(findService.findSymbolsByCategory("ind"),1594969800000L));//pass

        Integer size = historyService
                .getOpenPricesRange(symbol,PERIOD_M1,1594969800000L,1595016000000L,0L).values().size();
        System.out.println(size);//pass

        System.out.println(historyService.testGetPricesTimeRange());//pass

        System.out.println(historyService
                .getOpenPricesRangeFormattedTime(symbol, PERIOD_M1, 1594969800000L, 1595016000000L, 0L));//pass
    }
}

