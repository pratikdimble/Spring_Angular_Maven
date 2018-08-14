package com.erpproject.common;

public interface ICommonConstants {
	String SUCCESS = "success";
	String ERROR = "error";
	
	boolean TRUE = true;
	boolean FALSE = false;
	
	char ACTIVE = 'A';
	char INACTIVE = 'I';
	
	char YES ='Y';
	char NO ='N';
	
	Object NULL = null;
	
	String PLATFORM_MOB = "MOB";
	Integer PLATFORM_MOB_MODULE_ID = 81;
	String PLATFORM_WEB = "WEB";
	
	/*MESSAGE ON JSP*/
	String COMMON_SUCCESS="Added successfully.";
	String COMMON_DELETE="Deleted successfully.";
	String COMMON_UPDATE="Updated successfully.";
	String ALREADY_EXIST="Already Exists.";
	String COMMON_ERROR="Fail";
	
	String VENDOR_ADDED_SUCCESSFULLY = "<strong>Success!!</strong>&nbsp;Data added successfully.";
	String CA_IS_NOT_EXITS = "<strong>Success!!</strong>&nbsp;CA is already exists.";
	String USER_ADDED_SUCCESSFULLY =  "<strong>Success!!</strong>&nbsp;User added successfully.";
	String USER_UPDATED_SUCCESSFULLY = "<strong>Success!!</strong>&nbsp;User updated successfully.";
	String PACKAGE_ADDED_SUCCESSFULLY = "Success!!Packaging Detail added successfully.";
	/* MESSAGE FOR NON REGISTERED PATIENTS */	
	String REGISTERED="<strong>Error!!</strong>&nbsp;Vendor already registered.";
	String NOT_REGISTERED="<strong>Error!!</strong>&nbsp;Vendor not registered.";
	
	String REGISTERED_CODE="100";
	String NOT_REGISTERED_CODE="101";
	
	String IN_HOUSE = "Y";
	String NOT_IN_HOUSE ="N";
	
	
	/*LOGIN RELATED MESSAGES*/
	
	String USER_NOT_REGISTERED = "<strong>Error!!</strong> &nbsp;User is not registered with us.";
	String INVALID_CREDENTIALS = "<strong>Error!!</strong> &nbsp;Invalid Credentials.";
	String PASSWORD_CHANGED = "<strong>Success!!</strong>&nbsp; Password changed successfully.";
	String CHANGE_PASS_MAIL = "<strong>Success!!</strong>&nbsp; Reset password link sent to your Email.";
	String CHANGE_PASS_LINK_EXPIRE = "<strong>Error!!</strong> &nbsp;Change Password link expired.";
	String CHANGE_PASS_LINK_VALID = "<strong>Error!!</strong> &nbsp;Change Password link is valid.";
	
	
	 String VENDOR_EMAIL_EXITES ="<strong>Error!!</strong> &nbsp;User email id is already exists.";
	 String VENDOR_PAN_EXITS = "<strong>Error!! </strong>&nbsp; Vendor PAN no is exists.";
	 String VENDOR_GSNT_EXITS = "<strong>Error!!</strong>&nbsp; Vendor GSTN no is exists.";
	 String USER_EMAIL_EXITS = "<strong>Error!! </strong>&nbsp; User email is already exists.";
	 String FILL_CA_DETAILS = " <strong>Error!!</strong>&nbsp; Please fill the CA details.";
	 String USER_NAME_EXITS = "<strong>Error!!</strong>&nbsp; Username is already exists.";
	 String USER_MOBILE_EXITS = "<strong>Error!! </strong>&nbsp; Mobile no is already exists.";
	 String CA_MEMBER_ID_EXITS = "<strong>Error!!</strong>&nbsp;  Membership number is already exists.";
	 String USER_DATA_SUCC = "<strong>Success!!</strong>&nbsp; Vendor detail saved successfully.";
	 String CA_DATA_SUCC = "<strong>Success!!</strong>&nbsp; CA details saved successfully.";
	
	 String USER_CREATE_SUCCESS = "<strong>Success!!</strong>&nbsp; Account created successfully.";
	 String USER_NAME_EXITS1 = " <strong>Error!! </strong>&nbsp;Username is already exists.";
	 String USER_MOBILE_EXITS1 = "<strong>Error!! </strong>&nbsp; Mobile no is already exists.";
	 String USER_EMAIL_EXITS1 = "<strong>Error!! </strong>&nbsp; User email is already exists.";
	
//	Constants for User Role
	
