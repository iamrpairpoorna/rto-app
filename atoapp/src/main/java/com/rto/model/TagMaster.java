package com.rto.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="TAB_MASTER")
public class TagMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="TAG_SEQ")
	private int tagSequence;
	
	@Column(name="TAG_ID")
	private int tagId;
	
	@Column(name="VHCLE_REG_NUM")
	private String vehicleRegNum;
	
	@Column(name="VHCLE_TYPE")
	private String vehicleType;
	
	@Column(name="TAG_ST_DT")
	private Date tagStartDt;
	
	@Column(name="TAB_ED_DT")
	private Date tagEndDt;
	
	@Column(name="USER_ID")
	private int userId;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_DT")
	private Date createDt;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_DT")
	private Date updateDt;
	
	
	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	
	public int getTagSequence() {
		return tagSequence;
	}
	public void setTagSequence(int tagSequence) {
		this.tagSequence = tagSequence;
	}
	public int getTagId() {
		return tagId;
	}
	public void setTagId(int tagId) {
		this.tagId = tagId;
	}
	public String getVehicleRegNum() {
		return vehicleRegNum;
	}
	public void setVehicleRegNum(String vehicleRegNum) {
		this.vehicleRegNum = vehicleRegNum;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public Date getTagStartDt() {
		return tagStartDt;
	}
	public void setTagStartDt(Date tagStartDt) {
		this.tagStartDt = tagStartDt;
	}
	public Date getTagEndDt() {
		return tagEndDt;
	}
	public void setTagEndDt(Date tagEndDt) {
		this.tagEndDt = tagEndDt;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Date getCreateDt() {
		return createDt;
	}
	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}
	public Date getUpdateDt() {
		return updateDt;
	}
	public void setUpdateDt(Date updateDt) {
		this.updateDt = updateDt;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	
	

}
