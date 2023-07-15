package com.nandii.rating.service;

import java.util.List;

import com.nandii.rating.entity.Rating;

public interface RatingService {

	//create 
	Rating create(Rating rating);
		
	//get all ratings
	List<Rating> getAllRatings();	
	
	//get all by user id
	List<Rating> getById(String id);
	
	//get all by hotel
	List<Rating> getRatingByHotelId(String horelId);
	
}
