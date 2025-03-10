package com.wipro.model; 

 

import jakarta.persistence.Entity; 

import jakarta.persistence.GeneratedValue; 

import jakarta.persistence.GenerationType; 

import jakarta.persistence.Id; 

import lombok.Data; 

import lombok.NoArgsConstructor; 

 

@Entity 

@Data 

@NoArgsConstructor 

public class Product { 

@Id 

@GeneratedValue(strategy = GenerationType.IDENTITY) 

int pid; 

String productName; 

int price; 

int quantity; 

public Product(String productName, int price, int quantity) { 

super(); 

this.productName = productName; 

this.price = price; 

this.quantity = quantity; 

} 

 

} 