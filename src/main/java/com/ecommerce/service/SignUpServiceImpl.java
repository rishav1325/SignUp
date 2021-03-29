package com.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.dao.SignUpDao;
import com.ecommerce.entitites.SignUp;

@Service
public class SignUpServiceImpl implements SignUpService {
	@Autowired
	private SignUpDao signUpDao;

	public SignUpServiceImpl() {

	}
	@Override
	public String getCourses()
	{
	    String uri = "http://localhost:9090/courses";
	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);
	    System.out.print("RESULT"+ result);
	    return result; 
	}

	@Override
	public List<SignUp> getSignUps() {

		return signUpDao.findAll();
	}

	@Override
	public SignUp getSignUp(long signUpId) {
		return signUpDao.getOne(signUpId);
	}

	@Override
	public SignUp addSignUp(SignUp signUp) {
		signUpDao.save(signUp);
		   

		return signUp;
	}
	
	
	
	
}


