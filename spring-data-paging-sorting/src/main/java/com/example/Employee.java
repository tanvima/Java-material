package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Emplsort")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String hobby;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]\n";
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String string) {
		this.name = string;
	}
	public Employee(String string, String hobby) {
		this.name = string;
		this.hobby = hobby;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
