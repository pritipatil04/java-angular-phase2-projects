package com.demo.controller;

import com.demo.kafka.OrderProducer;
import com.demo.model.Order;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderProducer orderProducer;

    public OrderController(OrderProducer orderProducer) {
        this.orderProducer = orderProducer;
    }

    @PostMapping("/place")
    public String placeOrder(@RequestBody Order order) {
        String message = "New Order: " + order.getCustomerName() + " ordered " + order.getFoodItem();
        orderProducer.sendOrder(message);
        return "Order placed successfully!";
    }
}
