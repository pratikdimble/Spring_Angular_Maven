package com.erpproject.common;

public interface IReportConstants {
	
	String PDF = "pdf";
	String XLS = "xls";
	
	String DOT_JRXML = ".jrxml";
	String DOT_JASPER = ".jasper";
	
	String DOT_CSV = ".csv";
	String DOT_XLS = ".xls";
	
	String BASE_PATH = "resources\\";
	String ROOT_PATH = "jasperReports\\";
	
	String INVOICE_REPORT = "invoiceJasper\\";
	
	String FISCAL_REPORT = "fiscalJasper\\";
	String TRIAL_BALANCE_DETAIL_TRAS = "trailDetails_report";
	String TRIAL_BALANCE_OPN_CLS_BALANCE = "trail_opening_closing_report";
	
	String GROUP_SUMMERY_DETAILS = "Details_report";
	String GROUP_SUMMERY_OPN_CLS_BALANCE = "opening_closing_report";
	
	
	String PURCHASE_ORDER ="purchaseOrder";
	String SALES_ESTIMATE="salesEstimate";
	String SALES_INVOICE = "salesInvoice";
	String GRN_INVOICE = "grnInvoice";
	String DELIVERY_NOTE_INVOICE = "deliveryNoteInvoice";
	String SALES_ORDER = "salesOrder";
	String GRN = "grn";
	String DELIVERY_NOTE = "deliveryNote";
	String SALES_INVENTORY_SUBREPORT = "inventory_details_subreport";
	String TAX_SUMMARY_SUBREPORT = "tax_summary_subreport";
	String SUBREPORT_DIR = "SUBREPORT_DIR";
	String GST_REPORT = "gstServiceInvoice";
	String SERVICE_ORDER = "serviceOrderInvoice";
	String SERVICE_ESTIMATE = "serviceEstimateInvoice";
	String CAPITAL_PO ="capitalPO";
	String SERVICE_PO ="servicePO";
	/****COMMON PARAMS*****/
	String COMPANY_ID = "companyId";
	String COMPANY_NAME="companyName";
	String COMPANY_ADDRESS="companyAddress";
	String EMAIL_ID="emailId";
	String GSTN_NO="gstnNo";
	String MOBILE_NO = "mobileNo";
	String VIEW_TYPE ="viewType";
	String TRANSACTION_ID = "transactionId";
	String GROUP_ID ="groupId";
	String GROUP_NAME ="groupName";
	String START_DATE ="startDate";
	String FROM_DATE ="fromDate";
	String TO_DATE="toDate";
	String VOUCHERCOPYNAME="voucherCopyName";
	/****END*****/
	
	/****PARAMS FOR INVOICES*****/
		
		String PARTY_GROUP_ID = "partyGroupId";
		String EXPENCES_GROUP_ID = "expensesGroupId";
		String TAX_GROUP_ID = "taxGroupId";
		String GST_TAX_MPPR_ID = "gstTaxMpprId";
		String INVOICE_SUBREPORT_DIR = BASE_PATH+ROOT_PATH+INVOICE_REPORT;
	/****END*****/
		
	String PAYMENT_OR_RECEIPT = "paymentOrReceiptVocher";
	
	/****PARAMS FOR PAYMENT_OR_RECEIPT*****/
	String  SUPER_PAYMENT_RECEIPT_VOUCHER_TYPE = "voucherTypeIds";
	String GROUPIDS = "groupIds";
	/****END*****/
}
