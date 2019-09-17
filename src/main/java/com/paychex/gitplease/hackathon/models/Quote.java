package com.paychex.gitplease.hackathon.models;

public class Quote {
	
	private String firstName;
	private String lastName;
	private String service;
	private String email;
	private String message;
	
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
	
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Quote [firstName=" + firstName + ", lastName=" + lastName + ", service=" + service + ", email=" + email
				+ ", message=" + message + "]";
	}	

}
