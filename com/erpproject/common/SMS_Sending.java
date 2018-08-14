package com.erpproject.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;

public class SMS_Sending {
	
	public static String SendSmsToUser(String LedgerName,String Amount,String mobileNumber)
	{
		try{
			  new Thread(new Runnable() 
				 {
			      public void run()
			    	  {
			       String pickDropAddress = null;
			       try {
			    	   String LedgerandAmount ="Ledger name :"+LedgerName+", Amount :"+Amount;
			    	   
			    	/*   String bookingMessageForSC = "New Booking,surAJ";*/
			    	   // + '\n'+ "Booking ID:" + bookingMst.getScBookingMstId()+ " " + '\n' + "User Name: " + firstName + " "+ lastName + " " + '\n' + "Mobile No: " + mobile+ "" + '\n' + "Booking Date: " + servicingDate+ "," + '\n' + "Booking time: " + timeSlot +'\n'+"pick up and drop address: "+ pickDropAddress+"," + "" + '\n'+ "Team Motosmiles Keep Smiling.";
				        String bookingMessageNewForSC = URLEncoder.encode(
				        		LedgerandAmount, "UTF-8");
				        
				        String serviceCenter = "http://bhashsms.com/api/sendmsg.php?user=Rohantrans&pass=123456&sender=ACCURA&phone="
				          + mobileNumber
				          + "&text="
				          + bookingMessageNewForSC
				          + "&priority=ndnd&stype=normal";
				        callURLForSc(serviceCenter);
			    	   
	/*		       //http://bhashsms.com/api/sendmsg.php?user=rohanpromo&pass=123456&sender=ACCURA&phone="&text=Your%20AC%20xxxxxx042055%20Debited%20INR%2010,000.00%20on%2023/08/2017%20TFR%20Avl%20Bal%2015,420.83%20&priority=sdnd&stype=normal
			        String bookingMessageForSC = "New Booking," + '\n'+ "Booking ID:" + "420"+ " " + '\n' + "User Name: " + "Suraj" + " "+ "kumbhoje" + " " + '\n' + "Mobile No: " + "9665968779"+ "" + '\n' + "Booking Date: " + "23/08/2017"+ "," + '\n' + "Booking time: " + "11.00 am" +'\n'+"pick up and drop address: "+ "no"+"," + "" + '\n'+ "Team Motosmiles Keep Smiling.";
			       
			        String serviceCenter = "http://bhashsms.com/api/sendmsg.php?user=rohanpromo&pass=123456&sender=ACCURA&phone="
			         + "9665968779"
			          + "&text="+bookingMessageForSC.replaceAll(" ","%20")
			          + "&priority=sdnd&stype=normal";
			        String bookingMessageNewForSC = URLEncoder.encode(
			        		serviceCenter, "UTF-8");
			        callURLForSc(bookingMessageNewForSC);*/
			       } catch (UnsupportedEncodingException e) {
			        e.printStackTrace();
			       }
			      }
			  }).start();
			 }catch(Exception e){
			  e.printStackTrace();
			 }
 return null;	
}
	
	
	
	public static String callURLForSc(String myURL) 
		{
		  System.out.println("Requeted URL ENDUSER:" + myURL);
		  StringBuilder sb = new StringBuilder();
		  URLConnection urlConn = null;
		  InputStreamReader in = null;
		  try {
		   URL url = new URL(myURL);
		   urlConn = url.openConnection();
		   if (urlConn != null)
		    urlConn.setReadTimeout(200 * 1000);
		   if (urlConn != null && urlConn.getInputStream() != null) {
		    in = new InputStreamReader(urlConn.getInputStream(),
		      Charset.defaultCharset());
		    BufferedReader bufferedReader = new BufferedReader(in);
		    if (bufferedReader != null) {
		     int cp;
		     while ((cp = bufferedReader.read()) != -1) {
		      sb.append((char) cp);
		     }
		     bufferedReader.close();
		    }
		   }
		  } catch (Exception e) {
		   throw new RuntimeException("Exception while calling URL:" + myURL,
		     e);
		  }finally{
			  try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		  }

		  return sb.toString();
		 }
	
	
	

}
