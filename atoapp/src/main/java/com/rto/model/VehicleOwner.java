package com.rto.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="vehicle_owner_details")
public class VehicleOwner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ownerId;
	
	@Column(name="owner_fname")
	private String owner_fname;
	
	@Column(name="owner_lname")
	private String owner_lname;
	
	@Column(name="owner_gender")
	private String owner_gender;
	
	@Column(name="owner_email")
	private String owner_email;
	
	@Column(name="owner_phno")
	private long owner_phno;
	
	@Column(name="owner_dob")
	private String owner_dob;
	
	@Column(name="owner_ssn")
	private String owner_ssn;
	

		
	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwner_id(Integer ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwner_fname() {
		return owner_fname;
	}

	public void setOwner_fname(String owner_fname) {
		this.owner_fname = owner_fname;
	}

	public String getOwner_lname() {
		return owner_lname;
	}

	public void setOwner_lname(String owner_lname) {
		this.owner_lname = owner_lname;
	}

	public String getOwner_gender() {
		return owner_gender;
	}

	public void setOwner_gender(String owner_gender) {
		this.owner_gender = owner_gender;
	}
	public String getOwner_email() {
		return owner_email;
	}

	public void setOwner_email(String owner_email) {
		this.owner_email = owner_email;
	}
	public long getOwner_phno() {
		return owner_phno;
	}

	public void setOwner_phno(long owner_phno) {
		this.owner_phno = owner_phno;
	}

	public String getOwner_dob() {
		return owner_dob;
	}

	public void setOwner_dob(String owner_dob) {
		this.owner_dob = owner_dob;
	}

	public String getOwner_ssn() {
		return owner_ssn;
	}

	public void setOwner_ssn(String owner_ssn) {
		this.owner_ssn = owner_ssn;
	}

	

}



