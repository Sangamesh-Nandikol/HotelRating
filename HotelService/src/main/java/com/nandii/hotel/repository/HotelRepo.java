package com.nandii.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nandii.hotel.entity.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, String> {

}
