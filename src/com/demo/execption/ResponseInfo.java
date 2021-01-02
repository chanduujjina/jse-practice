package com.demo.execption;

import java.util.List;

public class ResponseInfo { 
	
	@Override
	public String toString() {
		return "ResponseInfo [message=" + message + ", errorInfo=" + errorInfo + "]";
	}
	public String getMessage() {
		return message;
	}
	public List<ErrorInfo> getErrorInfo() {
		return errorInfo;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	public void setErrorInfo(List<ErrorInfo> errorInfo) {
		this.errorInfo = errorInfo;
	}

	private String  message; 
	private List<ErrorInfo> errorInfo;

}
