package br.com.projetoPascoa.pascoamicroserviceapi.apierror;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
public class ApiValidationError extends ApiSubError {
	private String object;
	private String field;
	private Object rejectedValue;
	private String message;

	ApiValidationError(String object, String message) {
		this.object = object;
		this.message = message;
	}

	ApiValidationError(String field, String rejectedValue, String message) {
		this.field = field;
		this.rejectedValue = rejectedValue;
		this.message = message;
	}
}
