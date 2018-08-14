package com.erpproject.common;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ExcelReportWrite {
	
	
	// Your file name
	private static final String FILE_NAME = "D:/MyFirstExcel.xls";

	public static void main(String[] args) {

		try {
			excelSheetWrite();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * call excelSheetWrite
	 */
	public static void excelSheetWrite() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		Workbook wb = new HSSFWorkbook();
		Cell c = null;

		// Cell style for header row
		CellStyle cs = wb.createCellStyle();
		// cs.setFillForegroundColor(HSSFColor.LIME.index);
		cs.setFillForegroundColor(IndexedColors.WHITE.getIndex());
		cs.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		cs.setAlignment(CellStyle.ALIGN_CENTER);
		cs.setBorderLeft((short) 1);
		cs.setBorderRight((short) 1);
		cs.setBorderTop((short) 1);
		cs.setBorderBottom((short) 1);

		// Set font
		Font font = wb.createFont();
		font.setFontName(HSSFFont.FONT_ARIAL);
		font.setFontHeightInPoints((short) 14);
		// font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		font.setColor(HSSFColor.BLACK.index);
		cs.setFont(font);
		
		List<String> ListSheet = new ArrayList<String>();
		// New Sheet
		Sheet sheet1 = null;
		sheet1 = wb.createSheet("Excel Report Data");
		Sheet sheet2 = null;
		sheet2 = wb.createSheet("New Excel Report Data");

		// set your json listOfObject

		JsonNode node = mapper
				.readTree("[{" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"2\",\n" +
            "\t\t\t\"invoiceDate\": 1501785000000,\n" +
            "\t\t\t\"invoiceValue\": 11610,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 0,\n" +
            "\t\t\t\"sum\": 9000,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"2\",\n" +
            "\t\t\t\"invoiceDate\": 1501785000000,\n" +
            "\t\t\t\"invoiceValue\": 11610,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 18,\n" +
            "\t\t\t\"sum\": 1000,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"2\",\n" +
            "\t\t\t\"invoiceDate\": 1501785000000,\n" +
            "\t\t\t\"invoiceValue\": 11610,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 28,\n" +
            "\t\t\t\"sum\": 1000,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"9\",\n" +
            "\t\t\t\"invoiceDate\": 1501785000000,\n" +
            "\t\t\t\"invoiceValue\": 3885,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 0,\n" +
            "\t\t\t\"sum\": 816,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"9\",\n" +
            "\t\t\t\"invoiceDate\": 1501785000000,\n" +
            "\t\t\t\"invoiceValue\": 3885,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 18,\n" +
            "\t\t\t\"sum\": 2240,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"9\",\n" +
            "\t\t\t\"invoiceDate\": 1501785000000,\n" +
            "\t\t\t\"invoiceValue\": 3885,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 28,\n" +
            "\t\t\t\"sum\": 200,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"1\",\n" +
            "\t\t\t\"invoiceDate\": 1501871400000,\n" +
            "\t\t\t\"invoiceValue\": 6,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 28,\n" +
            "\t\t\t\"sum\": 5,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"10\",\n" +
            "\t\t\t\"invoiceDate\": 1501871400000,\n" +
            "\t\t\t\"invoiceValue\": 10855,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 0,\n" +
            "\t\t\t\"sum\": 9816,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"10\",\n" +
            "\t\t\t\"invoiceDate\": 1501871400000,\n" +
            "\t\t\t\"invoiceValue\": 10855,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 18,\n" +
            "\t\t\t\"sum\": 769,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"12\",\n" +
            "\t\t\t\"invoiceDate\": 1501871400000,\n" +
            "\t\t\t\"invoiceValue\": 18368,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 0,\n" +
            "\t\t\t\"sum\": 1020,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"12\",\n" +
            "\t\t\t\"invoiceDate\": 1501871400000,\n" +
            "\t\t\t\"invoiceValue\": 18368,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 18,\n" +
            "\t\t\t\"sum\": 14625,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"1\",\n" +
            "\t\t\t\"invoiceDate\": 1502044200000,\n" +
            "\t\t\t\"invoiceValue\": 3204,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 0,\n" +
            "\t\t\t\"sum\": 272.46,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"1\",\n" +
            "\t\t\t\"invoiceDate\": 1502044200000,\n" +
            "\t\t\t\"invoiceValue\": 3204,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 28,\n" +
            "\t\t\t\"sum\": 2250,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"13\",\n" +
            "\t\t\t\"invoiceDate\": 1502044200000,\n" +
            "\t\t\t\"invoiceValue\": 13,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 28,\n" +
            "\t\t\t\"sum\": 10,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"2\",\n" +
            "\t\t\t\"invoiceDate\": 1502044200000,\n" +
            "\t\t\t\"invoiceValue\": 365,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 28,\n" +
            "\t\t\t\"sum\": 225,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"3\",\n" +
            "\t\t\t\"invoiceDate\": 1502044200000,\n" +
            "\t\t\t\"invoiceValue\": 768,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 28,\n" +
            "\t\t\t\"sum\": 600,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"4\",\n" +
            "\t\t\t\"invoiceDate\": 1502130600000,\n" +
            "\t\t\t\"invoiceValue\": 701,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 0,\n" +
            "\t\t\t\"sum\": 681.15,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"14\",\n" +
            "\t\t\t\"invoiceDate\": 1502908200000,\n" +
            "\t\t\t\"invoiceValue\": 10128,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 0,\n" +
            "\t\t\t\"sum\": 9800,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"14\",\n" +
            "\t\t\t\"invoiceDate\": 1502908200000,\n" +
            "\t\t\t\"invoiceValue\": 10128,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 28,\n" +
            "\t\t\t\"sum\": 100,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"55JHAHH7778A8A5\",\n" +
            "\t\t\t\"invoiceNo\": \"15\",\n" +
            "\t\t\t\"invoiceDate\": 1502908200000,\n" +
            "\t\t\t\"invoiceValue\": 43790,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 0,\n" +
            "\t\t\t\"sum\": 10020,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"55JHAHH7778A8A5\",\n" +
            "\t\t\t\"invoiceNo\": \"15\",\n" +
            "\t\t\t\"invoiceDate\": 1502908200000,\n" +
            "\t\t\t\"invoiceValue\": 43790,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 5,\n" +
            "\t\t\t\"sum\": 2000,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"55JHAHH7778A8A5\",\n" +
            "\t\t\t\"invoiceNo\": \"15\",\n" +
            "\t\t\t\"invoiceDate\": 1502908200000,\n" +
            "\t\t\t\"invoiceValue\": 43790,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 12,\n" +
            "\t\t\t\"sum\": 28125,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"16\",\n" +
            "\t\t\t\"invoiceDate\": 1503381600000,\n" +
            "\t\t\t\"invoiceValue\": 3498,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 5,\n" +
            "\t\t\t\"sum\": 3000,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"16\",\n" +
            "\t\t\t\"invoiceDate\": 1503381600000,\n" +
            "\t\t\t\"invoiceValue\": 3498,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 28,\n" +
            "\t\t\t\"sum\": 225,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"17\",\n" +
            "\t\t\t\"invoiceDate\": 1503381600000,\n" +
            "\t\t\t\"invoiceValue\": 480,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 5,\n" +
            "\t\t\t\"sum\": 170,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"17\",\n" +
            "\t\t\t\"invoiceDate\": 1503381600000,\n" +
            "\t\t\t\"invoiceValue\": 480,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 28,\n" +
            "\t\t\t\"sum\": 200,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"19\",\n" +
            "\t\t\t\"invoiceDate\": 1503426600000,\n" +
            "\t\t\t\"invoiceValue\": 34208,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 0,\n" +
            "\t\t\t\"sum\": 1020,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"19\",\n" +
            "\t\t\t\"invoiceDate\": 1503426600000,\n" +
            "\t\t\t\"invoiceValue\": 34208,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 18,\n" +
            "\t\t\t\"sum\": 28125,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"20\",\n" +
            "\t\t\t\"invoiceDate\": 1503513000000,\n" +
            "\t\t\t\"invoiceValue\": 128,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 28,\n" +
            "\t\t\t\"sum\": 100,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"21\",\n" +
            "\t\t\t\"invoiceDate\": 1503513000000,\n" +
            "\t\t\t\"invoiceValue\": 28478,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 12,\n" +
            "\t\t\t\"sum\": 25312.5,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"21\",\n" +
            "\t\t\t\"invoiceDate\": 1503513000000,\n" +
            "\t\t\t\"invoiceValue\": 28478,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 28,\n" +
            "\t\t\t\"sum\": 100,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"22\",\n" +
            "\t\t\t\"invoiceDate\": 1503513000000,\n" +
            "\t\t\t\"invoiceValue\": 320,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 28,\n" +
            "\t\t\t\"sum\": 250,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"23\",\n" +
            "\t\t\t\"invoiceDate\": 1503513000000,\n" +
            "\t\t\t\"invoiceValue\": 128,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 28,\n" +
            "\t\t\t\"sum\": 100,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"24\",\n" +
            "\t\t\t\"invoiceDate\": 1503513000000,\n" +
            "\t\t\t\"invoiceValue\": 1680,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 5,\n" +
            "\t\t\t\"sum\": 1600,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"25\",\n" +
            "\t\t\t\"invoiceDate\": 1503513000000,\n" +
            "\t\t\t\"invoiceValue\": 2388,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 5,\n" +
            "\t\t\t\"sum\": 2000,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"25\",\n" +
            "\t\t\t\"invoiceDate\": 1503513000000,\n" +
            "\t\t\t\"invoiceValue\": 2388,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 28,\n" +
            "\t\t\t\"sum\": 225,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"26\",\n" +
            "\t\t\t\"invoiceDate\": 1503513000000,\n" +
            "\t\t\t\"invoiceValue\": 2000,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 0,\n" +
            "\t\t\t\"sum\": 2000,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"27\",\n" +
            "\t\t\t\"invoiceDate\": 1503599400000,\n" +
            "\t\t\t\"invoiceValue\": 128,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 28,\n" +
            "\t\t\t\"sum\": 100,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"28\",\n" +
            "\t\t\t\"invoiceDate\": 1504117800000,\n" +
            "\t\t\t\"invoiceValue\": 320,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 28,\n" +
            "\t\t\t\"sum\": 250,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"12\",\n" +
            "\t\t\t\"shiftToState\": \"Arunachal Pradesh\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"29\",\n" +
            "\t\t\t\"invoiceDate\": 1504117800000,\n" +
            "\t\t\t\"invoiceValue\": 2900,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 0,\n" +
            "\t\t\t\"sum\": 800,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t\"gstnNo\": \"22ASAIS8558A8A9\",\n" +
            "\t\t\t\"invoiceNo\": \"29\",\n" +
            "\t\t\t\"invoiceDate\": 1504117800000,\n" +
            "\t\t\t\"invoiceValue\": 2900,\n" +
            "\t\t\t\"reverseCharge\": null,\n" +
            "\t\t\t\"invoiceType\": \"Regular\",\n" +
            "\t\t\t\"ecomGstn\": null,\n" +
            "\t\t\t\"rate\": 5,\n" +
            "\t\t\t\"sum\": 2000,\n" +
            "\t\t\t\"cessAmount\": null,\n" +
            "\t\t\t\"shiftToStateCode\": \"27\",\n" +
            "\t\t\t\"shiftToState\": \"Maharashtra\"\n" +
            "\t\t}\n" +
            "\t]");
		JsonNode node2 = node.get(0);
		Iterator<String> itr = node2.fieldNames();
		List<String> keyList = new ArrayList<String>();
		System.out.println("Key : ");
		while (itr.hasNext()) {
			keyList.add(itr.next());

		}
		System.out.println(keyList);
		System.out.println("Values : ");

		// Generate column headings
		Row row = sheet1.createRow(0);
		for (int i = 0; i < keyList.size(); i++) {
			c = row.createCell(i);
			c.setCellValue(keyList.get(i));
			c.setCellStyle(cs);

		}

		// Generate column data
		int index = 1;
		for (JsonNode temp : node) {
			row = sheet1.createRow(index);
			for (int i = 0; i < keyList.size(); i++) {
				c = row.createCell(i);
				c.setCellValue(temp.get(keyList.get(i)).toString().equals("null") ? "" : temp.get(keyList.get(i)).toString()
						.replace("\"", ""));
				c.setCellStyle(cs);

			}
			index++;
			System.out.println();
		}

		// Write excel-sheet
		try {

			FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
			wb.write(outputStream);
			wb.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
