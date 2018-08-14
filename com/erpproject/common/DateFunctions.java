package com.erpproject.common;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Ganesh
 * @version jdk 1.8
 * 
 *          {@code addDaysToCurrentDate(Long currrentDate, Integer daysToAdd)
 *  this method adds number of days to current date and calculate next date in the for of Long}
 * 
 * @param currentDate
 *            : current Date in Long format
 * @param daysToAdd
 *            : Days in Integer format
 */

public class DateFunctions
	{
	public static HashSet<Integer> fiscalYearSet = null;
		public static Long addDaysToCurrentDate(Long currrentDate, Integer daysToAdd)
			{
				Date date = null;
				Long dateToLong = null;
				try
					{
						Calendar calender = new GregorianCalendar();
						calender.add(Calendar.DATE, daysToAdd);
						date = calender.getTime();
						dateToLong = date.getTime();
					}
				catch (Exception e)
					{
						e.printStackTrace();
					}

				return dateToLong;

			}

		public static int getFiscalYearOfDate(long dateTime)
			{
				try
					{
						int preOrPostYear = 0;
						Calendar calender = new GregorianCalendar();
						calender.setTimeInMillis(dateTime);
						int month = calender.get(Calendar.MONTH) + 1;
						if (month >= 1 && month <= 3)
							{
								preOrPostYear = calender.get(Calendar.YEAR) - 1;
								return Integer.parseInt(preOrPostYear + "" + calender.get(Calendar.YEAR));
							}
						else
							{
								preOrPostYear = calender.get(Calendar.YEAR) + 1;
								return Integer.parseInt(calender.get(Calendar.YEAR) + "" + preOrPostYear);
							}
					}
				catch (Exception e)
					{
						e.printStackTrace();
					}
				return 0;
			}

		public static long getStartFiscalDate(long dateTime)
			{
				Calendar cal = null;
				try
					{
						int fiscalYear = getFiscalYearOfDate(dateTime);
						int year = Integer.parseInt(String.valueOf(fiscalYear).substring(0, 4));
						System.out.println(fiscalYear + " " + year);
						cal = new GregorianCalendar();
						cal.set(Calendar.DATE, 1);
						cal.set(Calendar.MONTH, Calendar.APRIL);
						cal.set(Calendar.YEAR, year);
						cal.set(Calendar.HOUR_OF_DAY, 0);
						cal.set(Calendar.MINUTE, 0);
						cal.set(Calendar.SECOND, 0);
						cal.set(Calendar.MILLISECOND, 0);
					}
				catch (Exception e)
					{
						e.printStackTrace();
					}
				return cal.getTimeInMillis();
			}

		public static long getEndFiscalDate(long dateTime)
			{
				Calendar cal = null;
				try
					{
						int fiscalYear = getFiscalYearOfDate(dateTime);
						int year = Integer.parseInt(String.valueOf(fiscalYear).substring(4, 8));
						cal = new GregorianCalendar();
						cal.set(Calendar.DATE, 31);
						cal.set(Calendar.MONTH, Calendar.MARCH);
						cal.set(Calendar.YEAR, year);
						cal.set(Calendar.HOUR_OF_DAY, 0);
						cal.set(Calendar.MINUTE, 0);
						cal.set(Calendar.SECOND, 0);
						cal.set(Calendar.MILLISECOND, 0);
					}
				catch (Exception e)
					{
						e.printStackTrace();
					}
				return cal.getTimeInMillis();
			}

		public static Date addDays(Date date, int days)
			{
				GregorianCalendar cal = new GregorianCalendar();
				cal.setTime(date);
				cal.add(Calendar.DATE, days);

				return cal.getTime();
			}

		

		public static String longDateToStringDate(Long inputDate)
			{
				try
					{
						String date;
						SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
						date = dateFormat.format(new Date(inputDate));
						return date;
					}
				catch (Exception e)
					{
						e.printStackTrace();
						return null;
					}

			}
		
		public static String longDateToStringDate(Long inputDate,String pattern)
		{
			try
				{
					String date;
					SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
					date = dateFormat.format(new Date(inputDate));
					return date;
				}
			catch (Exception e)
				{
					e.printStackTrace();
					return null;
				}

		}
		
		public static Long getDateFromStringFormat(String inputDate,String pattern)
		{
			try
				{
					long date;
					SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
					date = dateFormat.parse(inputDate).getTime();
					return date;
				}
			catch (Exception e)
				{
					e.printStackTrace();
				}
			return null;

		}
		
		public static HashSet<Integer> getUpwardFiscalYear(long transactionDate) {
			if(fiscalYearSet == null){
				fiscalYearSet = new HashSet<Integer>();
			}
			Integer transYear = DateFunctions.getFiscalYearOfDate(transactionDate);
			Integer currentYear = DateFunctions.getFiscalYearOfDate(new Date().getTime());
			fiscalYearSet.add(transYear);
			fiscalYearSet.add(currentYear);
			if(DateFunctions.getStartFiscalDate(transactionDate) != DateFunctions.getStartFiscalDate(new Date().getTime())){
				long endDate = DateFunctions.getEndFiscalDate(transactionDate);
				long startDate = endDate + (1 * (1000 * 60 * 60 * 24));
				getUpwardFiscalYear(startDate);
			}
			return fiscalYearSet;
		}
	}
