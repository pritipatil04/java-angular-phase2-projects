package com.wipro.driver; 

 

import org.hibernate.Session; 

import org.hibernate.SessionFactory; 

import org.hibernate.Transaction; 

import org.hibernate.cfg.Configuration; 

 

import com.wipro.bean.Student; 

 

 

 

public class DriverUpdate { 

public static void main(String[] args) { 

 

 

Configuration cfg=new Configuration().configure().addAnnotatedClass(Student.class); 

SessionFactory sf=cfg.buildSessionFactory(); 

Session session=sf.openSession(); 

session.beginTransaction(); 

Student s=session.get(Student.class,1); 

if (s!=null) 

{ 

s.setName("Dilip"); 

s.setResult("Pass"); 

s.setMarks(89); 

session.update(s); 

System.out.println("Updated"); 

} 

else 

{ 

System.out.println("No such record"); 

} 

session.getTransaction().commit(); 

session.close(); 

 

} 

} 