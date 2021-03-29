package com.ecommerce.entitites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class SignUp {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Override
	public String toString() {
		return "SignUp [FullName=" + FullName + ", Email=" + Email + ", Password=" + Password + "]";
	}
	public SignUp() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String FullName;
	private String Email;
	private String Password;
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public SignUp(String fullName, String email, String password) {
		super();
		FullName = fullName;
		Email = email;
		Password = password;
	}
	
}