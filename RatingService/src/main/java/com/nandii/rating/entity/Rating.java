package com.nandii.rating.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="UserRating")
public class Rating {

	@Id 
	private String ratingId;
	private String userId;
	private String hotelId;
	private int rating;
	private String remark;
}
