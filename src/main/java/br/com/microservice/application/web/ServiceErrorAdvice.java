package br.com.microservice.application.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.microservice.application.web.dto.ErrorResponse;
import br.com.microservice.domain.exception.ServiceException;

@ControllerAdvice
public class ServiceErrorAdvice {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ServiceErrorAdvice.class);

	@ExceptionHandler(ServiceException.class)
	public ResponseEntity<ErrorResponse> handle(ServiceException se) {
		
		LOGGER.error("Error during the app execution, creating response to user.", se);
		
		return ResponseEntity.status(se.getHttpStatus()).body(se.createErrorResponse());
	}
	
}
