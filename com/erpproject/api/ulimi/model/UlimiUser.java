
package com.erpproject.api.ulimi.model;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.erpproject.common.LocalTimeConverter;
/**
 * @author Pratik
 *
 */
@Entity
@Table(name="ulimi_user", schema="ulimi_management")
@SequenceGenerator(name = "ulimi_user_seq" , sequenceName = "ulimi_management.ulimi_user_seq" , allocationSize = 1)

@NamedQueries({
	@NamedQuery(name = "GET_USER_DETAILS", 
			query = "SELECT ulimiUser.ulimiUserId AS ulimiUserId, "
					+ " ulimiUser.userName As userName, "
					+ " ulimiUser.password AS password "
					+ " FROM UlimiUser ulimiUser "
					+ " WHERE ulimiUser.userName = :userName AND  ulimiUser.password = :password AND ulimiUser.isActive = :isActive"),
})

public class UlimiUser {
	
		@Id
		@Column(name="user_id")
		@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "ulimi_user_seq")
		private Integer ulimiUserId;
		
		@Column(name="firstname")
		private String firstName;
		
		@Column(name="lastname")
		private String lastName;
		
		@Column(name="phone_number")
		private Integer phoneNumber;
		
		@Column(name="employee_id")
		private Integer employeeId;
	
		@Column(name="username")
		private String userName;
		
		@Column(name="password")
		private String password;
		
		
		
		@Column(name = "created_date")
		@Convert(converter = LocalTimeConverter.class)
		private Long createdDate;

		@Column(name="is_active")
		private Character isActive;
		
//		generate the default constructor
		public UlimiUser() {
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

		
}
