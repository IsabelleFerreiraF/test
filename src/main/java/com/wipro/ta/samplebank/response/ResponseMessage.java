package com.wipro.ta.samplebank.response;

public enum ResponseMessage {

	SUCCESS("INF001", "Operation completed with success"),
	ACCOUNT_NOT_FOUND("ERR001", "Account not found"),
	ACCOUNT_ALREADY_EXISTS("ERR002", "Account already exists"),
	INVALID_CPF("ERR003", "The CPF information is invalid"),
	INVALID_AMMOUNT("ERR004", "The ammount is invalid for the operation"),
	LOAN_CREDIT_EXCEEDED("ERR005", "The requested loan ammount exceeds the available credit limit"),
	LOAN_NOT_ENOUGH_BALANCE("ERR006", "Insufficient balance in account for the loan operation. Minimum of $2000 is required"),
	LOAN_PENDING_FOR_ACCOUNT("ERR007", "There is a pending loan for this account"),
	OPERATION_ERROR("ERR999", "Unknow operation error");

	private ResponseMessage(String code, String message) {
		this.code = code;
		this.message = message;
	}

	private String code;
	private String message;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}