package com.letsride.letsride.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.letsride.letsride.entity.Requester;
import com.letsride.letsride.service.RequestService;

@RestController
public class RequesterController {
	
	@Autowired
	private RequestService requestService;

	
	@PostMapping("/postrequest")
	public Requester postRequest(@RequestBody Requester requester) {
		return this.requestService.addRequest(requester);
	}
	
	@GetMapping("/getrequest")
	public List<Requester> getRequester(){
		return this.requestService.getRequester();
		
	}
	
//	@GetMapping("/getrequestdetails/{requestId}")
//	public List<Requester> getRequestDetails(@PathVariable Integer requestId) {
//		return this.requestService.getRequestDetail(requestId);
//	}
	
	@GetMapping("/getrequestdetails/{requestId}")
	public List<Requester> getRequesterByDate(@RequestParam(value = "pageNumber", defaultValue = "0", required = false) Integer pageNumber,
			 @RequestParam(value = "pageSize", defaultValue = "5", required = false) Integer pageSize,
			 @RequestParam(value = "sortBy", defaultValue = "requesterId", required = false) String sortBy, @PathVariable Integer requestId) {
		return this.requestService.getRequesterByDate(pageNumber, pageSize, sortBy, requestId);
	}
}
