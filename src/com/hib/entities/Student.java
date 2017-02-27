package com.hib.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String firstName;
	private int age;
	
	public Student(){};
	public Student(Integer id, String firstName, int age){
		this.id = id;
		this.firstName = firstName;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int i) {
		this.age = i;
	}
	
	
	
}
