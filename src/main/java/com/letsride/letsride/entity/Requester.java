package com.letsride.letsride.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Requester {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer requestId;
	private Integer requesterId;
	private String source;
	private String destination;
	private String dateTime;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "asset_Id", referencedColumnName = "assetId")
	private Asset asset;
	
}
