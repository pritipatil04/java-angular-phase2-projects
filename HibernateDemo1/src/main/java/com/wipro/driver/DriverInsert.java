package com.wipro.driver; 

 

import org.hibernate.Session; 

import org.hibernate.SessionFactory; 

import org.hibernate.Transaction; 

import org.hibernate.cfg.Configuration; 

 

import com.wipro.bean.Student; 

 

 

 

public class DriverInsert { 

public static void main(String[] args) { 

 

 

Configuration cfg=new Configuration().configure().addAnnotatedClass(Student.class); 

SessionFactory sf=cfg.buildSessionFactory(); 

Session session=sf.openSession(); 

Transaction tx=session.beginTransaction(); 

Student s1=new Student("David",76,"Pass"); 

session.save(s1); 

tx.commit(); 

} 

} 