	int ADMIN_ROLE = 1;
	int CA_ROLE = 2;
	int OTHER_STAFF_ROLE =3;
	
	
//	Constants messages for saving data
	
	String DATA_SAVE_SUCESS="<strong>Success!!</strong>&nbsp; Data saved sucessfully.";
	String DATA_SAVE_FAIL="<strong>Error!!</strong>&nbsp; Data not saved sucessfully.";
	
	
	
	String COMPNAY_DATA_SAVE_SUCC = "<strong>Success!!</strong>&nbsp; Company registered successfully.";
	String COMPNAY_DATA_SAVE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to save company details.";
	String COMPNAY_DATA_UPDATE_SUCC = "<strong>Success!!</strong>&nbsp; Company details updated successfully.";
	String COMPNAY_DATA_UPDATE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to update company details.";
	String COMPANY_EXITS="<strong>Error!!</strong>&nbsp; Company name is already exists.";
	String COMPANY_MOBILE_EXITS ="<strong>Error!!</strong>&nbsp;Mobile no is already exists.";
	String COMPANY_EMAIL_EXITS = "<strong>Error!!</strong>&nbsp;Company email is already exists.";
	
	
	String BANK_ACCOUNT_EXITS="<strong>Error!!</strong>&nbsp;Bank Account is exists.";
	String COMPANAY_DETAILS_NOT_FOUND = "<strong>Error!!</strong>&nbsp;company details are not found.";
	

	
	/* Purchase Note and Sales Note */
	
	String PURCHASE_NOTE_SAVE_SUCCESS = "<strong>Success!!</strong>&nbsp;Debit note added successfully.";
	String PURCHASE_NOTE_SAVE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to add debit note.";
	
	String SALES_NOTE_SAVE_SUCCESS = "<strong>Success!!</strong>&nbsp;Credit note added successfully.";
	String SALES_NOTE_SAVE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to add credit note.";
	
	//Voucher Master Messages
	String VOUCHERNO_EXISTS = "<strong>Error!!</strong>&nbsp;Voucher type is already exists.";
	String VOUCHER_UPDATED = "<strong>Success!!</strong>&nbsp;Voucher type updated successfully.";
	String VOUCHER_ADDED = "<strong>Success!!</strong>&nbsp;Voucher type added successfully.";
	String VOUCHER_DELETED = "<strong>Success!!</strong>&nbsp;Voucher type deleted successfully.";
	String VOUCHER_NOT_ASSIGNED = "<strong>Error!!</strong>&nbsp;Ledger not assigned to company";
	String VOUCHER_COULD_NOT_DELETE = "<strong>Error!!</strong>&nbsp;Voucher type is primary could not be deleted";
	
	/*Transaction messages*/	
	String TRANSACTION_SAVE_SUCCESS = "<strong>Success!!</strong>&nbsp; Transaction added successfully.";
	String TRANSACTION_UPDATE_SUCCESS = "<strong>Success!!</strong>&nbsp; Transaction updated successfully.";
	String TRANSACTION_UPDATE_FAIL = "<strong>Success!!</strong>&nbsp; Failed to update transaction.";
	String TRANSACTION_SAVE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to add transaction.";
	String TRANSACTION_DETAIL_NULL = "<strong>Error!!</strong>&nbsp;Trsansaction details are null.";
	String DEBIT_NOTE_SERVICE_SAVE_SUCCESS = "<strong>Success!!</strong>&nbsp;Debit/Credit Note Service added successfully.";
	String CREDIT_NOTE_SERVICE_SAVE_SUCCESS = "<strong>Success!!</strong>&nbsp;Debit/Credit Note Service added successfully.";
	String JOURNAL_GST_EXPENSES_SAVE_SUCCESS = "<strong>Success!!</strong>&nbsp;GST Expenses entry added successfully.";
	String GST_PURCHASE_SAVE_SUCCESS = "<strong>Success!!</strong>&nbsp;Capital PO | Service PO entry added successfully.";
	String GST_SALES_SAVE_SUCESS ="<strong>Success!!</strong>&nbsp; Service Estimate | Service Supply Order entry added successfully." ;
	String GST_PURCHASE_UPDATE_SUCCESS = "<strong>Success!!</strong>&nbsp;Capital PO | Service PO entry updated successfully.";
	String GST_SALES_UPDATE_SUCCESS ="<strong>Success!!</strong>&nbsp; Service Estimate | Service Supply Order entry updated successfully." ;
	String GST_PURCHASE_UPDATE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to update Capital PO | Service PO entry.";
	String GST_SALES_UPDATE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to update Service Estimate | Service Supply Order entry.";
	String JOURNAL_GST_EXPENSES_SAVE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to add GST Expenses entry.";
	
