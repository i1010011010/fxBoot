package pl.fxboot.demo.service.interfaces;

import pro.xstore.api.message.codes.PERIOD_CODE;

import java.util.List;
import java.util.Map;

public interface HistoryService {

    List<Double> getTickPricesRecord(List<String> symbols, Long timestamp);

    Map<Long, Double> getOpenPricesRange(String symbol, PERIOD_CODE code, Long start, Long end, Long ticks);

    Map<String, Double> getOpenPricesRangeFormattedTime(String symbol, PERIOD_CODE code, Long start, Long end, Long ticks);
}
