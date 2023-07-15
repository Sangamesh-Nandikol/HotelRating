package com.nandii.hotel.services;

import java.util.List;

import com.nandii.hotel.entity.Hotel;

public interface HotelService {

	//create 
	Hotel create(Hotel hotel);
	
	//get all
	List<Hotel> getAll();
	
	//get single
	Hotel get(String id);
}
