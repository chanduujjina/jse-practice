package com.demo.execption;

public class ErrorInfo {

	@Override
	public String toString() {
		return "ErrorInfo [field=" + field + ", errorMessage=" + errorMessage + "]";
	}

	public String getField() {
		return field;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public ErrorInfo(String field, String errorMessage) {
		super();
		this.field = field;
		this.errorMessage = errorMessage;
	}

	private String field;
	
	private String errorMessage;
}
