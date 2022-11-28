package com.letsride.letsride.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsride.letsride.dao.RiderDao;
import com.letsride.letsride.entity.Rider;
@Service
public class RiderServiceImpl implements RiderService {
	
	@Autowired
	private RiderDao riderDao;
	@Override
	public Rider postRiderDetails(Rider rider) {
		riderDao.save(rider);
		return rider;
	}
	@Override
	public List<Rider> getRider() {
		return riderDao.findAll();
	}

}
