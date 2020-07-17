package pl.fxboot.demo.streamlistenerimpl;

import pro.xstore.api.message.records.STickRecord;
import pro.xstore.api.streaming.StreamingListener;

public class TickBid extends StreamingListener {
    @Override
    public void receiveTickRecord(STickRecord tickRecord) {
        if(tickRecord.getLevel()==0){
            System.out.println(tickRecord.getBid());
        }
    }
}
