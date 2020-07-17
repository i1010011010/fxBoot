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
    private SymbolResponse response;
    private ServerConnectionService service = new ServerConnectionService();

    @Override
    public Double getAskPrice(String symbol) {
        Double askPrice;
        askPrice =  getResponse(symbol).getSymbol().getAsk();
        return askPrice;
    }

    @Override
    public Double getBidPrice(String symbol) {
        Double bidPrice;
        bidPrice = getResponse(symbol).getSymbol().getBid();
        return bidPrice;
    }

    @Override
    public Double getHighPrice(String symbol) {
        Double highPrice;
        highPrice = getResponse(symbol).getSymbol().getHigh();
        return highPrice;
    }

    @Override
    public Double getLowPrice(String symbol) {
        Double lowPrice;
        lowPrice = getResponse(symbol).getSymbol().getLow();
        return lowPrice;

    }

    @Override
    public Long getSymbolEpochTime(String symbol) {
        Long symbolEpochTime;
        symbolEpochTime = getResponse(symbol).getSymbol().getTime();
        return symbolEpochTime;
    }

    @Override
    public String getSymbolDateTime(String symbol) {
        String readableDate;
        Long symbolEpochTime = getResponse(symbol).getSymbol().getTime();
        readableDate = Instant
                .ofEpochMilli(symbolEpochTime)
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime().toString();
        return readableDate;
    }
    //auxiliary method
    private SymbolResponse getResponse(String symbol){
        try {
            response = APICommandFactory.executeSymbolCommand(service.establishConnection(),symbol);
        } catch (APICommandConstructionException | APICommunicationException | APIErrorResponse | APIReplyParseException e) {
            e.printStackTrace();
        }
        return response;
    }
}
