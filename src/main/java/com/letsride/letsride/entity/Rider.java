package com.letsride.letsride.entity;

import javax.persistence.Entity;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Rider {
	
	
	
	@Id
	private Integer riderId;
	private String source;
	private String destination;
	private String dateTimeFormat;
	private Integer maxQuantity;
	private String travelMedium;
}
