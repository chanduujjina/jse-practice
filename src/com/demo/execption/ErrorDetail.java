package com.demo.execption;

public class ErrorDetail {
	@Override
	public String toString() {
		return "ErrorDetail [empid=" + empid + ", status=" + status + ", fulldescrption=" + fulldescrption + "]";
	}
	public int getEmpid() {
		return empid;
	}
	public String getStatus() {
		return status;
	}
	public String getFulldescrption() {
		return fulldescrption;
	}
	public ErrorDetail(int empid, String status, String fulldescrption) {
		super();
		this.empid = empid;
		this.status = status;
		this.fulldescrption = fulldescrption;
	}
	private int empid;
	private String status;
	private String fulldescrption;
}
