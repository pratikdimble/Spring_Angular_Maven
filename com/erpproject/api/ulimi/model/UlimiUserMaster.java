
package com.erpproject.api.ulimi.model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.erpproject.common.LocalTimeConverter;
/**
 * @author Pratik
 *
 */
@Entity
@Table(name="ulimi_user_master", schema="ulimi_management")
@SequenceGenerator(name = "ulimi_user_maste_seq" , sequenceName = "ulimi_management.ulimi_user_maste_seq" , allocationSize = 1)



public class UlimiUserMaster {
	
		@Id
		@Column(name="ulimi_user_master_id")
		@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "ulimi_user_maste_seq")
		private BigInteger ulimiUserMasterId;
	
		@Column(name="clock_in")
		@Convert(converter = LocalTimeConverter.class)
		private Long clockIn;

		
		@Column(name="clock_out")
		@Convert(converter = LocalTimeConverter.class)
		private Long clockOut;

		@Column(name="is_deleted")
		private Character isDeleted;
		
		@Column(name="ulimi_user_id")
		private Integer ulimiUserId;
//		generate the default constructor
		public UlimiUserMaster() {
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
		

}
