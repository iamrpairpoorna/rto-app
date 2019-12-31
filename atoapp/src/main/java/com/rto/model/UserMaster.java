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

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.stereotype.Component;

@Entity
@Table(name="USER_MASTER")
public class UserMaster {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="USER_ID")
		private long userId;
			
		@Column(name="FIRST_NAEM")
		private String firstName;
		
		@Column(name="LAST_NAME")
		private String lastName;
		
		@Column(name="EMAIL_ID")
		private String userEmail;
		
		@Column(name="MOBILE_NUM")
		private Long userPhone;

		@Column(name="GENDER")
		private String userGender;
		
		@CreationTimestamp
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name="CREATED_DT")
		private Date createDt;
		
		@UpdateTimestamp
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name="UPDATED_DT")
		private Date updateDt;
		
		
		
		public long getUserId() {
			return userId;
		}

		public void setUserId(long userId) {
			this.userId = userId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getUserEmail() {
			return userEmail;
		}

		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}

		public Long getUserPhone() {
			return userPhone;
		}

		public void setUserPhone(Long userPhone) {
			this.userPhone = userPhone;
		}


		public String getUserGender() {
			return userGender;
		}

		public void setUserGender(String userGender) {
			this.userGender = userGender;
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
		
			
		
	}


