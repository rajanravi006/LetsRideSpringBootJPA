package com.letsride.letsride.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.letsride.letsride.entity.Asset;
@Repository
public interface AssetDao extends JpaRepository<Asset, Integer> {
	
}
