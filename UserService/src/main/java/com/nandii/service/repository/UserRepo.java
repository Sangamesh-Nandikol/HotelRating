package com.nandii.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nandii.service.entity.User;

public interface UserRepo extends JpaRepository<User, String> {

}
