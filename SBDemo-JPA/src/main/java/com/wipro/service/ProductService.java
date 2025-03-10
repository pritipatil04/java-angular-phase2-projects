package com.wipro.service; 

 

import java.util.List; 

import java.util.Optional; 

 

import com.wipro.model.Product; 

 

public interface ProductService { 

Product save(Product p); 

Optional<Product> getById(int id); 

Product updateProduct(int id, Product p); 

void deleteById(int id); 

List<Product> findAll(); 

} 