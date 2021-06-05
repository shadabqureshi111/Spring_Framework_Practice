package com.orm.entities;

import javax.persistence.Embeddable;

/*@Embeddable is used to create table column in Student*/
@Embeddable 
public class Address 
{
	private String city;
	private String state;
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ",state="+state+"]";
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
