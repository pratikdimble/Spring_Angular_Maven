
package com.erpproject.api.ulimi.dto;

import java.math.BigInteger;



/**
 * @author Pratik
 *
 */

public class UlimiUserMasterDTO {
	
		private BigInteger ulimiUserMasterId;
		private Long clockIn;
		private Long clockOut;
		private Character isDeleted;
		private Integer ulimiUserId;
		private String userName;
		private String password;
		private String confirmpassword;
		private Long createdDate;
		private Character isActive;
		private String firstName;
		private String lastName;
		private Integer phoneNumber;
		private Integer employeeId;
		
		public UlimiUserMasterDTO() {
			super();
		}

		public BigInteger getUlimiUserMasterId() {
			return ulimiUserMasterId;
		}

		public void setUlimiUserMasterId(BigInteger ulimiUserMasterId) {
			this.ulimiUserMasterId = ulimiUserMasterId;
		}

		public Long getClockIn() {
			return clockIn;
		}

		public void setClockIn(Long clockIn) {
			this.clockIn = clockIn;
		}

		public Long getClockOut() {
			return clockOut;
		}

		public void setClockOut(Long clockOut) {
			this.clockOut = clockOut;
		}

		public Character getIsDeleted() {
			return isDeleted;
		}

		public void setIsDeleted(Character isDeleted) {
			this.isDeleted = isDeleted;
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

		public Integer getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(Integer phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public Integer getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(Integer employeeId) {
			this.employeeId = employeeId;
		}

		public String getConfirmpassword() {
			return confirmpassword;
		}

		public void setConfirmpassword(String confirmpassword) {
			this.confirmpassword = confirmpassword;
		}
		

}
