package com.letsride.letsride.entity;

public enum TravelMedium {
	
	BUS("Bus"), 
	CAR("Bus"), 
	TRAIN("Bus");
	
	public final String value;
	TravelMedium(String value) {
		this.value = value;
	}
}
