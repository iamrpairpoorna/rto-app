package com.rto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehicle_registration_details")
public class VehicleRegistrationDetails {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int vrId;
	
	@Column(name="owner_id")
	private int ownerId;
	
	@Column(name="reg_num")
	private String regnNum;

	public int getVrId() {
		return vrId;
	}

	public void setvrId(int vrId) {
		this.vrId = vrId;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwner_id(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getRegnNum() {
		return regnNum;
	}

	public void setRegnNum(String regnNum) {
		this.regnNum = regnNum;
	}
	
	
	

}
