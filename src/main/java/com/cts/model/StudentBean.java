package com.cts.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class StudentBean  implements Serializable{
	
	@Id
	private Integer roll;
	
	private String name;
	private Integer marks;
	
	
	public StudentBean() {
		// TODO Auto-generated constructor stub
	}


	public Integer getRoll() {
		return roll;
	}


	public void setRoll(Integer roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getMarks() {
		return marks;
	}


	public void setMarks(Integer marks) {
		this.marks = marks;
	}


	public StudentBean(Integer roll, String name, Integer marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "StudentBean [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	


}
