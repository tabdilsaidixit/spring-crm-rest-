package com.luv2code.springdemo.rest;

public class CustomerErrorResponse {
	private int statusCode;
	
	private String exception;

	private long requestTime;

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public CustomerErrorResponse() {

	}

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	public long getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(long requestTime) {
		this.requestTime = requestTime;
	}

}
