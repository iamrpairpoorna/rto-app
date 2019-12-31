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

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name = "TAG_TX_TRGGRS")
public class TagTransactionTriggers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TX_ID")
	private Integer transactionId;
	
	@Column(name="TAG_ID")
	private Integer tagId;
	
	@Column(name="VHCL_REG_NUM")
	private String vehicleRegNum;
	
	@Column(name="TOLL_PLAZA_ID")
	private Integer tollPlazaId;
	
	@Column(name="TOLL_AMT")
	private Long tollAmnt;
	
	@Column(name="TX_STATUS")
	private String transactionStatus;
	
	@Column(name="TX_FLRE_RSN")
	private String trFailureReason;
	
	@Column(name="TX_RMNDR_MSG")
	private String trRemainderMsg;
	private String rmndrMsgswtch;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_DT")
	private Date createDt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_DT")
	private Date updateDt;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "UPDATED_BY")
	private String updatedBy;

	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public Integer getTagId() {
		return tagId;
	}

	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}

	public String getVehicleRegNum() {
		return vehicleRegNum;
	}

	public void setVehicleRegNum(String vehicleRegNum) {
		this.vehicleRegNum = vehicleRegNum;
	}

	public Integer getTollPlazaId() {
		return tollPlazaId;
	}

	public void setTollPlazaId(Integer tollPlazaId) {
		this.tollPlazaId = tollPlazaId;
	}

	public Long getTollAmnt() {
		return tollAmnt;
	}

	public void setTollAmnt(Long tollAmnt) {
		this.tollAmnt = tollAmnt;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public String getTrFailureReason() {
		return trFailureReason;
	}

	public void setTrFailureReason(String trFailureReason) {
		this.trFailureReason = trFailureReason;
	}

	public String getTrRemainderMsg() {
		return trRemainderMsg;
	}

	public void setTrRemainderMsg(String trRemainderMsg) {
		this.trRemainderMsg = trRemainderMsg;
	}

	public String getRmndrMsgswtch() {
		return rmndrMsgswtch;
	}

	public void setRmndrMsgswtch(String rmndrMsgswtch) {
		this.rmndrMsgswtch = rmndrMsgswtch;
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
