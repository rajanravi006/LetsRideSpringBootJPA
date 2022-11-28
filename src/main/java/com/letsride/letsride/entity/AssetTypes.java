package com.letsride.letsride.entity;

public enum AssetTypes {
	
	LAPTOP("Laptop"), 
	TRAVEL_BAG("Travel Bag"), 
	PACKAGE("Pakage");
	
	public final String value;
	AssetTypes(String value) {
		this.value = value;
	}
}	
