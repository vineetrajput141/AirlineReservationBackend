package com.lti.AirlineBackend.service;

import java.util.List;

import com.lti.AirlineBackend.entity.User;

public interface UserService {

	User addUser(User u);
	
	
	public User findUser(String userEmail);
	
	
	
	
}