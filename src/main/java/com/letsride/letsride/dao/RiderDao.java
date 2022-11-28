package com.letsride.letsride.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.letsride.letsride.entity.Rider;

public interface RiderDao extends JpaRepository<Rider, Integer> {

}
