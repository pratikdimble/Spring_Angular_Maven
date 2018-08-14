package com.erpproject.common;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.core.io.ClassPathResource;
/**
 * @Author: Chetna Ghebad
 * @Description: created for to read the json file of state list
 * @Date:17-04-2018
 * */

public class StateList {

	private StateList() {

	}

	public static Object getStateList() {
		JSONParser parser = new JSONParser();
		BufferedReader br = null;
		try {
			ClassPathResource excelFile = new ClassPathResource("migration/state.json");
			Object obj = parser.parse(new FileReader(excelFile.getFile()));
			return obj;

		} catch (ParseException | IOException e) {
			e.printStackTrace();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
public static void main(String args[]) {
	System .out.println("hello...");
}
}
