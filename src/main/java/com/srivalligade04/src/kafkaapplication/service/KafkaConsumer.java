package com.srivalligade04.src.kafkaapplication.service;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KafkaConsumer {
    
    @Value("${spring.kafka.app.topic}")
    private String topic;
    
    public static List<String> messages = new ArrayList<>();

    private final static String groupId = "kafkaGroup";

    @KafkaListener(topics = topic, groupId = groupId)
    public void listen(String message) {
        messages.add(message);
    }
}
