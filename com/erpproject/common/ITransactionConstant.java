package com.erpproject.common;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public interface ITransactionConstant
	{

		
		
		Integer OTHER_TERRITORY_STATEID = 3;
		String OTHER_TERRITORY_STATE_CODE = "97";
		/**
		 * VOUCHER TYPES
		 */
		int SUPER_CONTRA_VOUCHER_ID = 1;
		int CASH_DEPOSIT_VOUCHER_ID = 12;
		int CASH_WITHDRAWAL_VOUCHER_ID = 13;
		int CASH_INTER_BANK_TRANSFER_VOUCHER_ID = 14;
		
		int SUPER_PAYMENT_VOUCHER_ID = 2;
		int BANK_PAYMENT_VOUCHER_ID = 5;
		int CASH_PAYMENT_VOUCHER_ID = 6;
		
		int SUPER_RECEIPT_VOUCHER_ID = 3;
		int BANK_RECEIPT_VOUCHER_ID = 7;
		int CASH_RECEIPT_VOUCHER_ID = 8;
		
		int SUPER_JOURNAL_VOUCHER_ID = 4;
		Integer JOURNAL_GST[] = {41,42,43,50,70,71};
		Integer JOURNAL_GST_PURCHASE[] = {41,42,43};
		Integer JOURNAL_GST_SALE[] = {50};
        Integer PURCHASE_GST[] = {56,57};
        Integer SALES_GST[] = {58,59};
        Integer CREDIT_NOTE_SERVICE[] = {70,71};
        Integer DEBIT_NOTE_SERVICE[] = {70,71};
		int SUPER_PURCHASE_VOUCHER_ID = 20;
		int SUB_PURCHASE_VOUCHER_ID = 18;
		int SUPER_SALES_VOUCHER_ID = 21;
		int SUB_SALES_VOUCHER_ID = 19;
		
		int SERVICE_SUPPLY_VOUCHER_ID = 50;
		
		Integer PURCHASE_SALE_VOUCHER_IDS[] = {20,21,33,34,85,87};
		
		int SUPER_DEBIT_NOTE_VOUCHER_ID = 33;
		int SUPER_CREDIT_NOTE_VOUCHER_ID = 34;
		
		int SUPER_PURCHASE_ORDER_VOUCHER_ID = 37;
		int SUPER_GRN_VOUCHER_ID = 44;
		
		int SUPER_SALES_ESTIMATE_VOUCHER_ID = 46;
		int SUPER_SALES_ORDER_VOUCHER_ID = 39;
		int SUPER_DLN_VOUCHER_ID = 48;
		int SUPER_CAPITAL_PURCHASE_ORDER_VOUCHER_ID = 37;
		//int SUPER_CAPITAL_SALES_ORDER_VOUCHER_ID = 46;
		int SUPER_SERVICE_SALES_ESTIMATE_VOUCHER_ID = 58;
		int SUPER_SERVICE_PURCHASE_VOUCHER_ID = 57;
		int SUPER_CAPITAL_PURCHASE_VOUCHER_ID = 56;
		int SUPER_SERVICE_SUPPLY_VOUCHER_ID = 59;
		int SUPER_CREDIT_NOTE_SERVICE_ID = 4;
		int SUPER_DEBIT_NOTE_SERVICE_ID = 4;
		int SUPER_STOCK_JOURNAL_ID = 72;
		int SUPER_INWARD_STOCK_JOURNAL = 62;
		int SUPER_OUTWARD_STOCK_JOURNAL = 64;
		int SUB_STOCK_JOURNAL_ID = 73;
		
		int SERVICE_DEBIT_NOTE = 71;
		int SERVICE_CREDIT_NOTE = 70;
		
		
		Integer SUPER_ACCOUNTING_VOUCHER[] = {SUPER_CONTRA_VOUCHER_ID,
										  SUPER_PAYMENT_VOUCHER_ID,
										  SUPER_RECEIPT_VOUCHER_ID,
										  SUPER_JOURNAL_VOUCHER_ID,
										  SUPER_PURCHASE_VOUCHER_ID,
										  SUPER_SALES_VOUCHER_ID,
										  SUPER_DEBIT_NOTE_VOUCHER_ID,
										  SUPER_CREDIT_NOTE_VOUCHER_ID,
										  SUPER_INWARD_STOCK_JOURNAL,
										  SUPER_OUTWARD_STOCK_JOURNAL};
		/**
		 * GROUP IDs
		 */
		int GST_GROUP_ID = 16;
		int SUNDRY_CREDITORS =24;
		int CASH_GROUP_ID = 34;
		int BANK_GROUP_ID = 35;
		int ODCC_BANK_GROUP_ID = 8;
		int SUNDRY_DEBTORS_GROUP_ID = 36;
		int PURCHASE_GROUP_ID = 109;
		int SALES_GROUP_ID = 110;
		
		Integer ARRAY_BANK_GROUP_IDS[] = {8,35};
		Integer STOCK_ITEM_GROUP_ID = 37;
		
		Integer CREDITORS_CASH_DEBTORS_GROUP_IDS [] = {24,36,34};
		
		Integer CREDITORS_CASH_DEBTORS_STOCK_GROUP_IDS [] = {24,36,34,37};
		Integer STOCK_JOURNAL_SUPER_GROUP_ID [] = {72};
		
		BigInteger SUPER_STOCK_GROUP_PRIMARY_ID = BigInteger.ONE;
		Integer ARRAY_PROFIT_LOSS_GROUP_IDS[] = {109,110,43,47,63,64};
	    List<Integer> LIST_PROFIT_LOSS_GROUP_IDS  =  Arrays.asList(109,110,43,47,63,64);
	    List<Integer> LIST_PURCHASE_SALE_GROUP_IDS  =  Arrays.asList(109,110);
		
		
		/*common ledger id for puchase and sales*/
		int PURCHASE_LEDGERID = 70;
		int ROUNDEDOFF_PURCHASE_LEDGERID = 71;
		int SALES_LEDGERID = 72;
		int ROUNDEDOFF_SALES_LEDGERID = 73;
		
		/*ledger if for debit note and credit note*/
		int PURCHASE_RETURN_LEDGERID = 282;
		int ROUNDEDOFF_PURCHASE_RETURN_LEDGERID = 71;
		int SALES_RETURN_LEDGERID = 283;
		int ROUNDEDOFF_SALES_RETURN_LEDGERID = 73;
		
		
		// Journal Groups for Credit
		Integer SALARY_PAYABLE_GROUPID[] =
			{ 101 };
		Integer ELECTRICITY_PAYABLE_GROUPID[] =
			{ 102 };
		Integer RENT_PAYABLE_GROUPID[] =
			{ 103 };
		Integer TELEPHONE_OR_INTERNET_EXPENSES_PAYABLE_GROUPID[] =
			{ 104 };
		Integer COMMISSION_PAYABLE_GROUPID[] =
			{ 105 };
		Integer LABOUR_CHARGES_PAYABLE_GROUPID[] =
			{ 106 };
		Integer CREDITOR_FOR_EXPENSES_GROUPID[] =
			{ 107 };
		Integer CREDITOR_FOR_CAPITAL_GOODS_GROUPID[] =
			{ 108 };

		// Journal Groups for Debit
		Integer SALARY[] =
			{ 45, 48 };
		Integer ELECTRICITY[] =
			{ 51 };
		Integer RENT[] =
			{ 54 };
		Integer STATIONERY[] =
			{ 52 };
		Integer REPAIRS[] =
			{ 56 };
		Integer TELEPHONE[] =
			{ 49 };
		Integer COMMISSION[] =
			{ 55 };
		Integer WAGES[] =
			{ 44 };
		Integer TRANSPORT_EXPENSES[] =
			{ 45 };
		Integer[] OTHER =
			{ 43, 47 };
		 Integer[] FIXED_ASSESTS =
			{ 25 };

		// Voucher Types
		int SALARY_PAYABLE_VOUCHERID = 22;
		int ELECTRICITY_PAYABLE_VOUCHERID = 23;
		int RENT_PAYABLE_VOUCHERID = 24;
		int STATIONARY_PURCHASES_VOUCHERID = 25;
		int REPAIRS_AND_MAINTENANCE_VOUCHERID = 26;
		int TELEPHONE_OR_INTERNET_EXPENSES_PAYABLE_VOUCHERID = 27;
		int COMMISSION_PAYABLE_VOUCHERID = 28;
		int LABOUR_CHARGES_PAYABLE_VOUCHERID = 29;
		int FIXED_ASSET_PURCHASES_VOUCHERID = 30;
		int TRANSPORT_EXPENSES_PAYABLE_VOUCHERID = 31;
		int OTHER_EXPENSES_PAYABLE_VOUCHERID = 32;
		
	    /** Group Id For Stock Opening Details*/
	    //Integer[] groupIdsforStockOpening = {20 , 21 };
	    
	    //----------- Transaction Types
	    
	    String TRANSACTION_SE = "SE";
	    String TRANSACTION_SO = "SO";
	    String TRANSACTION_DLN = "DLN";
	    String TRANSACTION_SI = "SI";
	    String TRANSACTION_SSE = "SSE";
	    String TRANSACTION_SPO = "SPO";
	    String TRANSACTION_CPO = "CPO";
	    String TRANSACTION_SSO = "SSO";
	    
	    String TRANSACTION_PO = "PO";
	    String TRANSACTION_GRN = "GRN";
	    String TRANSACTION_PI = "PI";
	    
	    //Master's excelsheet type
	    String MASTER_LEDGER ="LedgerMaster";
	    String MASTER_STOCK_GROUP ="StockGroupCreation";
	    String MASTER_STOCK_UNIT ="StockUnitCreation";
	    String MASTER_GROUP ="GroupMaster";
	    String MASTER_VOUCHER_TYPE ="VoucherTypeMaster";
	    String MASTER_STOCK_ITEM ="StockItemMaster";
	    String MASTER_COST_CENTER ="CostCenterMaster";
	    String MASTER_COST_CATEGORY ="CostCategoryMaster";
	    String MASTER_WAREHOUSE ="WareHouseMaster";
	    
	    
	    Integer NORMAL_SALE[] = {19};
	    Integer POINT_OF_SALE[] = {89};
	}
