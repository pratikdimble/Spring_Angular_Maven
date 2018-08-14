
package com.erpproject.api.ulimi.dto;


/**
 * @author Pratik
 *
 */

public class UserDTO {

		private Integer UserId;
	
		private Integer vendorId;
		
		private Integer duePeriod;
		
		
//		generate the default constructor
		public UserDTO() {
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

		

}