	String PURCHASE_ENTRY_SAVE_SUCCESS = "<strong>Success!!</strong>&nbsp;Purchase entry added successfully.";
	String PURCHASE_ENTRY_SAVE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to add purchase entry.";
	
	String PURCHASE_ORDER_SAVE_SUCCESS = "<strong>Success!!</strong>&nbsp;Purchase Order added successfully.";
	String PURCHASE_ORDER_SAVE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to add purchase Order.";
	String PURCHASE_ORDER_UPDATE_SUCCESS = "<strong>Success!!</strong>&nbsp;Purchase Order updated successfully.";
	String PURCHASE_ORDER_UPDATE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to update purchase Order.";
	String SALES_ORDER_SAVE_SUCCESS = "<strong>Success!!</strong>&nbsp;Sales Order added successfully.";
	String SALES_ORDER_SAVE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to add Sales Order.";
	String SALES_ORDER_UPDATE_SUCCESS = "<strong>Success!!</strong>&nbsp;Sales Order updated successfully.";
	String SALES_ORDER_UPDATE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to update Sales Order.";
	String SALES_ESTIMATE_SAVE_SUCCESS = "<strong>Success!!</strong>&nbsp;Sales Estimate added successfully.";
	String SALES_ESTIMATE_SAVE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to add Sales Estimate.";
	String SALES_ESTIMATE_UPDATE_SUCCESS = "<strong>Success!!</strong>&nbsp;Sales Estimate updated successfully.";
	String SALES_ESTIMATE_UPDATE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to update Sales Estimate.";
	String PURCHASE_ENTRY_UPDATE_SUCCESS = "<strong>Success!!</strong>&nbsp;Purchase entry updated successfully.";
	String PURCHASE_ENTRY_UPDATE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to update purchase entry.";
	
	String SALES_ENTRY_SAVE_SUCCESS = "<strong>Success!!</strong>&nbsp;Sales entry added successfully.";
	String SALES_ENTRY_SAVE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to add sales entry.";
	
	String SALES_ENTRY_UPDATE_SUCCESS = "<strong>Success!!</strong>&nbsp;Sales entry updated successfully.";
	String SALES_ENTRY_UPDATE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to update sales entry.";
	
	String GRN_ORDER_SAVE_SUCCESS = "<strong>Success!!</strong>&nbsp;Goods Receipt Note added successfully.";
	String GRN_ORDER_UPDATE_SUCCESS = "<strong>Success!!</strong>&nbsp;Goods Receipt Note updated successfully.";
	String GRN_ORDER_SAVE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to add Goods Receipt Note.";
	String GRN_ORDER_UPDATE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to update Goods Receipt Note.";
	
	String DELIVERY_NOTE_SAVE_SUCCESS = "<strong>Success!!</strong>&nbsp;Delivery Note added successfully.";
	String DELIVERY_NOTE_SAVE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to add Delivery Note.";
	String DELIVERY_NOTE_UPDATE_SUCCESS = "<strong>Success!!</strong>&nbsp;Delivery Note updated successfully.";
	String DELIVERY_NOTE_UPDATE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to update Delivery Note.";
	
/*	ledgerMessages*/
	String LEDGER_SAVE_SUCCESS = "<strong>Success!!</strong>&nbsp;Ledger added successfully.";
	String LEDGER_UPDATE_SUCCESS = "<strong>Success!!</strong>&nbsp;Ledger updated successfully.";
	String LEDGER_DELETE_SUCCESS = "<strong>Success!!</strong>&nbsp;Ledger deleted successfully.";
	String LEDGER_SAVE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to save ledger.";
	String LEDGER_DELETE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to delete ledger.";
	String LEDGER_UPDATE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to update ledger.";
	String LEDGER_EXITS = "<strong>Error!!</strong>&nbsp;Ledger is already exists.";
	String LEDGER_SYSTEM_DEFINED = "<strong>Error!!</strong>&nbsp;Ledger is system defined could not be updated.";
	String LEDGER_NOT_ASSIGNED = "<strong>Error!!</strong>&nbsp;Ledger not assigned to company.";
	
