package pl.fxboot.demo.service;

import org.springframework.stereotype.Service;
import pl.fxboot.demo.serverconnection.ServerConnectionService;
import pro.xstore.api.message.command.APICommandFactory;
import pro.xstore.api.message.error.APICommandConstructionException;
import pro.xstore.api.message.error.APICommunicationException;
import pro.xstore.api.message.error.APIReplyParseException;
import pro.xstore.api.message.response.APIErrorResponse;
import pro.xstore.api.message.response.SymbolResponse;

import java.time.*;
@Service
public class DataServiceImpl implements DataService {
    private ServerConnectionService service = new ServerConnectionService();

    @Override
    public Double getAskPrice(String symbol) {
        Double askPrice = 0D;
        try {
            SymbolResponse symbolResponse = APICommandFactory.executeSymbolCommand(service.establishConnection(), symbol);
            askPrice = symbolResponse.getSymbol().getAsk();
        } catch (APICommandConstructionException | APICommunicationException | APIErrorResponse | APIReplyParseException e) {
            e.printStackTrace();
        }
        return askPrice;
    }

    @Override
    public Double getBidPrice(String symbol) {
        Double bidPrice = 0D;

        try {
            SymbolResponse symbolResponse = APICommandFactory.executeSymbolCommand(service.establishConnection(), symbol);
            bidPrice = symbolResponse.getSymbol().getBid();
        } catch (APICommandConstructionException | APICommunicationException | APIErrorResponse | APIReplyParseException e) {
            e.printStackTrace();
        }
        return bidPrice;
    }

    @Override
    public Double getHighPrice(String symbol) {
        Double highPrice = 0D;

        try {
            SymbolResponse symbolResponse = APICommandFactory.executeSymbolCommand(service.establishConnection(), symbol);
            highPrice = symbolResponse.getSymbol().getHigh();
        } catch (APICommandConstructionException | APICommunicationException | APIErrorResponse | APIReplyParseException e) {
            e.printStackTrace();
        }
        return highPrice;

    }

    @Override
    public Double getLowPrice(String symbol) {
        Double lowPrice = 0D;

        try {
            SymbolResponse symbolResponse = APICommandFactory.executeSymbolCommand(service.establishConnection(), symbol);
            lowPrice = symbolResponse.getSymbol().getLow();
        } catch (APICommandConstructionException | APICommunicationException | APIErrorResponse | APIReplyParseException e) {
            e.printStackTrace();
        }
        return lowPrice;

    }

    @Override
    public Long getSymbolEpochTime(String symbol) {
        Long symbolEpochTime = 0L;
        try {
            SymbolResponse symbolResponse = APICommandFactory.executeSymbolCommand(service.establishConnection(), symbol);
            symbolEpochTime = symbolResponse.getSymbol().getTime();
        } catch (APICommandConstructionException | APICommunicationException | APIErrorResponse | APIReplyParseException e) {
            e.printStackTrace();
        }
        return symbolEpochTime;
    }

    @Override
    public String getSymbolDateTime(String symbol) {
        String readableDate = "";
        try {
            SymbolResponse symbolResponse = APICommandFactory.executeSymbolCommand(service.establishConnection(), symbol);
            Long symbolEpochTime = symbolResponse.getSymbol().getTime();
            readableDate = Instant
                    .ofEpochMilli(symbolEpochTime)
                    .atZone(ZoneId.systemDefault())
                    .toLocalDateTime().toString();
        } catch (APICommandConstructionException | APICommunicationException | APIErrorResponse | APIReplyParseException e) {
            e.printStackTrace();
        }
        return readableDate;
    }
}
