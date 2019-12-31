package com.rto.model;


import java.util.Calendar;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="Vehicle_details")
public class Vehicle_details {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="vehicle_id")
	private int id;
	
	@Column(name="vehicle_type")
	private String vehicle_type;
	
	@Column(name="vehicle_company")
	private String vehicle_company;
	
	@Column(name="vehicle_year")
	private String vehicle_year;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="resgn_date")
	private Date resgnDate;
	
	@Column(name="ownerId")
	private int ownerId;

	public Vehicle_details() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle_details(String vehicle_type, String vehicle_company, String vehicle_year) {
		super();
		this.vehicle_type = vehicle_type;
		this.vehicle_company = vehicle_company;
		this.vehicle_year = vehicle_year;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getVehicle_type() {
		return vehicle_type;
	}

	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}

	public String getVehicle_company() {
		return vehicle_company;
	}

	public void setVehicle_company(String vehicle_company) {
		this.vehicle_company = vehicle_company;
	}

	public String getVehicle_year() {
		return vehicle_year;
	}

	public void setVehicle_year(String vehicle_year) {
		this.vehicle_year = vehicle_year;
	}

	
	public Date getResgnDate() {
		return resgnDate;
	}

	public void setResgnDate(Date resgnDate) {
		this.resgnDate = resgnDate;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	
}


