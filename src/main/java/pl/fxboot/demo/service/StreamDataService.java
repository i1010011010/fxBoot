package pl.fxboot.demo.service;

public interface StreamDataService {

    void getStreamAskPrice(String symbol);
    void getStreamBidPrice(String symbol);
    void getSymbolTimestamp(String symbol);
    void getSymbolTimestampFormatted(String symbol);


}
