package com.erpproject.common;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;



public class CSVFile {
	
	public static void main(String[] args) throws FileNotFoundException {
		ObjectMapper mapper = new ObjectMapper();
		JsonNode node;
		try {
			node = mapper
					.readTree("[\n" +
					           "      {\n" +
					           "        \"gstnNo\": \"22AAAAA0000A1A5\",\n" +
					           "        \"invoiceNo\": null,\n" +
					           "        \"invoiceDate\": \"11/07/2017\",\n" +
					           "        \"invoiceValue\": 17992,\n" +
					           "        \"placeOfSupply\": \"415555-MAHARASHTRA\",\n" +
					           "        \"reverseCharge\": \"N\",\n" +
					           "        \"invoiceType\": \"Regular\",\n" +
					           "        \"ecomGstn\": null,\n" +
					           "        \"rate\": 5,\n" +
					           "        \"taxableValue\": 12676,\n" +
					           "        \"cessAmount\": null\n" +
					           "      },\n" +
					           "      {\n" +
					           "        \"gstnNo\": \"22AAAAA0000A1A5\",\n" +
					           "        \"invoiceNo\": null,\n" +
					           "        \"invoiceDate\": \"11/07/2017\",\n" +
					           "        \"invoiceValue\": 17992,\n" +
					           "        \"placeOfSupply\": \"415555-MAHARASHTRA\",\n" +
					           "        \"reverseCharge\": \"N\",\n" +
					           "        \"invoiceType\": \"Regular\",\n" +
					           "        \"ecomGstn\": null,\n" +
					           "        \"rate\": 18,\n" +
					           "        \"taxableValue\": 3968,\n" +
					           "        \"cessAmount\": null\n" +
					           "      },\n" +
					           "      {\n" +
					           "        \"gstnNo\": \"22AAAAA0000A1Z2\",\n" +
					           "        \"invoiceNo\": null,\n" +
					           "        \"invoiceDate\": \"11/07/2017\",\n" +
					           "        \"invoiceValue\": 33835,\n" +
					           "        \"placeOfSupply\": \"416216-MAHARASHTRA\",\n" +
					           "        \"reverseCharge\": \"N\",\n" +
					           "        \"invoiceType\": \"Regular\",\n" +
					           "        \"ecomGstn\": null,\n" +
					           "        \"rate\": 5,\n" +
					           "        \"taxableValue\": 7500,\n" +
					           "        \"cessAmount\": null\n" +
					           "      },\n" +
					           "      {\n" +
					           "        \"gstnNo\": \"22AAAAA0000A1Z2\",\n" +
					           "        \"invoiceNo\": null,\n" +
					           "        \"invoiceDate\": \"11/07/2017\",\n" +
					           "        \"invoiceValue\": 33835,\n" +
					           "        \"placeOfSupply\": \"416216-MAHARASHTRA\",\n" +
					           "        \"reverseCharge\": \"N\",\n" +
					           "        \"invoiceType\": \"Regular\",\n" +
					           "        \"ecomGstn\": null,\n" +
					           "        \"rate\": 18,\n" +
					           "        \"taxableValue\": 22000,\n" +
					           "        \"cessAmount\": null\n" +
					           "      },\n" +
					           "      {\n" +
					           "        \"gstnNo\": \"22AAAAA0000A1Z5\",\n" +
					           "        \"invoiceNo\": null,\n" +
					           "        \"invoiceDate\": \"11/07/2017\",\n" +
					           "        \"invoiceValue\": 2873,\n" +
					           "        \"placeOfSupply\": \"100-MAHARASHTRA\",\n" +
					           "        \"reverseCharge\": \"N\",\n" +
					           "        \"invoiceType\": \"Regular\",\n" +
					           "        \"ecomGstn\": null,\n" +
					           "        \"rate\": 5,\n" +
					           "        \"taxableValue\": 2500,\n" +
					           "        \"cessAmount\": null\n" +
					           "      },\n" +
					           "      {\n" +
					           "        \"gstnNo\": \"22AAAAA0000A1Z5\",\n" +
					           "        \"invoiceNo\": null,\n" +
					           "        \"invoiceDate\": \"11/07/2017\",\n" +
					           "        \"invoiceValue\": 2873,\n" +
					           "        \"placeOfSupply\": \"100-MAHARASHTRA\",\n" +
					           "        \"reverseCharge\": \"N\",\n" +
					           "        \"invoiceType\": \"Regular\",\n" +
					           "        \"ecomGstn\": null,\n" +
					           "        \"rate\": 18,\n" +
					           "        \"taxableValue\": 210,\n" +
					           "        \"cessAmount\": null\n" +
					           "      },\n" +
					           "      {\n" +
					           "        \"gstnNo\": \"22EEEEE1111A2D2\",\n" +
					           "        \"invoiceNo\": null,\n" +
					           "        \"invoiceDate\": \"11/07/2017\",\n" +
					           "        \"invoiceValue\": 537,\n" +
					           "        \"placeOfSupply\": \"411-MAHARASHTRA\",\n" +
					           "        \"reverseCharge\": \"N\",\n" +
					           "        \"invoiceType\": \"Regular\",\n" +
					           "        \"ecomGstn\": null,\n" +
					           "        \"rate\": 5,\n" +
					           "        \"taxableValue\": 208,\n" +
					           "        \"cessAmount\": null\n" +
					           "      },\n" +
					           "      {\n" +
					           "        \"gstnNo\": \"22EEEEE1111A2D2\",\n" +
					           "        \"invoiceNo\": null,\n" +
					           "        \"invoiceDate\": \"11/07/2017\",\n" +
					           "        \"invoiceValue\": 537,\n" +
					           "        \"placeOfSupply\": \"411-MAHARASHTRA\",\n" +
					           "        \"reverseCharge\": \"N\",\n" +
					           "        \"invoiceType\": \"Regular\",\n" +
					           "        \"ecomGstn\": null,\n" +
					           "        \"rate\": 18,\n" +
					           "        \"taxableValue\": 270,\n" +
					           "        \"cessAmount\": null\n" +
					           "      },\n" +
					           "      {\n" +
					           "        \"gstnNo\": \"22ASAIS8558A8AS\",\n" +
					           "        \"invoiceNo\": \"4\",\n" +
					           "        \"invoiceDate\": \"29/07/2017\",\n" +
					           "        \"invoiceValue\": 6650,\n" +
					           "        \"placeOfSupply\": null,\n" +
					           "        \"reverseCharge\": \"N\",\n" +
					           "        \"invoiceType\": \"Regular\",\n" +
					           "        \"ecomGstn\": null,\n" +
					           "        \"rate\": 0,\n" +
					           "        \"taxableValue\": 4000,\n" +
					           "        \"cessAmount\": null\n" +
					           "      },\n" +
					           "      {\n" +
					           "        \"gstnNo\": \"22ASAIS8558A8AS\",\n" +
					           "        \"invoiceNo\": \"4\",\n" +
					           "        \"invoiceDate\": \"29/07/2017\",\n" +
					           "        \"invoiceValue\": 6650,\n" +
					           "        \"placeOfSupply\": null,\n" +
					           "        \"reverseCharge\": \"N\",\n" +
					           "        \"invoiceType\": \"Regular\",\n" +
					           "        \"ecomGstn\": null,\n" +
					           "        \"rate\": 5,\n" +
					           "        \"taxableValue\": 1000,\n" +
					           "        \"cessAmount\": null\n" +
					           "      },\n" +
					           "      {\n" +
					           "        \"gstnNo\": \"22ASAIS8558A8AS\",\n" +
					           "        \"invoiceNo\": \"5\",\n" +
					           "        \"invoiceDate\": \"31/07/2017\",\n" +
					           "        \"invoiceValue\": 59863,\n" +
					           "        \"placeOfSupply\": null,\n" +
					           "        \"reverseCharge\": \"N\",\n" +
					           "        \"invoiceType\": \"Regular\",\n" +
					           "        \"ecomGstn\": null,\n" +
					           "        \"rate\": 0,\n" +
					           "        \"taxableValue\": 28125,\n" +
					           "        \"cessAmount\": null\n" +
					           "      },\n" +
					           "      {\n" +
					           "        \"gstnNo\": \"22ASAIS8558A8AS\",\n" +
					           "        \"invoiceNo\": \"5\",\n" +
					           "        \"invoiceDate\": \"31/07/2017\",\n" +
					           "        \"invoiceValue\": 59863,\n" +
					           "        \"placeOfSupply\": null,\n" +
					           "        \"reverseCharge\": \"N\",\n" +
					           "        \"invoiceType\": \"Regular\",\n" +
					           "        \"ecomGstn\": null,\n" +
					           "        \"rate\": 12,\n" +
					           "        \"taxableValue\": 28125,\n" +
					           "        \"cessAmount\": null\n" +
					           "      },\n" +
					           "      {\n" +
					           "        \"gstnNo\": \"22ASAIS8558A8AS\",\n" +
					           "        \"invoiceNo\": \"5\",\n" +
					           "        \"invoiceDate\": \"31/07/2017\",\n" +
					           "        \"invoiceValue\": 59863,\n" +
					           "        \"placeOfSupply\": null,\n" +
					           "        \"reverseCharge\": \"N\",\n" +
					           "        \"invoiceType\": \"Regular\",\n" +
					           "        \"ecomGstn\": null,\n" +
					           "        \"rate\": 28,\n" +
					           "        \"taxableValue\": 100,\n" +
					           "        \"cessAmount\": null\n" +
					           "      }\n" +
					           "    ]");
			
			
			JsonNode node2 = node.get(0);
			Iterator<String> itr = node2.fieldNames();
			List<String> keyList = new ArrayList<String>();
			while (itr.hasNext()) {
				keyList.add(itr.next());

			}
			System.out.println("Key : ");
			PrintWriter pw = new PrintWriter(new File("C:/temp/test.csv"));
			StringBuilder sb = null;
			for (int i = 0; i < keyList.size(); i++) {
				sb = new StringBuilder();
				sb.append(keyList.get(i));
				sb.append(',');
			    pw.write(sb.toString());
			      
			    System.out.println("Key : "+keyList.get(i));
			}
			sb = new StringBuilder();
		    sb.append('\n');
		    pw.write(sb.toString());
		    sb = new StringBuilder();
			for (JsonNode temp : node) {
				for (int i = 0; i < keyList.size(); i++) {
					if( i==2){
					    sb.append(getDate(String.valueOf(temp.get(keyList.get(i))).replace("\"", ""), "dd/MM/yyyy"));
						sb.append(',');
						}else if( i==3){
							 sb.append(Double.parseDouble(temp.get(keyList.get(i)).toString().replace("\"", "")));
							 sb.append(',');
						}else{
							 sb.append(temp.get(keyList.get(i)).toString().equals("null") ? "" : temp.get(keyList.get(i)).toString()
						    .replace("\"", ""));
						    sb.append(',');
						}
				}
				sb.append('\n');
				pw.write(sb.toString());
			}
			System.out.println(sb);
		
			pw.close();
			//System.out.println(keyList);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
	        System.out.println("done!");
	}
	
	public static String getDate(String dateString , String pattern) {
		  SimpleDateFormat format = null;
		  Date date1 = null;
		  try {
		   format = new SimpleDateFormat(pattern);
		   date1 = format.parse(dateString);
           format = new SimpleDateFormat("dd-MMM-yyyy");
		  } catch (ParseException e) {
		   e.printStackTrace();
		  }
		  return format.format(date1);
		 }
	
	
}

