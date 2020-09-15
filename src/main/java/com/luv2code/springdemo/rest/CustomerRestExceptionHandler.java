package com.luv2code.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerRestExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handleCustomerNotFoundException(CustomerNotFoundException exc) {
		CustomerErrorResponse theError = new CustomerErrorResponse();
		theError.setException(exc.getMessage());
		theError.setRequestTime(System.currentTimeMillis());
		theError.setStatusCode(HttpStatus.NOT_FOUND.value());

		return new ResponseEntity<CustomerErrorResponse>(theError, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handleGenericException(Exception exc) {
		CustomerErrorResponse theError = new CustomerErrorResponse();
		theError.setException(exc.getMessage());
		theError.setRequestTime(System.currentTimeMillis());
		theError.setStatusCode(HttpStatus.BAD_REQUEST.value());

		return new ResponseEntity<CustomerErrorResponse>(theError, HttpStatus.BAD_REQUEST);
	}

}
