
package com.erpproject.api.ulimi.model;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.erpproject.common.LocalTimeConverter;
/**
 * @author Pratik
 *
 */


/*@NamedQueries({
	
	@NamedQuery(name="GET_USER_ID_BY_SCHEDULE_DATE",query="SELECT dateSchedular.id AS id, "
			+ " dateSchedular.UserId AS UserId, "
			+ " FROM DueDateSchedular dateSchedular  "
			+ " WHERE  dateSchedular.dueDate = :dueDate"),
	

	
})*/
/*@NamedNativeQueries({
	@NamedNativeQuery(name = "GET_USER_ID_BY_SCHEDULE_DATE", query = "SELECT userMaster.user_id AS \"UserId\", "
			+ " userMaster.due_period As \"duePeriod\","
			+ " schedularMaster.due_date AS\"dueDate\" " 
			+ " FROM ulimi_management.user userMaster "  
			+ " INNER JOIN ulimi_management.schedular schedularMaster ON userMaster.user_id = schedularMaster.user_id"  
			+ " WHERE userMaster.vendor_id = :vendorId"),
})*/
@Entity
@Table(name="schedular", schema="ulimi_management")

public class DueDateSchedular {
	
		@Id
		@Column(name="id")
		private Integer id;
		
		@Column(name="user_id")
		private Integer UserId;
	
		@Column(name="due_date")
		@Convert(converter = LocalTimeConverter.class)
		private Long dueDate;
		
		
//		generate the default constructor
		public DueDateSchedular() {
			super();
		}


		public Integer getUserId() {
			return UserId;
		}


		public void setUserId(Integer userId) {
			UserId = userId;
		}


		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public Long getDueDate() {
			return dueDate;
		}


		public void setDueDate(Long dueDate) {
			this.dueDate = dueDate;
		}

		

}
