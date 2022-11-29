package com.lti.AirlineBackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.AirlineBackend.entity.User;
import com.lti.AirlineBackend.dao.UserDao;

import java.util.List;


@Service("UserService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao dao;

	@Override
	public User addUser(User u) {
		
		User user = dao.addUser(u);
		return user;
	}

	
	

	@Override
	public User findUser(String userEmail) {
		User user = dao.findUser(userEmail);
		return user;
	}






	

	
	}
