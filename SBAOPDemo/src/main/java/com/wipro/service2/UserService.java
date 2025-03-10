package com.wipro.service2;

import java.util.ArrayList; 

import java.util.List; 

import java.util.Optional; 

 

import org.springframework.stereotype.Component; 

 

@Component 

public class UserService { 

 

List<Emp> list=new ArrayList<Emp>(); 

public UserService() { 

 

list.add(new Emp("John",1)); 

list.add(new Emp("Peter",2)); 

list.add(new Emp("Sam",3)); 

list.add(new Emp("Neil",4)); 

list.add(new Emp("Viren",5)); 

 

} 

 

public Emp getUserById(int id) 

{ 

Optional<Emp> optional=list.stream().filter(x->x.id==id).findFirst(); 

if (optional.isPresent()) 

return optional.get(); 

else 

return null; 

 

} 

public void display() { 

try { 

Thread.sleep(10000); 

} catch (InterruptedException e) { 

// TODO Auto-generated catch block 

e.printStackTrace(); 

} 

System.out.println("From UserService - display method"); 

} 

} 
