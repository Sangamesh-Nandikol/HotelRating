package com.nandii.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nandii.service.entity.User;
import com.nandii.service.service.UserService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService service;
	
	//create
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user){		
		User saveUser = service.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(saveUser);		
	}
	
	// get single user
	@GetMapping("/{userid}")
	@CircuitBreaker(name="ratingHotelBreaker",fallbackMethod = "ratingHotelFallback")
	public ResponseEntity<User> getSingleUser(@PathVariable String userid) {

		User user = service.getUser(userid);
		return ResponseEntity.ok(user);

	}
	
	//creating fallback method for circuitBreaker method
	
	public ResponseEntity<User> ratingHotelFallback(String userId,Exception ex){		
		log.info("fallback is excuted because service is down",ex.getMessage());
		User user = User.builder()
		.email("dummy@gmail.com")
		.name("dummy")
		.about("this user is created because some service is down")
		.userId("12234")
		.build();
		
		return new ResponseEntity<>(user,HttpStatus.OK);
		
	}
	
	//get all user
	@GetMapping
	public ResponseEntity<List<User>> getAllUser(){
		List<User> allUser = service.getAllUser();
		return ResponseEntity.ok(allUser);
		
	}
}
