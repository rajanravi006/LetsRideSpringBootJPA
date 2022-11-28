package com.letsride.letsride.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.letsride.letsride.entity.Rider;
import com.letsride.letsride.service.RiderService;

@RestController
public class RiderController {
	
	@Autowired
	private RiderService riderService;

	
	@PostMapping("/postrider")
	public Rider postRiderDetails(@RequestBody Rider rider) {
		return this.riderService.postRiderDetails(rider);
	}
	
	@GetMapping("/getrider")
	public List<Rider> getRiders(){
		return this.riderService.getRider();
		
	}
	
}
