  

package com.wipro.service; 

 

import java.util.List; 

import java.util.Optional; 

 

import org.springframework.beans.factory.annotation.Autowired; 

import org.springframework.stereotype.Service; 

 

import com.wipro.dao.ProductDAO; 

import com.wipro.model.Product; 

 

@Service 

public class ProductServiceImpl implements ProductService { 

@Autowired 

	ProductDAO dao; 

	@Override 
	
	public Product save(Product p) { 
	
	 
	
	return dao.save(p); 
	
	} 
	
	 
	
	@Override 
	
	public Optional<Product> getById(int id) { 
	
	 
	
	return dao.findById(id); 
	
	}  
	
	  
	
	@Override 
	
	public Product updateProduct(int id, Product p) { 
	
	Product oldProduct=dao.findById(id).get(); 
	
	if (oldProduct!=null) 
	
	{ 
	
	oldProduct.setPrice(p.getPrice()); 
	
	oldProduct.setProductName(p.getProductName()); 
	
	oldProduct.setQuantity(p.getQuantity()); 
	
	 
	
	return dao.save(oldProduct); 
	
	 
	
	} 
	
	else 
	
	return null; 
	
	} 
	
	 
	
	@Override 
	
	public void deleteById(int id) { 
	
	Product oldProduct=dao.findById(id).get(); 
	
	 
	
	if (oldProduct==null) 
	
	{ 
	
	System.out.println("No such record"); 
	
	} 
	
	else 
	
	dao.deleteById(id); 
	
	 
	
	} 
	
	 
	
	@Override 
	
	public List<Product> findAll() { 
	
	 
	
	return dao.findAll(); 
	
	} 

} 