package com.pawana.employee.util;

import java.util.Date;

public class Status {
	
	public Status() {
		super();
		this.statusCode = "SUCCESS";
		this.timeStamp = new Date();
	}
	private String statusCode;
	private Date timeStamp;
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

}
