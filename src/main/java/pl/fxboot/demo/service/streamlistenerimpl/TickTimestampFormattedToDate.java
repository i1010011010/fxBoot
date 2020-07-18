package pl.fxboot.demo.service.streamlistenerimpl;

import pro.xstore.api.message.records.STickRecord;
import pro.xstore.api.streaming.StreamingListener;

import java.time.Instant;
import java.time.ZoneId;

public class TickTimestampFormattedToDate extends StreamingListener {
    @Override
    public void receiveTickRecord(STickRecord tickRecord) {
        if(tickRecord.getLevel()==0){
            String readableDate;
            Long epochTime = tickRecord.getTimestamp();
            readableDate = Instant
                    .ofEpochMilli(epochTime)
                    .atZone(ZoneId.systemDefault())
                    .toLocalDateTime().toString();
            System.out.println(readableDate);
        }
    }
}
