package com.srivalligade04.src.kafkaapplication.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${spring.kafka.app.topic}")
    private String topic;

    public void produce(String message) {
        kafkaTemplate.send(topic, message);
    }

}
