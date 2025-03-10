package com.wipro.dao; 

 

import java.util.ArrayList; 

import java.util.List; 

 

import org.hibernate.Session; 

import org.hibernate.Transaction; 

 

import com.wipro.bean.Emp; 

import com.wipro.util.DBUtil; 

 

public class EmpDAO { 

 

public void createEmp(Emp e) { 

	Transaction transaction = null; 
	
	try (Session session = DBUtil.getSessionFactory().openSession()) { 
	
	transaction = session.beginTransaction(); 
	
	session.persist(e); // Use persist() instead of save() 
	
	transaction.commit(); 
	
	System.out.println("Employee saved in database"); 
	
	} catch (Exception ex) { 
	
	if (transaction != null) { 
	
	transaction.rollback(); 
	
	} 
	
	ex.printStackTrace(); 
	
	} 

} 

 

public void deleteEmp(int id) { 

	Transaction transaction = null; 
	
	try (Session session = DBUtil.getSessionFactory().openSession();) { 
	
	transaction = session.beginTransaction(); 
	
	Emp e = session.get(Emp.class, id); 
	
	if (e != null) { 
	
	session.remove(e); 
	
	session.getTransaction().commit(); 
	
	System.out.println("Employee deleted"); 
	
	} else 
	
	System.out.println("No such record"); 
	
	 
	
	} catch (Exception ex) { 
	
	if (transaction != null) { 
	
	transaction.rollback(); 
	
	} 
	
	ex.printStackTrace(); 
	
	} 

} 

 

public void updateEmp(int id, Emp newEmp) 

{ 

	try(Session session = DBUtil.getSessionFactory().openSession();){ 
	
	session.beginTransaction(); 
	
	Emp oldEmp=session.get(Emp.class,id); 
	
	if (oldEmp!=null) 
	
	{ 
	
	oldEmp.setDesignation(newEmp.getDesignation()); 
	
	oldEmp.setName(newEmp.getName()); 
	
	oldEmp.setSalary(newEmp.getSalary()); 
	
	session.merge(oldEmp); 
	
	System.out.println("Employee updated"); 
	
	} 
	
	else 
	
	System.out.println("No such record"); 
	
	session.getTransaction().commit(); 
	
	
	
	} 

} 

 

 

public Emp getEmployeeById(int id) { 

    Emp e = null; 

    try (Session session = DBUtil.getSessionFactory().openSession()) { 

        e = session.get(Emp.class, id); // Fetch employee by ID 

        if (e == null) { 

            System.out.println("No such record found."); 

        } else { 

            System.out.println(e); 

        } 

    } catch (Exception ex) { 

        ex.printStackTrace(); // Log the error 

    } 

    return e; 

} 

 

 

public List<Emp> getEmployees() { 

    List<Emp> list = new ArrayList<>(); // Initialize to avoid returning null 

    try (Session session = DBUtil.getSessionFactory().openSession()) { 

        list = session.createQuery("from Emp", Emp.class).list(); 

    } catch (Exception ex) { 

        ex.printStackTrace(); // Log the error 

    } 

    return list; // Always returns a non-null list 

} 

 

 

} 