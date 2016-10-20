package com.microservice.model;

public class Employee {
	
	private String firstName;
	private String lastName;
	private String designation;
	
	public Employee() {
		// Do Nothing
	}
	
	public Employee(String firstName, String lastName, String designation) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.designation = designation;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
