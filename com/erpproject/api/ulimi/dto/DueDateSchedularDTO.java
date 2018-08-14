
package com.erpproject.api.ulimi.dto;

import java.util.Date;

import javax.persistence.Convert;

import com.erpproject.common.LocalTimeConverter;

/**
 * @author Pratik
 *
 */

public class DueDateSchedularDTO {

		private Integer UserId;
	
		private Integer vendorId;
		
		private Integer duePeriod;
		
		private Integer id;
		
		@Convert(converter = LocalTimeConverter.class)
		private Date dueDate;
		
		private String userName;
		
		private String emailId;
		
//		generate the default constructor
		public DueDateSchedularDTO() {
			super();
		}


		public Integer getUserId() {
			return UserId;
		}


		public void setUserId(Integer userId) {
			UserId = userId;
		}


		public Integer getVendorId() {
			return vendorId;
		}


		public void setVendorId(Integer vendorId) {
			this.vendorId = vendorId;
		}


		public Integer getDuePeriod() {
			return duePeriod;
		}


		public void setDuePeriod(Integer duePeriod) {
			this.duePeriod = duePeriod;
		}


		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public Date getDueDate() {
			return dueDate;
		}


		public void setDueDate(Date dueDate) {
			this.dueDate = dueDate;
		}


		public String getUserName() {
			return userName;
		}


		public void setUserName(String userName) {
			this.userName = userName;
		}


		public String getEmailId() {
			return emailId;
		}


		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		

}
