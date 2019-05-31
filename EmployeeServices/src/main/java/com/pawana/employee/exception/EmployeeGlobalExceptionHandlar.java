package com.pawana.employee.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.pawana.employee.helper.EmployeeNotFoundException;
import com.pawana.employee.util.APIResponse;
import com.pawana.employee.util.ErrorInfo;
import com.pawana.employee.vo.Employee;

@RestControllerAdvice
public class EmployeeGlobalExceptionHandlar {
	
	@ExceptionHandler(EmployeeNotFoundException.class)
	public APIResponse<Employee> handleUserNotFoundException(EmployeeNotFoundException ex){
		
		APIResponse<Employee>  apiResponse = new APIResponse<>();
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorCode(ex.getErrorCode());
		errorInfo.setErrorMessage(ex.getErrorMsg());
		
		apiResponse.getErrors().add(errorInfo);
		return apiResponse;
	}
	
	@ExceptionHandler(Exception.class)
	public APIResponse<Employee> handleException(Exception ex){
		
		APIResponse<Employee>  apiResponse = new APIResponse<>();
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorCode("2222");
		errorInfo.setErrorMessage(ex.getMessage());
		
		apiResponse.getErrors().add(errorInfo);
		return apiResponse;
	}

}
