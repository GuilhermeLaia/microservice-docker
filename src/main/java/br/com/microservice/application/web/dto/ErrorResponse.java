package br.com.microservice.application.web.dto;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(SnakeCaseStrategy.class)
public class ErrorResponse {
	
	private Integer code;
	private HttpStatus type;
	private String message;
	private String timestamp;
	
	public ErrorResponse(Integer code, HttpStatus type, String message, String timestamp) {
		this.code = code;
		this.type = type;
		this.message = message;
		this.timestamp = timestamp;
	}
	
	
	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public HttpStatus getType() {
		return type;
	}

	public void setType(HttpStatus type) {
		this.type = type;
	}

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
}
