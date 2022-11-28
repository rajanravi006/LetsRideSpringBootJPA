package com.letsride.letsride.service;

import java.util.List;

import com.letsride.letsride.entity.Rider;

public interface RiderService {
	
	public Rider postRiderDetails(Rider rider);
	
	public List<Rider> getRider();
	
}
