package pl.fxboot.demo.service;

import org.springframework.stereotype.Service;
import pl.fxboot.demo.service.auxiliaryservice.ResponseService;
import pl.fxboot.demo.service.interfaces.DataService;

import java.time.*;

public class DataServiceImpl implements DataService {

    @Override
    public String getSymbolName(String symbol) {
        return ResponseService.getSymbolResponse(symbol).getSymbol().getSymbol();
    }

    @Override
    public Double getAskPrice(String symbol) {
        Double askPrice;
        askPrice = ResponseService.getSymbolResponse(symbol).getSymbol().getAsk();
        return askPrice;
    }

    @Override
    public Double getBidPrice(String symbol) {
        Double bidPrice;
        bidPrice = ResponseService.getSymbolResponse(symbol).getSymbol().getBid();
        return bidPrice;
    }

    @Override
    public String getCategoryName(String symbol) {
        return ResponseService.getSymbolResponse(symbol).getSymbol().getCategoryName();
    }

    @Override
    public Long getContractSize(String symbol) {
        return ResponseService.getSymbolResponse(symbol).getSymbol().getContractSize();
    }

    @Override
    public String getSymbolCurrency(String symbol) {
        return ResponseService.getSymbolResponse(symbol).getSymbol().getCurrency();
    }

    @Override
    public Boolean getSymbolCurrencyPair(String symbol) {
        return ResponseService.getSymbolResponse(symbol).getSymbol().isCurrencyPair();
    }

    @Override
    public String getDescription(String symbol) {
        return ResponseService.getSymbolResponse(symbol).getSymbol().getDescription();
    }

    @Override
    public Long getExpiration(String symbol) {
        Long expiration = ResponseService.getSymbolResponse(symbol).getSymbol().getExpiration();
        if (expiration == null) {
            return 0L;
        }
        return expiration;
    }

    @Override
    public String getGroupName(String symbol) {
        return ResponseService.getSymbolResponse(symbol).getSymbol().getGroupName();
    }

    @Override
    public Double getHighPrice(String symbol) {
        Double highPrice;
        highPrice = ResponseService.getSymbolResponse(symbol).getSymbol().getHigh();
        return highPrice;
    }

    @Override
    public Double getLowPrice(String symbol) {
        Double lowPrice;
        lowPrice = ResponseService.getSymbolResponse(symbol).getSymbol().getLow();
        return lowPrice;
    }

    @Override
    public Long getSymbolEpochTime(String symbol) {
        return ResponseService.getSymbolResponse(symbol).getSymbol().getTime();
    }

    @Override
    public String getSymbolDateTime(String symbol) {
        String readableDate;
        Long symbolEpochTime = ResponseService.getSymbolResponse(symbol).getSymbol().getTime();
        readableDate = Instant
                .ofEpochMilli(symbolEpochTime)
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime().toString();
        return readableDate;
    }
}
