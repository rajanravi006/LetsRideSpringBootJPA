package com.letsride.letsride.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Asset {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer assetId;
	private String sensitivity;
	private String assetTypes;
	private Integer quantity;
	private String status;
}
