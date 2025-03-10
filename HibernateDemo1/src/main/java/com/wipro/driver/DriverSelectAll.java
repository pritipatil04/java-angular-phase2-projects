package com.wipro.driver; 
import java.util.List; 

import org.hibernate.Session; 

import org.hibernate.SessionFactory; 

import org.hibernate.cfg.Configuration; 

 

import com.wipro.bean.Student; 


public class DriverSelectAll { 

public static void main(String[] args) { 

Configuration cfg=new Configuration().configure().addAnnotatedClass(Student.class); 

SessionFactory sf=cfg.buildSessionFactory(); 

Session session=sf.openSession(); 

List<Student> list=session.createQuery("from Student").list();  

list.stream().forEach(System.out::println); 

session.close(); 

 

} 

} 
