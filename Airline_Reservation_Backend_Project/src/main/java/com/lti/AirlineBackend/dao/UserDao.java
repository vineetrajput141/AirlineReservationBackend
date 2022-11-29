package com.lti.AirlineBackend.dao;


import java.util.List;

import com.lti.AirlineBackend.entity.User;


public interface UserDao {

	User addUser(User u);
	
	User findUser(String userEmail);
	
	List<User> getAllUsers();
	
}

