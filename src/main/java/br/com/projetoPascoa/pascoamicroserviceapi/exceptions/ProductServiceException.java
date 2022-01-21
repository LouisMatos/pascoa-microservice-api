package br.com.projetoPascoa.pascoamicroserviceapi.exceptions;

import org.springframework.http.HttpStatus;

import br.com.projetoPascoa.pascoamicroserviceapi.dto.FailResponseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ProductServiceException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6689722037032879761L;

	private String logMessage;
	private FailResponseDTO failResponseDTO;
	private HttpStatus httpStatus;

	public ProductServiceException(String logMessage, FailResponseDTO failResponseDTO, HttpStatus httpStatus,
			Throwable cause) {
		super(logMessage, cause);
		this.logMessage = logMessage;
		this.failResponseDTO = failResponseDTO;
		this.httpStatus = httpStatus;
	}

	public ProductServiceException(String logMessage, FailResponseDTO failResponseDTO, HttpStatus httpStatus) {
		super(logMessage);
		this.logMessage = logMessage;
		this.failResponseDTO = failResponseDTO;
		this.httpStatus = httpStatus;
	}

}