	/*	customer / supplier Messages*/
	String SUPPLIER_CUSTOMER_SAVE_SUCCESS = "<strong>Success!!</strong>&nbsp;Supplier|Customer added successfully.";
	String SUPPLIER_CUSTOMER_SAVE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to save Supplier|Customer.";
	String SUPPLIER_CUSTOMER_EXITS = "<strong>Error!!</strong>&nbsp;Supplier|Customer is already exists.";

	String GROUP_SAVE_SUCCESS = "<strong>Success!!</strong>&nbsp; Group added successfully.";
	String GROUP_UPDATE_SUCCESS = "<strong>Success!!</strong>&nbsp; Group updated successfully.";
	String GROUP_DELETE_SUCCESS = "<strong>Success!!</strong>&nbsp;Group deleted successfully .";
	String GROUP_SAVE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to save Group.";
	String GROUP_DELETE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to delete Group.";
	String GROUP_UPDATE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to update Group.";
	String GROUP_EXITS = "<strong>Error!!</strong>&nbsp;Group is already exists.";
	String GROUP_SYSTEM_DEFINED_DELETE = "<strong>Error!!</strong>&nbsp;Group is system defined could not be deleted.";
	String GROUP_SYSTEM_DEFINED_UPDATE = "<strong>Error!!</strong>&nbsp;Group is system defined could not be updated.";
	String GROUP_NOT_ASSIGNED = "<strong>Error!!</strong>&nbsp;Group not assigned to company.";
	String GROUP_EXISTS = "<strong>Error!!</strong>&nbsp;Group name is already exists.";
	
	
	/*STOCK UNIT MESSAGES*/

	String UNIT_SAVE_SUCCESS = "<strong>Success!!</strong>&nbsp;Unit added successfully.";
	String UNIT_UPDATE_SUCCESS = "<strong>Success!!</strong> &nbsp;Unit updated successfully.";
	String UNIT_DELETE_SUCCESS = "<strong>Success!!</strong>&nbsp;Unit deleted successfully .";
	String UNIT_SAVE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to save unit.";
	String UNIT_DELETE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to delete unit.";
	String UNIT_UPDATE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to update unit.";
	String UNIT_SYSTEM_DEFINED_DELETE = "<strong>Error!!</strong>&nbsp;Unit is system defined could not be deleted.";
	String UNIT_SYSTEM_DEFINED_UPDATE = "<strong>Error!!</strong>&nbsp;Unit is system defined could not be updated.";
	String UNIT_NOT_ASSIGNED = "<strong>Error!!</strong>&nbsp;Unit not assigned to company.";
	String UNIT_EXISTS = "<strong>Error!!</strong>&nbsp;Unit is already exists.";
	
	
	String STOCKGROUP_SAVE_SUCCESS = "<strong>Success!!</strong>&nbsp;Stock group added successfully.";
	String STOCKGROUP_UPDATE_SUCCESS = "<strong>Success!!</strong>&nbsp;Stock group updated successfully.";
	String STOCKGROUP_DELETE_SUCCESS = "<strong>Success!!</strong>&nbsp;Stock group deleted successfully .";
	String STOCKGROUP_SAVE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to save stock group.";
	String STOCKGROUP_DELETE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to delete stock group.";
	String STOCKGROUP_UPDATE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to update stock group.";
	String STOCKGROUP_SYSTEM_DEFINED_DELETE = "<strong>Error!!</strong>&nbsp;Stock group is system defined could not be deleted.";
	String STOCKGROUP_SYSTEM_DEFINED_UPDATE = "<strong>Error!!</strong>&nbsp;Stock group is system defined could not be updated.";
	String STOCKGROUP_NOT_ASSIGNED = "<strong>Error!!</strong>&nbsp;Stock group not assigned to company.";
	String STOCKGROUP_EXISTS = "<strong>Error!!</strong>&nbsp;Stock group is already exists.";
	
