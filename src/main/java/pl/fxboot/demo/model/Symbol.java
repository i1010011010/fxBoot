package pl.fxboot.demo.model;

public class Symbol {

    private String symbol;

    private Double askPrice;

    private Double bidPrice;


    public Symbol() {
    }

    public Symbol(String symbol, Double askPrice, Double bidPrice) {
        this.symbol = symbol;
        this.askPrice = askPrice;
        this.bidPrice = bidPrice;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Double getAskPrice() {
        return askPrice;
    }

    public void setAskPrice(Double askPrice) {
        this.askPrice = askPrice;
    }

    public Double getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(Double bidPrice) {
        this.bidPrice = bidPrice;
    }

    @Override
    public String toString() {
        return getSymbol() + " ->" + " Ask -> "+getAskPrice() + " Bid ->" + bidPrice + " || ";
    }
}
