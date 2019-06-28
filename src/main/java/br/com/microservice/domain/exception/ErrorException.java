package br.com.microservice.domain.exception;

import org.springframework.http.HttpStatus;

public class ErrorException extends ServiceException {

	private static final long serialVersionUID = -203367183714678334L;
	private static final String MESSAGE = HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase();

	public ErrorException(String message) {
		super(message);
	}

	@Override
	public HttpStatus getHttpStatus() {
		return HttpStatus.INTERNAL_SERVER_ERROR;
	}

	@Override
	public String getResponseMessage() {
		return MESSAGE;
	}

	@Override
	public Integer getCodeError() {
		return HttpStatus.INTERNAL_SERVER_ERROR.value();
	}
	

}
