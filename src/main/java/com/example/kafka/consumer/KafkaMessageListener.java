package com.example.kafka.consumer;

import com.example.kafka.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

//    @Value("${kafka-topic-name}")
    final String topicName = "kafka-topic-sample";

    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = topicName, groupId = "kafka-consumer1")
    public void consumeEvent(Employee employee) {
        log.info("Consumer1 consumed event = {}", employee);
    }

//    @KafkaListener(topics = topicName, groupId = "kafka-consumer1")
//    public void consume2(String message) {
//        log.info("Consumer2 consumed message = {}", message);
//    }
//
//    @KafkaListener(topics = topicName, groupId = "kafka-consumer1")
//    public void consume3(String message) {
//        log.info("Consumer3 consumed message = {}", message);
//    }
//
//    @KafkaListener(topics = topicName, groupId = "kafka-consumer1")
//    public void consume4(String message) {
//        log.info("Consumer4 consumed message = {}", message);
//    }
}
