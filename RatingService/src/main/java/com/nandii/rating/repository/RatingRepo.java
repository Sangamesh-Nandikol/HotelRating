package com.nandii.rating.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nandii.rating.entity.Rating;

public interface RatingRepo extends JpaRepository<Rating, String> {
	
	//custome finder methods
	List<Rating> findByUserId(String userId);

	List<Rating> findByHotelId(String hotelId);
	

}
