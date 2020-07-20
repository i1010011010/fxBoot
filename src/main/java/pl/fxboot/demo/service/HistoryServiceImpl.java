package pl.fxboot.demo.service;

import org.springframework.stereotype.Service;
import pl.fxboot.demo.service.auxiliaryservice.ResponseService;
import pl.fxboot.demo.service.interfaces.HistoryService;
import pro.xstore.api.message.codes.PERIOD_CODE;
import pro.xstore.api.message.records.RateInfoRecord;
import pro.xstore.api.message.records.TickRecord;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

@Service
public class HistoryServiceImpl implements HistoryService {

    public List<Double> getTickPricesRecord(List<String> symbols, Long timestamp) {
        List<Double> tickList = new ArrayList<>();
        for (TickRecord record : ResponseService.getTickPricesResponse(symbols, timestamp).getTicks()) {
            tickList.add(record.getAsk());
        }
        return tickList;
    }

    public Map<Long, Double> getOpenPricesRange(String symbol, PERIOD_CODE code, Long start, Long end, Long ticks) {
        Map<Long, Double> recordMap = new HashMap<>();
        for (RateInfoRecord rateInfoRecord : ResponseService.getChartRangeResponse(symbol, code, start, end, ticks).getRateInfos()) {
            recordMap.put(rateInfoRecord.getCtm(), rateInfoRecord.getOpen());
        }
        Map<Long, Double> sortedMap = new TreeMap<>();
        sortedMap.putAll(recordMap);
        for (Map.Entry<Long, Double> entry : sortedMap.entrySet()) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    @Override
    public Map<String, Double> getOpenPricesRangeFormattedTime(String symbol, PERIOD_CODE code, Long start, Long end, Long ticks) {
        Map<String, Double> recordMap = new HashMap<>();
        for (RateInfoRecord rateInfoRecord : ResponseService
                .getChartRangeResponse(symbol, code, start, end, ticks)
                .getRateInfos()) {
            String readableDate;
            readableDate = Instant
                    .ofEpochMilli(rateInfoRecord.getCtm())
                    .atZone(ZoneId.systemDefault())
                    .toLocalDateTime().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
            recordMap.put(readableDate, rateInfoRecord.getOpen());
        }
        Map<String, Double> sortedMap = new TreeMap<>();
        sortedMap.putAll(recordMap);
        for (Map.Entry<String, Double> entry : sortedMap.entrySet()) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    @Override
    public List<Double> testGetOpenPricesRange() {
        List<Double> openPricesList = new ArrayList<>();
        for (RateInfoRecord record : ResponseService
                .getChartRangeResponse("EURUSD", PERIOD_CODE.PERIOD_M1, 1592604000000L, 1595016000000L, 0L).getRateInfos()) {
            openPricesList.add(record.getOpen());
        }
        return openPricesList;
    }

    @Override
    public List<Long> testGetPricesTimeRange() {
        List<Long> pricesTimeList = new ArrayList<>();
        for (RateInfoRecord record : ResponseService
                .getChartRangeResponse("EURUSD", PERIOD_CODE.PERIOD_M1, 1592604000000L, 1595016000000L, 0L).getRateInfos()) {
            pricesTimeList.add(record.getCtm());
        }
        return pricesTimeList;
    }
}
