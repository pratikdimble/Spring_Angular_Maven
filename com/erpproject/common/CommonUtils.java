package com.erpproject.common;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

public class CommonUtils {

	public static final String query = "SELECT * FROM ABC WHERE a=:a";

	public static BigDecimal stringToBigDecimal(String inputNumber) {
		try {
			if (StringUtils.isEmpty(inputNumber)) {
				return BigDecimal.ZERO;
			} else {
				return new BigDecimal(inputNumber);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
	
	public static long getDateDifferanceInDays(Date date1,Date date2){
		System.out.println(date1+" "+date2);
		return (long)(date2.getTime() - date1.getTime() ) / (24 * 60 * 60 * 1000);		
	}
}
