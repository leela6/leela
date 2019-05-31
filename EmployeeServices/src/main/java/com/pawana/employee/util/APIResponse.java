package com.pawana.employee.util;

import java.util.ArrayList;
import java.util.List;

public class APIResponse<T> {

	private Status status;
	private T payLoad;
	private List<ErrorInfo> errors=new ArrayList<>();
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public T getPayLoad() {
		return payLoad;
	}
	public void setPayLoad(T payLoad) {
		this.payLoad = payLoad;
	}
	public List<ErrorInfo> getErrors() {
		return errors;
	}
	public void setErrors(List<ErrorInfo> errors) {
		this.errors = errors;
	}
	
	
}
