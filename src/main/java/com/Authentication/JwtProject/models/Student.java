package com.Authentication.JwtProject.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long s_id;
	private String s_name;
	private String email;
	
	@ManyToOne
	@JoinColumn(name="c_id")
	private College college;
	
	public Student() {}
	
	public Student(Long i, String n ,String e, College c) {
		this.s_id = i;
		this.s_name = n;
		this.email = e;
		this.college = c;
	}

	public Long getS_id() {
		return s_id;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public void setS_id(Long s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}
