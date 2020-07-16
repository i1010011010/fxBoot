package pl.fxboot.demo.service;

import pro.xstore.api.message.records.STickRecord;
import pro.xstore.api.streaming.StreamingListener;

public class StreamingListenerImpl extends StreamingListener {

    @Override
    public void receiveTickRecord(STickRecord tickRecord) {
        if (tickRecord.getLevel() == 0) {
            Double streamAskPrice = tickRecord.getAsk();
            System.out.println("Ask -> " + streamAskPrice);
        }
    }




}

//    ?????????????????????????????
//    public void receiveTickBidRecord(STickRecord tickRecord) {
//        if(tickRecord.getLevel()==0){
//            Double streamBidPrice = tickRecord.getBid();
//            System.out.println(streamBidPrice);
//        }
//    }

