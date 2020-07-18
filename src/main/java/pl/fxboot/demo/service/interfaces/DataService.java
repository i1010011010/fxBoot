package pl.fxboot.demo.service.interfaces;

public interface DataService {

    String getSymbolName(String symbol);

    Double getAskPrice(String symbol);

    Double getBidPrice(String symbol);

    String getCategoryName(String symbol)
            ;
    Long getContractSize(String symbol);

    String getSymbolCurrency(String symbol);

    Boolean getSymbolCurrencyPair(String symbol);

    String getDescription(String symbol);

    Long getExpiration(String symbol);

    String getGroupName (String symbol);

    Double getHighPrice(String symbol);

    Double getLowPrice(String symbol);

    Long getSymbolEpochTime(String symbol);

    String getSymbolDateTime(String symbol);


}
