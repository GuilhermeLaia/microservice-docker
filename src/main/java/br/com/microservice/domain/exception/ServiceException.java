package br.com.microservice.domain.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import br.com.microservice.application.web.dto.ErrorResponse;

public abstract class ServiceException extends Exception {

	private static final long serialVersionUID = -3325318772283947711L;
	
	public ServiceException() {}

	public ServiceException(String message) {
		super(message);
	}
	
	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public ErrorResponse createErrorResponse() {
		return new ErrorResponse(getCodeError(), getHttpStatus(), getResponseMessage(), LocalDateTime.now().toString());
	}
	
	public abstract Integer getCodeError();
	public abstract HttpStatus getHttpStatus();
    public abstract String getResponseMessage();
}
