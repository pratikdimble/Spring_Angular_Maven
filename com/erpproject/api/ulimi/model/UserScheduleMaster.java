
package com.erpproject.api.ulimi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;
/**
 * @author Pratik
 *
 */
@Entity
@Table(name="user_scheduler_master", schema="ulimi_management")
/*@NamedQueries({
	@NamedQuery(name = "GET_USER_ID_BY_SCHEDULE_DATE", query = "SELECT userMaster.UserId AS UserId, "
			+ " userMaster.duePeriod As duePeriod, "
			+ " schedularMaster.dueDate AS dueDate "
			+ " FROM UserScheduleMaster userMaster "
			+ "  INNER JOIN DueDateSchedular schedularMaster ON userMaster.UserId = schedularMaster.UserId"  
			+ " WHERE userMaster.vendorId = :vendorId"),
})*/
@NamedNativeQueries({
	@NamedNativeQuery(name = "GET_USER_ID_BY_SCHEDULE_DATE", query = "SELECT userSchedulerMaster.user_id AS \"UserId\", "
			+ " userSchedulerMaster.due_period As \"duePeriod\", "
			+ " schedularMaster.due_date AS \"dueDate\","
			+ " userMaster.user_name AS\"userName\", "
			+ " userMaster.email_id AS \"emailId\" "
			+ " FROM ulimi_management.user_scheduler_master userSchedulerMaster "  
			+ " INNER JOIN ulimi_management.schedular schedularMaster ON userSchedulerMaster.user_id = schedularMaster.user_id"
			+ " INNER JOIN user_master userMaster ON userSchedulerMaster.user_id = userMaster.user_id"  
			+ " WHERE userSchedulerMaster.vendor_id = :vendorId"),
})

public class UserScheduleMaster {
	
		@Id
		@Column(name="user_id")
		private Integer UserId;
	
		@Column(name="vendor_id")
		private Integer vendorId;
		
		@Column(name="due_period")
		private Integer duePeriod;
		
		
//		generate the default constructor
		public UserScheduleMaster() {
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
