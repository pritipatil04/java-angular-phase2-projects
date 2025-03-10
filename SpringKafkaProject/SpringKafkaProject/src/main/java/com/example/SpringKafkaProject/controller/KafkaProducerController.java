package com.example.SpringKafkaProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaProducerController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "test-topic";

    @PostMapping("/publish")
    public String publishMessage(@RequestParam String message) {
        kafkaTemplate.send(TOPIC, message);
        return "Message sent: " + message;
    }
}

