package com.prog.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMP_SYSTEM")
public class Employee {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 private String name;
	 private String email;
	 private String address;
	 private String phon;
	 private int salary;
	 
	 
	public Employee() {
		super();
		// TODO Auto-generated constructor stubs
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


	public String getEmail() {
		return email;
		
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhon() {
		return phon;
	}


	public void setPhon(String phon) {
		this.phon = phon;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salery) {
		this.salary = salery;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", phon=" + phon
				+ ", salery=" + salary + "]";
	}

    
	
	 
	 

}
