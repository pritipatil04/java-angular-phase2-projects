package com.wipro.controller;

import org.springframework.web.bind.annotation.*;

import com.wipro.client.Product;
import com.wipro.client.ProductServiceClient;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final ProductServiceClient productServiceClient;
    public OrderController(ProductServiceClient productServiceClient) {
        this.productServiceClient = productServiceClient;
    }

    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable Long id) {
        return productServiceClient.getProduct(id);
    }
}
