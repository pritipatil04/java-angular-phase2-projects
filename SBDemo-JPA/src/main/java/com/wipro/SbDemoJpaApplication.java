package com.wipro; 

 

import org.springframework.beans.factory.annotation.Autowired; 

import org.springframework.boot.CommandLineRunner; 

import org.springframework.boot.SpringApplication; 

import org.springframework.boot.autoconfigure.SpringBootApplication; 

 

import com.wipro.model.Product; 

import com.wipro.service.ProductService; 

 

@SpringBootApplication 

public class SbDemoJpaApplication implements CommandLineRunner{ 

@Autowired 

ProductService service; 

public static void main(String[] args) { 

SpringApplication.run(SbDemoJpaApplication.class, args); 

} 

 

@Override 

public void run(String... args) throws Exception { 

/* 

 * service.save(new Product("Laptop",78000,25)); service.save(new 

 * Product("Mobile",34000,15)); service.save(new Product("IPad",45000,35)); 

 * service.save(new Product("Fridge",35000,12)); service.save(new 

 * Product("HeadPhones",8000,8)); 

 */ 

//service.findAll().stream().forEach(System.out::println); 

//service.deleteById(2); 

//service.updateProduct(1,new Product("Laptop",100000,11)); 

//System.out.println(service.getById(1)); 

} 

 

} 