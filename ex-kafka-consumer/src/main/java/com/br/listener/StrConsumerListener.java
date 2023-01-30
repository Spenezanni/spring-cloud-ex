package com.br.listener;

import com.br.custom.StrConsumerCustomListener;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StrConsumerListener {

//    @KafkaListener(groupId = "group-1",
//            topicPartitions = {
//            @TopicPartition( topic = "proj-ex-topic", partitions = {"0"}) },
//            containerFactory = "strContainerFactory")
//    public void create(String message){
//       log.info("CREATE ::: Receive message {}", message);
//    }

//    @KafkaListener(groupId = "group-1",
//            topicPartitions = {
//            @TopicPartition( topic = "proj-ex-topic", partitions = {"1"}) },
//            containerFactory = "strContainerFactory")
//    public void log(String message){
//        log.info("LOG ::: Receive message {}", message);
//    }

//    @KafkaListener(groupId = "group-2", topics = "proj-ex-topic", containerFactory = "strContainerFactory")
//    public void history(String message){
//        log.info("HISTORY :::: Receive message {}", message);
//    }

    @StrConsumerCustomListener(groupId = "group-1")
    public void create(String message){
        log.info("CREATE ::: Receive message {}", message);
    }
    @StrConsumerCustomListener(groupId = "group-1")
    public void log(String message){
        log.info("LOG ::: Receive message {}", message);
    }
    @StrConsumerCustomListener(groupId = "group-2")
    public void history(String message){
        log.info("HISTORY :::: Receive message {}", message);
    }
}
