package com.wipro.driver; 

import org.hibernate.Session; 

import org.hibernate.SessionFactory; 

import org.hibernate.Transaction; 

import org.hibernate.cfg.Configuration; 

 

import com.wipro.bean.Student; 


public class DriverSelect { 

public static void main(String[] args) { 

 

 

Configuration cfg=new Configuration().configure().addAnnotatedClass(Student.class); 

SessionFactory sf=cfg.buildSessionFactory(); 

Session session=sf.openSession(); 

System.out.println(session.get(Student.class,20)); 

 

} 

} 