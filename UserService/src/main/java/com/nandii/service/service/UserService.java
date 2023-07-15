package com.nandii.service.service;

import java.util.List;

import com.nandii.service.entity.User;

public interface UserService {

	//create
	User saveUser(User user);
	
	//get
	List<User> getAllUser();
	
	//get user by user id	
	User getUser(String userid);
	
	//delete
	
	//update
	
}
