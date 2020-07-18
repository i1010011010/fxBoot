package pl.fxboot.demo;

import pl.fxboot.demo.service.HistoryServiceImpl;

import java.util.ArrayList;
import java.util.List;

import static pro.xstore.api.message.codes.PERIOD_CODE.PERIOD_M1;

public class TestHistoryMethods {

    public static void main(String[] args) {
        String symbol = "DE30";
        List<String> symbols = new ArrayList<>();
        symbols.add("DE30");
        symbols.add("US30");
        symbols.add("W20");
        symbols.add("EU50");
        symbols.add("US100");
        symbols.add("UK100");
        HistoryServiceImpl historyService = new HistoryServiceImpl();
//-------------------------------Tests--------------------------------------------------------------
        //System.out.println(historyService.getTickPricesRecord(symbols,1594969800000L));//make a MAP???

//        System.out.println(historyService
//                .getOpenPricesRange("EURUSD",PERIOD_M1,1594969800000L,1595016000000L,0L));

        System.out.println(historyService
                .getOpenPricesRangeFormattedTime("EURUSD", PERIOD_M1, 1594969800000L, 1595016000000L, 0L));
    }
}

