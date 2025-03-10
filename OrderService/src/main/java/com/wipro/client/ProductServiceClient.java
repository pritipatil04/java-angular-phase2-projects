package com.wipro.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@FeignClient(name = "product-service")
public interface ProductServiceClient {
    @GetMapping("/products/{id}")
    @CircuitBreaker(name = "productService", fallbackMethod = "fallbackGetProduct")
    Product getProduct(@PathVariable Long id);

    default Product fallbackGetProduct(Long id, Throwable throwable) {
        return new Product(id, "Default Product", "Unknown Category");
    }
}
