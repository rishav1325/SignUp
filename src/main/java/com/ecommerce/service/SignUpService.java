package com.ecommerce.service;

import java.util.List;

import com.ecommerce.entitites.SignUp;

public interface SignUpService {
	public List<SignUp> getSignUps();

	public SignUp getSignUp(long signUpId);

	public SignUp addSignUp(SignUp signUp);

	public String getCourses();
		
}
