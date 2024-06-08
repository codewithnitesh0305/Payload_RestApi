package com.springboot.CustomeException;

public class BusinessException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private String errorCode;
	private String erroeMessage;
	public BusinessException(String errorCode, String erroeMessage) {
		super();
		this.errorCode = errorCode;
		this.erroeMessage = erroeMessage;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErroeMessage() {
		return erroeMessage;
	}
	public void setErroeMessage(String erroeMessage) {
		this.erroeMessage = erroeMessage;
	}
	

}
