package com.letsride.letsride.entity;

public enum Status {
	Pending("Pending"),
	Expired("Expired");
	
	public final String value;
	Status(String value) {
		this.value = value;
	}
}
