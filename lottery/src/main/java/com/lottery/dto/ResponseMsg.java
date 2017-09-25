package com.lottery.dto;

public class ResponseMsg {
	private String errorCode;
	private String errorMsg;
	private Object data;
	
	public ResponseMsg() {
		this.errorCode = "0000";
		this.errorMsg = "";
	}
	
	public ResponseMsg(String errorCode, String errorMsg) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
	
	public ResponseMsg(Object data) {
		this.errorCode = "0000";
		this.errorMsg = "";
		this.data = data;
	}
	
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
}
