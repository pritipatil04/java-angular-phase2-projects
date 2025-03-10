package com.wipro.dao; 

 

import org.springframework.data.jpa.repository.JpaRepository; 

 

import com.wipro.model.Product; 

 

public interface ProductDAO extends JpaRepository<Product, Integer> { 

 

} 