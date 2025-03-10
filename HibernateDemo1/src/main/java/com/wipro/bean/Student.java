package com.wipro.bean; 

 

import jakarta.persistence.Column; 

import jakarta.persistence.Entity; 

import jakarta.persistence.GeneratedValue; 

import jakarta.persistence.GenerationType; 

import jakarta.persistence.Id; 

import jakarta.persistence.Table; 

 

@Entity 

@Table(name = "students") 

public class Student { 

@Id 

@Column(name = "student_id") 

@GeneratedValue(strategy = GenerationType.IDENTITY) 

int sid; 

@Column(name = "student_name") 

String name; 

int marks; 

String result; 

@Override 

public String toString() { 

return "Student [sid=" + sid + ", name=" + name + ", marks=" + marks + ", result=" + result + "]"; 

} 

public Student() { 

super(); 

// TODO Auto-generated constructor stub 

} 

public Student(int sid, String name, int marks, String result) { 

super(); 

this.sid = sid; 

this.name = name; 

this.marks = marks; 

this.result = result; 

} 

public Student(String name, int marks, String result) { 

super(); 

this.name = name; 

this.marks = marks; 

this.result = result; 

} 

public int getSid() { 

return sid; 

} 

public void setSid(int sid) { 

this.sid = sid; 

} 

public String getName() { 

return name; 

} 

public void setName(String name) { 

this.name = name; 

} 

public int getMarks() { 

return marks; 

} 

public void setMarks(int marks) { 

this.marks = marks; 

} 

public String getResult() { 

return result; 

} 

public void setResult(String result) { 

this.result = result; 

} 

 

 

} 