package com.demo.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {
    @KafkaListener(topics = "food-orders", groupId = "food-order-group")
    public void consume(String message) {
        System.out.println("Processing Order: " + message);
    }
}

