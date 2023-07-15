package com.nandii.hotel.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="hotels")
@Data
public class Hotel {

	@Id
	private String id;
	private String name;
	private String location;
	private String about;
	
}
