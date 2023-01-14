package com.srivalligade04.src.kafkaapplication.controller;


import com.srivalligade04.src.kafkaapplication.service.KafkaConsumer;
import com.srivalligade04.src.kafkaapplication.service.KafkaProducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class KafkaController {
    @Autowired
    private KafkaConsumer consumer;
    
    @Autowired
    private KafkaProducer producer;

    @RequestMapping(value = "rest/send",method = RequestMethod.POST)
    public void send(@RequestBody String data) {
       producer.produce(data);
    }
    
    @GetMapping("rest/receive")
    public List<String> receive() {
        return consumer.messages;
    }

}
