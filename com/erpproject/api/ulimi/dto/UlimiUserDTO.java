
package com.erpproject.api.ulimi.dto;


/**
 * @author Pratik
 *
 */

public class UlimiUserDTO {
		private Integer ulimiUserId;
	
		private String userName;
		
		private String password;
		
		private Long createdDate;

		private Character isActive;
		
//		generate the default constructor
		public UlimiUserDTO() {
			super();
		}

		public Integer getUlimiUserId() {
			return ulimiUserId;
		}

		public void setUlimiUserId(Integer ulimiUserId) {
			this.ulimiUserId = ulimiUserId;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Long getCreatedDate() {
			return createdDate;
		}

		public void setCreatedDate(Long createdDate) {
			this.createdDate = createdDate;
		}

		public Character getIsActive() {
			return isActive;
		}

		public void setIsActive(Character isActive) {
			this.isActive = isActive;
		}

		
}
