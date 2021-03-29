package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.entitites.SignUp;
import com.ecommerce.service.SignUpService;


@RestController

public class SIgnUpController {

	
	@Autowired
	private SignUpService signUpService; 
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to SignUp page";
	}
	
	
	@GetMapping("/signUps")
	public List<SignUp> getSignUps() 
	{
		return this.signUpService.getSignUps();
		
	
	
	}
	@GetMapping("/signUp/{signUpId}")
	public SignUp getSignUp(@PathVariable String signUpId  )
	{
		return this.signUpService.getSignUp(Long.parseLong(signUpId));
	}
	
	@GetMapping(value = "/connectCourseAPI")
	public String testCourseAPI() {
		return this.signUpService.getCourses();
				
	}
	
@PostMapping("/signups")	
public SignUp addSignUp(@RequestBody SignUp signUp) {  
	return this.signUpService.addSignUp(signUp);
	
}
}


