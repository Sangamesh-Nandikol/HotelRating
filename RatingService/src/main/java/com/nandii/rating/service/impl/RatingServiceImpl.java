package com.nandii.rating.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nandii.rating.entity.Rating;
import com.nandii.rating.repository.RatingRepo;
import com.nandii.rating.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepo ratingRepo;
	
	@Override
	public Rating create(Rating rating) {
		String randomUUID = UUID.randomUUID().toString();
		rating.setRatingId(randomUUID);
		
		return ratingRepo.save(rating);
	}

	@Override
	public List<Rating> getAllRatings() {

		return ratingRepo.findAll();
	}

	@Override
	public List<Rating> getById(String id) {
		return ratingRepo.findByUserId(id);
	}

	@Override
	public List<Rating> getRatingByHotelId(String horelId) {

		return ratingRepo.findByHotelId(horelId);
	}
	
	

}
