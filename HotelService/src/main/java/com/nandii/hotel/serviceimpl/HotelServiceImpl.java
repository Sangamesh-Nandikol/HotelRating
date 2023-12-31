package com.nandii.hotel.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nandii.hotel.entity.Hotel;
import com.nandii.hotel.exceptions.ResourceNotFoundException;
import com.nandii.hotel.repository.HotelRepo;
import com.nandii.hotel.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepo hotelRepo;
	
	@Override
	public Hotel create(Hotel hotel) {
		
		return hotelRepo.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
		
		return hotelRepo.findAll();
	}

	@Override
	public Hotel get(String id) {
	
		return hotelRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("hotel with given id not found"));
	}

} 
