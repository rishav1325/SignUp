package com.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.entitites.SignUp;

public interface SignUpDao extends JpaRepository <SignUp, Long> {
	
}

