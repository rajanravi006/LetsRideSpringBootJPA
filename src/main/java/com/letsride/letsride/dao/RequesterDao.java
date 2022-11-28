package com.letsride.letsride.dao;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.letsride.letsride.entity.Requester;
@Repository
public interface RequesterDao extends JpaRepository<Requester, Integer> {
	public List<Requester> findByRequesterId(Integer requesterId, PageRequest pageRequest);
}