	String STOCKITEM_SAVE_SUCCESS = "<strong>Success!!</strong>&nbsp;Stock item added successfully.";
	String STOCKITEM_UPDATE_SUCCESS = "<strong>Success!!</strong>&nbsp;Stock item updated successfully.";
	String STOCKITEM_DELETE_SUCCESS = "<strong>Success!!</strong>&nbsp;Stock item deleted successfully .";
	String STOCKITEM_SAVE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to save stock item.";
	String STOCKITEM_DELETE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to delete stock item.";
	String STOCKITEM_UPDATE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to update stock item.";
	String STOCKITEM_SYSTEM_DEFINED_DELETE = "<strong>Error!!</strong>&nbsp;Stock item is system defined could not be deleted.";
	String STOCKITEM_SYSTEM_DEFINED_UPDATE = "<strong>Error!!</strong>&nbsp;Stock item is system defined could not be updated.";
	String STOCKITEM_NOT_ASSIGNED = "<strong>Error!!</strong>&nbsp;Stock item not assigned to company.";
	String STOCKITEM_EXISTS = "<strong>Error!!</strong>&nbsp;Stock item is already exists.";
	String BATCHDETAILS_SAVE_SUCCESS = "<strong>Success!!</strong>&nbsp;Batch added successfully.";
	String BATCHDETAILS_UPDATE_SUCCESS = "<strong>Success!!</strong>&nbsp;Batch updated successfully.";
	String BARCODE_EXIST = "<strong>Error!!</strong>&nbsp;Barcode is already exist.";
	String BATCH_EXIST = "<strong>Error!!</strong>&nbsp;Batch is already exist.";
	String STOCKITEM_UPLOAD_SUCCESS = "<strong>Success!!</strong>&nbsp;Stock item uploaded successfully.";
	String STOCKITEM_UPLOAD_FAIL = "<strong>Error!!</strong>&nbsp;Failed to upload stock item.";
	
	
	String WAREHOUSE_SAVE_SUCCESS = "<strong>Success!!</strong>&nbsp;Warehouse added successfully.";
	String WAREHOUSE_UPDATE_SUCCESS = "<strong>Success!!</strong>&nbsp;Warehouse updated successfully.";
	String WAREHOUSE_DELETE_SUCCESS = "<strong>Success!!</strong>&nbsp;Warehouse deleted successfully .";
	String WAREHOUSE_SAVE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to save warehouse.";
	String WAREHOUSE_DELETE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to delete warehouse .";
	String WAREHOUSE_UPDATE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to update warehouse.";
	String WAREHOUSE_NOT_ASSIGNED = "<strong>Error!!</strong>&nbsp;Warehouse  not assigned to company.";
	String WAREHOUSE_EXISTS = "<strong>Error!!</strong>&nbsp;Warehouse is already exists.";
	
	String COSTCENTER_SAVE_SUCCESS = "<strong>Success!!</strong>&nbsp;Cost center added successfully.";
	String COSTCENTER_UPDATE_SUCCESS = "<strong>Success!!</strong>&nbsp;Cost center updated successfully.";
	String COSTCENTER_DELETE_SUCCESS = "<strong>Success!!</strong>&nbsp;Cost center deleted successfully .";
	String COSTCENTER_SAVE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to save cost center.";
	String COSTCENTER_DELETE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to delete cost center.";
	String COSTCENTER_UPDATE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to update cost center.";
	String COSTCENTER_EXISTS = "<strong>Error!!</strong>&nbsp;Cost center is already exists.";
																		
	String COSTCATEGORY_SAVE_SUCCESS = "<strong>Success!!</strong>&nbsp;Cost center category added successfully.";
	String COSTCATEGORY_UPDATE_SUCCESS = "<strong>Success!!</strong>&nbsp;Cost center category updated successfully.";
	String COSTCATEGORY_DELETE_SUCCESS = "<strong>Success!!</strong>&nbsp;Cost center category deleted successfully .";
	String COSTCATEGORY_SAVE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to save cost center category.";
	String COSTCATEGORY_DELETE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to delete cost center category.";
	String COSTCATEGORY_UPDATE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to update cost center category.";
	String COSTCATEGORY_EXISTS = "<strong>Error!!</strong>&nbsp;Cost center category is already exists.";
	
	
	String OPERATION_SAVE_SUCCESS = "<strong>Success!!</strong>&nbsp;Operation added successfully.";
	String OPERATION_UPDATE_SUCCESS = "<strong>Success!!</strong>&nbsp;Operation updated successfully.";
	String OPERATION_DELETE_SUCCESS = "<strong>Success!!</strong>&nbsp;Operation deleted successfully .";
	String OPERATION_SAVE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to save Operation.";
	String OPERATION_DELETE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to delete Operation.";
	String OPERATION_UPDATE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to update Operation.";
	String OPERATION_EXISTS = "<strong>Error!!</strong>&nbsp;Operation is already exists.";
	
