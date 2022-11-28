package com.letsride.letsride.entity;

public enum Sensitivity {
	
	HIGHLY_SENSITIVE("Highly Sensitive"), 
	SENSITIVE("Sensitive"), 
	NORMAL("Normal");
	
	public final String value;
	Sensitivity(String value) {
		this.value = value;
	}
}
