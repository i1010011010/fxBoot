package pl.fxboot.demo.streamlistenerimpl;

import pl.fxboot.demo.serverconnection.ServerConnectionService;
import pro.xstore.api.message.error.APICommunicationException;
import pro.xstore.api.message.records.STickRecord;
import pro.xstore.api.streaming.StreamingListener;
import pro.xstore.api.sync.SyncAPIConnector;

public class TickAsk extends StreamingListener {
    @Override
    public void receiveTickRecord(STickRecord tickRecord) {
        if(tickRecord.getLevel()==0){
            System.out.println(tickRecord.getAsk());
        }
    }
}
