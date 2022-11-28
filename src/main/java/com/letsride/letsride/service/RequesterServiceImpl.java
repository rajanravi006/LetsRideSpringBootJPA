package com.letsride.letsride.service;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.letsride.letsride.dao.RequesterDao;
import com.letsride.letsride.entity.Requester;

@Service
public class RequesterServiceImpl implements RequestService {
	@Autowired
	private RequesterDao requesterDao;
	
	@Override
	public Requester addRequest(Requester requester) {
		
		requesterDao.save(requester);
		return requester;
	}

	@Override
	public List<Requester> getRequester() {
		return requesterDao.findAll();
	}

	@Override
	public List<Requester> getRequestDetail(Integer requesterId) {
//		return requesterDao.findByRequesterId(requesterId);
		return null;
		
	}

	@Override
	public List<Requester> getRequesterByDate(Integer pageNumber, Integer pageSize, String sortBy,
			Integer requesterId) {
		return requesterDao.findByRequesterId(requesterId, PageRequest.of(pageNumber, pageSize, Sort.by(sortBy)));
	}
	

}
