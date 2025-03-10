package com.wipro.util; 

 

import org.hibernate.SessionFactory; 

import org.hibernate.cfg.Configuration; 

 

import com.wipro.bean.Emp; 

 

public class DBUtil { 

 

static SessionFactory sf=null; 

 

public static SessionFactory getSessionFactory() 

{ 

sf=new Configuration() 

.configure("hibernate.cfg.xml") 

.addAnnotatedClass(Emp.class) 

.buildSessionFactory(); 

return sf; 

} 

 

 

 

} 