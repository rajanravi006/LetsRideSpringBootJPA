package com.letsride.letsride.service;

import java.util.List;

import com.letsride.letsride.entity.Requester;

public interface RequestService {
	
	public Requester addRequest(Requester requester);

	public List<Requester> getRequestDetail(Integer requesterId);
	
	public List<Requester> getRequesterByDate(Integer pageNumber, Integer pageSize, String sortBy, Integer requesterId);
	
	public List<Requester> getRequester();
}
