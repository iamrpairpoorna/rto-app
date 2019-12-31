package com.rto.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="vehicle_owner_address")
public class VehicleOwnerAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer owner_address_id;
	
	@Column(name="owner_hno")
	private String owner_hno;
	
	@Column(name="owner_streetNo")
	private String owner_streetNo;
	
	@Column(name="owner_city")
	private String owner_city;
	
	@Column(name="owner_state")
	private String owner_state;
	
	@Column(name="owner_zip")
	private String owner_zip;
	
	@Column(name="ownerId")
	private int ownerId;
	
	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "owner_id",referencedColumnName = "owner_id")
	 * 
	 * @Cascade(value =org.hibernate.annotations.CascadeType.ALL ) private
	 * VehicleOwner vehicleOwner;
	 */
	
	
	 public VehicleOwnerAddress() { 
		 super();
		 }
	
	public VehicleOwnerAddress(String owner_hno, String owner_streetNo, String owner_city, String owner_state, String owner_zip) {
		super();
		this.owner_hno = owner_hno;
		this.owner_streetNo = owner_streetNo;
		this.owner_city = owner_city;
		this.owner_state = owner_state;
		this.owner_zip = owner_zip;
	}
	
	public Integer getOwner_address_id() {
		return owner_address_id;
	}
	public void setOwner_address_id(Integer owner_address_id) {
		this.owner_address_id = owner_address_id;
	}
	
	public String getOwner_hno() {
		return owner_hno;
	}
	public void setOwner_hno(String owner_hno) {
		this.owner_hno = owner_hno;
	}
	
	public String getOwner_streetNo() {
		return owner_streetNo;
	}
	public void setOwner_streetNo(String owner_streetNo) {
		this.owner_streetNo = owner_streetNo;
	}
	
	public String getOwner_city() {
		return owner_city;
	}
	public void setOwner_city(String owner_city) {
		this.owner_city = owner_city;
	}

	public String getOwner_state() {
	
		return owner_state;
	}
	public void setOwner_state(String owner_state) {
		this.owner_state = owner_state;
	}
	
	
	public String getOwner_zip() {
		return owner_zip;
	}
	public void setOwner_zip(String owner_zip) {
		this.owner_zip = owner_zip;
	}
	
	/*
	 * public VehicleOwner getVehicleOwner() { return vehicleOwner; } public void
	 * setVehicleOwner(VehicleOwner vehicleOwner) { this.vehicleOwner =
	 * vehicleOwner; }
	 */
	
	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	/*
	 * @Override public String toString() { return
	 * "VehicleOwnerAddress [owner_address_id=" + owner_address_id + ", owner_hno="
	 * + owner_hno + ", owner_streetNo=" + owner_streetNo + ", owner_city=" +
	 * owner_city + ", owner_state=" + owner_state + ", owner_zip=" + owner_zip +
	 * ", vehicleOwner=" + vehicleOwner + "]"; }
	 */

	}

