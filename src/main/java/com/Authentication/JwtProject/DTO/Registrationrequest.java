package com.Authentication.JwtProject.DTO;

public class Registrationrequest {
	private String name;
	private String email;
	private String password;
	
	
	public Registrationrequest() {}
	
	public Registrationrequest(String n, String e, String p) {
		this.name= n;
		this.email = e;
		this.password = p;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