	String BOM_ADDED = "<strong>Success!!</strong>&nbsp;Bill of material added successfully.";
	String BOM_UPDATED = "<strong>Success!!</strong>&nbsp;Bill of material updated successfully.";
	String BOM_REFERANCE_ALREADY_EXIST = "<strong>Error!!</strong>&nbsp;Bill of material referance is already exists.";
	
	String ROUTING_MASTER_ADDED = "<strong>Success!!</strong>&nbsp;Routing added successfully.";
	String ROUTING_MASTER_UPDATED = "<strong>Success!!</strong>&nbsp;Routing updated successfully.";
	String ROUTING_ALREADY_EXIST = "<strong>Error!!</strong>&nbsp;Routing is already exists.";
	
	//Manufacturing Order Messages
	String MANIFACTURING_ORDER_ADDED = "<strong>Success!!</strong>&nbsp;Manufacturing order added successfully.";
	String MANIFACTURING_ORDER_UPDATED = "<strong>Success!!</strong>&nbsp;Manufacturing order updated successfully.";
	String MANIFACTURING_ORDER_CONFIRMED = "<strong>Success!!</strong>&nbsp;Manufacturing Order confirmed successfully.";
	String MANIFACTURING_ORDER_CHECKED = "<strong>Success!!</strong>&nbsp;Product availability checked successfully.";
	String MANIFACTURING_ORDER_STARTED = "<strong>Success!!</strong>&nbsp;Manufacturing order started successfully.";
	String MANIFACTURING_ORDER_FINISHED = "<strong>Success!!</strong>&nbsp;Manufacturing order done successfully.";
	String MANIFACTURING_ORDER_CANCELED = "<strong>Success!!</strong>&nbsp;Manufacturing order canceled successfully.";
	String PRODUCT_SCRAPED = "<strong>Success!!</strong>&nbsp;Product scraped successfully.";
	String OPERATION_DELETED = "<strong>Success!!</strong>&nbsp;Operation Deleted successfully.";
	
	//Manufacturing Order Status
	Integer NEW = 1;
	Integer WAITING_FOR_RAW_MATERIAL = 2;
	Integer READY_TO_PRODUCE = 3;
	Integer IN_PROGRESS = 4;
	Integer DONE = 5;
	Integer CANCEL = 6;

	String ROLE_ADDED = "<strong>Success!!</strong>&nbsp;Role added successfully.";
	String ROLE_UPDATED = "<strong>Success!!</strong>&nbsp;Role updated successfully.";
	String ROLE_ALREADY_EXIST = "<strong>Error!!</strong>&nbsp;Role is already exists.";
	String ROLE_DELETED = "<strong>Success!!</strong>&nbsp;Role deleted successfully.";
	
	String ROLE_ACTION_ADDED = "<strong>Success!!</strong>&nbsp;Role action added successfully.";
	String ROLE_ACTION_UPDATED = "<strong>Success!!</strong>&nbsp;Role action updated successfully.";
	String ROLE_ACTION_ALREADY_EXIST = "<strong>Error!!</strong>&nbsp;Role action is already exists.";
	String ROLE_ACTION_DELETED = "<strong>Success!!</strong>&nbsp;Role action deleted successfully.";
	
	String GSTR_ONE_ADD_SUCCESS = "<strong>Success!!</strong>&nbsp;GSTR1 added successfully.";
	String GSTR_ONE_ADD_FAIL = "<strong>Success!!</strong>&nbsp;Failed to add.";
	
	Integer SUPER_PURCHASE =20;
	Integer SUPER_SALE =21;
	Integer SUPER_DEBIT_NOTE =33;
	Integer SUPER_CREDIT_NOTE =34;
		
	//For Live Database
	Integer OUTWORD_PRODUCTION_STOCK_JOURNAL = 65;
	Integer INWORD_PRODUCTION_STOCK_JOURNAL = 63;
	Integer SUPER_INWORD_PRODUCTION_STOCK_JOURNAL = 62;
	Integer SUPER_OUTWORD_PRODUCTION_STOCK_JOURNAL = 64;
	Integer LEDGER_WIP = 1687;
	Integer LEDGER_SIT = 1685;
	Integer LEDGER_RM = 1686;
	Integer LEDGER_FG = 1688;
	Integer LEDGER_SM = 1689;
	
