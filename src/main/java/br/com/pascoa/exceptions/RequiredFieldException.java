package br.com.pascoa.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RequiredFieldException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3740179932086969815L;

	public RequiredFieldException(String msg) {
		super(msg);
	}

}
