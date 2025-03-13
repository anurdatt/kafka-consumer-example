package com.example.kafka_consumer_example.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "kafka-topic2", groupId = "kafka-consumer2")
    public void consume1(String message) {
        log.info("Consumer1 consumed message = {}", message);
    }

    @KafkaListener(topics = "kafka-topic2", groupId = "kafka-consumer2")
    public void consume2(String message) {
        log.info("Consumer2 consumed message = {}", message);
    }

    @KafkaListener(topics = "kafka-topic2", groupId = "kafka-consumer2")
    public void consume3(String message) {
        log.info("Consumer3 consumed message = {}", message);
    }

    @KafkaListener(topics = "kafka-topic2", groupId = "kafka-consumer2")
    public void consume4(String message) {
        log.info("Consumer4 consumed message = {}", message);
    }
}