	//For Test Database
	/*Integer OUTWORD_PRODUCTION_STOCK_JOURNAL = 88;
	Integer INWORD_PRODUCTION_STOCK_JOURNAL = 86;
	Integer SUPER_INWORD_PRODUCTION_STOCK_JOURNAL = 85;
	Integer SUPER_OUTWORD_PRODUCTION_STOCK_JOURNAL = 87;
	Integer LEDGER_WIP = 1240;
	Integer LEDGER_SIT = 1238;
	Integer LEDGER_RM = 1239;
	Integer LEDGER_FG = 1241;
	Integer LEDGER_SM = 1242;*/
	
	
	Character DEBIT = 'D';
	Character CREDIT = 'C';
	
	Integer TRIAL_PERIOD = 7;
	String TRIAL_PERIOD_EXPIRED = "<strong>Error!!</strong>&nbsp;Your trial period has expired. You need to purchase to continue it.";
	
	
	String STOCK_JOURNAL_SAVE_SUCCESS = "<strong>Success!!</strong>&nbsp;Stock journal added successfully.";
	String STOCK_JOURNAL_SAVE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to add Stock journal.";
	String STOCK_JOURNAL_UPDATE_SUCCESS = "<strong>Success!!</strong>&nbsp;Stock journal updated successfully.";
	String STOCK_JOURNAL_UPDATE_FAIL = "<strong>Error!!</strong>&nbsp;Failed to update Stock journal.";
	
	/* *************** For The Asset Management ************************/
				
	
	String CREATE_REQUEST_SUCCESS = "<strong>Success!!</strong>&nbsp;Request created successfully.";
	String CREATE_REQUEST_ERROR = "<strong>Error!!</strong>&nbsp;Could not create request or request already created.";
	String UPDATE_REQUEST_ERROR = "<strong>Error!!</strong>&nbsp;Request already submitted or cancelled.";
	String CREATE_WORK_ORDER = "<strong>Success!!</strong>&nbsp; Work order added successfully.";
	String CREATE_WORK_ORDER_FAIL = "<strong>Error!!</strong>&nbsp;Failed to save work order.";
	
	/* *************** For The POS System ************************/
	String STOCK_ITEM_NOT_AVAILABLE = "<strong>Error!!</strong>&nbsp;Product not available.";
						
						/*	For Activity	*/
						String CREATE_ACTIVITY_SUCCESS = "<strong>Success!!</strong>&nbsp;Activity created uccessfully.";
						String UPDATE_ACTIVITY_SUCCESS = "<strong>Success!!</strong>&nbsp;Activity updated successfully.";
						String DELETE_ACTIVITY_SUCCESS = "<strong>Success!!</strong>&nbsp;Activity deleted successfully.";
						String ASSIGN_ASSET_ACTIVITY_SUCCESS = "<strong>Success!!</strong>&nbsp;Activity assigned to asset successfully.";
						
						/*	For Counter	*/
						String CREATE_COUNTER_SUCCESS = "<strong>Success!!</strong>&nbsp;Counter created successfully.";
						String CREATE_COUNTER_ERROR = "<strong>Error!!</strong>&nbsp;Counter name and number already exist.";
						String CREATE_COUNTER_NAME_ERROR = "<strong>Error!!</strong>&nbsp;Counter name already exist.";
						String CREATE_COUNTER_NUMBER_ERROR = "<strong>Error!!</strong>&nbsp;Counter number already exist.";
						String UPDATE_COUNTER_SUCCESS = "<strong>Success!!</strong>&nbsp;Counter updated successfully.";
						String UPDATE_COUNTER_ERROR = "<strong>Error!!</strong>&nbsp;Could not update details.Counter name and number already exist.";
						String DELETE_COUNTER_SUCCESS = "<strong>Success!!</strong>&nbsp;Counter deleted successfully.";
						
						
						/*	For Ulimi Management	*/
						
						String LOGIN_SUCCESS = "<strong>Success!!</strong>&nbsp;Login successfull.";
						String LOGIN_FAIL = "<strong>Error!!</strong>&nbsp;;Username and password  incorrect.";
						String LOGIN_USERNAME_ERROR =  "<strong>Error!!</strong>&nbsp;Username incorrect.";
						String LOGIN_PASSWORD_ERROR =  "<strong>Error!!</strong>&nbsp;Password incorrect.";
}
