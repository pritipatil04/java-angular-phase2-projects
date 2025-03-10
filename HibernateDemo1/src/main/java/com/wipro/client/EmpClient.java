package com.wipro.client; 

 

import java.util.List; 

import java.util.Scanner; 

 

import com.wipro.bean.Emp; 

import com.wipro.service.EmpService; 

 

public class EmpClient { 

public static void main(String[] args) { 

EmpService service=new EmpService(); 

Scanner sc=new Scanner(System.in); 

String ans=""; 

do { 

System.out.println("1.Create New Employee\n2.Delete Employee"); 

System.out.println("3.Update Employee\n4.Select Employee By Id\n5.Select All Employees\n6.Exit"); 

System.out.println("Enter your choice"); 

int choice=sc.nextInt(); 

String name=""; 

int salary=0; 

String designation=""; 

switch(choice) 

{ 

case 1: 

System.out.println("Enter employees name,salary and designation"); 

service.createEmp(new Emp(sc.next(),sc.nextInt(),sc.next())); 

break; 

case 2: 

System.out.println("Enter employee id to be deleted"); 

service.deleteEmp(sc.nextInt()); 

break; 

case 3: 

System.out.println("Enter employee id to be updated"); 

int id=sc.nextInt(); 

System.out.println("Enter employees name,salary and designation that needs to be updated"); 

service.updateEmp(id, new Emp(sc.next(),sc.nextInt(),sc.next())); 

break; 

case 4: 

System.out.println("Enter employee id to be selected"); 

service.getEmployeeById(sc.nextInt()); 

break; 

case 5: 

List<Emp> list=service.getEmployees(); 

if (list!=null) 

list.stream().forEach(System.out::println); 

break; 

case 6: 

System.exit(0); 

break; 

default: 

System.out.println("Invalid choice"); 

 

} 

System.out.println("Do you want to continue(yes/no)"); 

ans=sc.next(); 

}while(ans.equalsIgnoreCase("yes")); 

 

} 

} 