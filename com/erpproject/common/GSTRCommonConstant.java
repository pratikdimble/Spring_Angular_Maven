package com.erpproject.common;

public interface GSTRCommonConstant {

	String B_2_B  = "b2b";
	String B_2_CL = "b2cl";
	String B_2_CS = "b2cs";
	String CDNR   = "cdnr";
	String CDNUR  = "cdnur";
	String EXP    = "exp";
	String AT     = "at";
	String AT_ADJ = "atadj";
	String EXEMP  = "exemp";
	String HSN    = "hsn";
	String DOCS   = "docs";
	
	String INTER_STATE_REGI_SUPPLIES = "Inter-State supplies to registered persons";
	String INTER_STATE_UNREGI_SUPPLIES = "Inter-State supplies to unregistered persons";
	
	String INTRA_STATE_REGI_SUPPLIES = "Intra-State supplies to registered persons";
	String INTRA_STATE_UNREGI_SUPPLIES = "Intra-State supplies to unregistered persons";
	
	String[] B_2_B_HEADERS = {"GSTIN/UIN of Recipient",
							  "Receiver Name",
							  "Invoice Number",
							  "Invoice date",
							  "Invoice Value",
							  "Place Of Supply",
							  "Reverse Charge",
							  "Invoice Type",
							  "E-Commerce GSTIN",
							  "Rate",
							  "Taxable Value",
							  "Cess Amount"
							  };
	
	String[] B_2_CL_HEADERS = {"Invoice Number",
								"Invoice date",
								"Invoice Value",
								"Place Of Supply",
								"Rate",
								"Taxable Value",
								"Cess Amount",
								"E-Commerce GSTIN"
							   };
	
	String[] B_2_CS_HEADERS = {"Type",
								"Place Of Supply",
								"Rate",
								"Taxable Value",
								"Cess Amount",
								"E-Commerce GSTIN"
							  };
	
	String[] AT_HEADERS = {"Place Of Supply",
							"Rate",
							"Gross Advance Received",
							"Cess Amount"
						  };
	
	String[] GSTR_ONE_CDNUR_HEADERS = {
			
			 "UR Type",
			 "Note/Refund Voucher Number",
			 "Note /Refund Voucher Date",
			 "Document Type",
			 "Note/Refund Voucher Number",
			 "Note /Refund Voucher Date",
			 "Reason For Issuing document",
			 "Place Of Supply",
			 "Note /Refund Voucher Value",
			 "Rate",
			 "Taxable Value",
			 "Cess Amount",
			 "Pre GST"
			
		  };
	
	
	String[] GSTR_ONE_CDNR_HEADERS = 
		{
			   "GSTIN/UIN of Recipient",
			  "Invoice/Advance Receipt Number",
			  "Invoice/Advance Receipt date",
			  "Note/Refund Voucher Number",
			  "Note /Refund Voucher Date",
			  "Document Type",
			  "Reason For Issuing document",
			  "Place Of Supply",
			  "Note /Refund Voucher Value",
			  "E-Commerce GSTIN",
			  "Rate",
			  "Taxable Value",
			  "Cess Amount",
			  "Pre GST"
		  };
	
	String[] GSTR_ONE_EXP_HEADERS = {
			
			 "Export Type",
			 "Invoice Number",
			 "Invoice date",
			 "Invoice Value",
			 "Port Code",
			 "Shipping Bill Number",
			 "Shipping Bill Date",
			 "Rate",
			 "Applicable % of Tax Rate",
			 "Taxable Value",
			 "Cess Amount",
		  };
	
	String[] GSTR_ONE_EXEMP_HEADERS = {
			
			 "Description",
			 "Nil Rated Supplies",
			 "Exempted(other than nil rated/non GST supply)",
			 "Non-GST Supplies",
		  };
	
	String[] GSTR_ONE_HSN_SUMMARY_HEADERS = {
			
			 "HSN",
			 "Description",
			 "UQC",
			 "Total Quantity",
			 "Total Value",
			 "Taxable Value",
			 "Integrated Tax Amount",
			 "Central Tax Amount",
			 "State/UT Tax Amount",
			 "Cess Amount",
		  };
}
