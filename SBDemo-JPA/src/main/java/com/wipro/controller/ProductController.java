package com.wipro.controller; 

 

import java.util.List; 

import java.util.Optional; 

 

import org.springframework.beans.factory.annotation.Autowired; 

import org.springframework.stereotype.Controller; 

import org.springframework.ui.Model; 

import org.springframework.web.bind.annotation.ModelAttribute; 

import org.springframework.web.bind.annotation.PathVariable; 

import org.springframework.web.bind.annotation.RequestMapping; 

 

import com.wipro.model.Product; 

import com.wipro.service.ProductService; 

 

@Controller 

 

public class ProductController { 

@Autowired 

ProductService service; 

 

 

@RequestMapping("/showProductForm") 

public String showProductForm(Model m) 

{ 

 

m.addAttribute("product",new Product()); 

m.addAttribute("message", "Add New Product"); 

return "addproduct"; 

} 

 

@RequestMapping("/addProduct") 

public String addProduct(@ModelAttribute ("product")Product p) 

{ 

System.out.println("***"+p); 

Optional<Product> oldProduct=service.getById(p.getPid()); 

if (oldProduct.isPresent()) 

service.updateProduct(p.getPid(), p); 

 

else 

service.save(p); 

return "redirect:/"; 

} 

@RequestMapping("/") 

public String showAllProducts(Model m) 

{ 

List<Product> list=service.findAll(); 

m.addAttribute("products",list); 

return "main"; 

} 

 

@RequestMapping("/deleteProduct/{id}") 

public String deleteProducts(@PathVariable ("id") int id) 

{ 

System.out.println(id+"***********"); 

service.deleteById(id); 

return "redirect:/"; 

} 

 

@RequestMapping("/updateProduct/{id}") 

public String updateProducts(@PathVariable ("id") int id,Model m) 

{ 

Product p=service.getById(id).get(); 

m.addAttribute("product",p); 

m.addAttribute("message", "Update Product"); 

return "addproduct"; 

} 

  

} 

 