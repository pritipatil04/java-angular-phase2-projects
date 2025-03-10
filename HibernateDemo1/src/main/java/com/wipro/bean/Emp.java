package com.wipro.bean; 

 

import jakarta.persistence.Entity; 

import jakarta.persistence.GeneratedValue; 

import jakarta.persistence.GenerationType; 

import jakarta.persistence.Id; 

import lombok.AllArgsConstructor; 

import lombok.Data; 

import lombok.NoArgsConstructor; 

 

@Data 

@NoArgsConstructor 

@Entity 

public class Emp { 
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	
	int id; 
	String name; 
	
	int salary; 
	
	String designation; 
	
	public Emp(String name, int salary, String designation) { 
	
	super(); 
	
	this.name = name; 
	
	this.salary = salary; 
	
	this.designation = designation; 
	
	} 

 

} 