 

package com.wipro; 

 

import org.springframework.beans.factory.annotation.Autowired; 

import org.springframework.boot.CommandLineRunner; 

import org.springframework.boot.SpringApplication; 

import org.springframework.boot.autoconfigure.SpringBootApplication; 

import org.springframework.context.annotation.EnableAspectJAutoProxy; 

 

import com.wipro.service.Class1; 

import com.wipro.service.Class2; 

import com.wipro.service.PaymentService; 

import com.wipro.service2.UserService; 

 

@SpringBootApplication 

@EnableAspectJAutoProxy 

public class SbaopDemoApplication implements CommandLineRunner{ 

@Autowired 

Class1 c1; 

 

@Autowired 

Class2 c2; 

 

@Autowired 

UserService service; 

 

@Autowired 

PaymentService pservice; 

public static void main(String[] args) { 

SpringApplication.run(SbaopDemoApplication.class, args); 

} 

 

@Override 

public void run(String... args) throws Exception { 

try { 

pservice.doPayment(10000.0); 

}catch(Exception e) {} 

} 

 

} 