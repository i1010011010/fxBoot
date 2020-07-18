package pl.fxboot.demo.service.auxiliaryservice;

import pl.fxboot.demo.serverconnection.ServerConnectionService;
import pro.xstore.api.message.command.APICommandFactory;
import pro.xstore.api.message.error.APICommandConstructionException;
import pro.xstore.api.message.error.APICommunicationException;
import pro.xstore.api.message.error.APIReplyParseException;
import pro.xstore.api.message.response.APIErrorResponse;
import pro.xstore.api.message.response.AllSymbolsResponse;
import pro.xstore.api.message.response.SymbolResponse;
import pro.xstore.api.message.response.TickPricesResponse;
import pro.xstore.api.streaming.StreamingListener;

import java.util.List;

public class ResponseService {
    private static TickPricesResponse tickPricesResponse;
    private static SymbolResponse symbolResponse;
    private static AllSymbolsResponse allSymbolsResponse;
    private static ServerConnectionService service = new ServerConnectionService();

    public static TickPricesResponse  getTickPricesResponse(List<String> symbols,Long timestamp) {
        try {
            tickPricesResponse = APICommandFactory.executeTickPricesCommand(service.establishConnection(),0L,symbols,timestamp);
        } catch (APICommandConstructionException | APICommunicationException | APIErrorResponse | APIReplyParseException e) {
            e.printStackTrace();
        }
        return tickPricesResponse;
    }

    public static AllSymbolsResponse  getAllSymbolsResponse() {

        try {
            allSymbolsResponse = APICommandFactory.executeAllSymbolsCommand(service.establishConnection());
        } catch (APICommandConstructionException | APICommunicationException | APIErrorResponse | APIReplyParseException e) {
            e.printStackTrace();
        }
        return allSymbolsResponse;
    }

     public static SymbolResponse getSymbolResponse(String symbol) {
        try {
            symbolResponse = APICommandFactory.executeSymbolCommand(service.establishConnection(), symbol);
        } catch (APICommandConstructionException | APICommunicationException | APIErrorResponse | APIReplyParseException e) {
            e.printStackTrace();
        }
        return symbolResponse;
    }
    public static void getStreamResponse(String symbol, StreamingListener listener) {
        try {
            service.establishStreamConnection(listener).subscribePrice(symbol);
        } catch (APICommunicationException e) {
            e.printStackTrace();
        }
    }
}
