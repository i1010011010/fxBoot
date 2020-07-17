package pl.fxboot.demo.service;

public interface DataService {

    Double getAskPrice(String symbol);

    Double getBidPrice(String symbol);

    Double getHighPrice(String symbol);

    Double getLowPrice(String symbol);

    Long getSymbolEpochTime(String symbol);

    String getSymbolDateTime(String symbol);


}
