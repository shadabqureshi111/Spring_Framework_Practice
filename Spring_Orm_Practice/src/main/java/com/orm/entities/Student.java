package com.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;


@Entity(name="student_detail")

public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE) 
	@Column(name="pk_id")
	private int id;
	
	@Column(name="s_name")
	private String name;
	
	/*@Autowired is used to connect the Address class*/
	@Autowired
	private Address address;

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


	/*
	 * public String getCity() { return city; }
	 * 
	 * 
	 * public void setCity(String city) { this.city = city; }
	 */

	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + address + "]";
	}


	
	
}
