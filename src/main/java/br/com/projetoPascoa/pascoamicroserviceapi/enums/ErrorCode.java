package br.com.projetoPascoa.pascoamicroserviceapi.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ErrorCode {

	GENRIC_ERROR_BAD_REQUEST("400");

	private String code;

	ErrorCode(String code) {
		this.code = code;
	}

	@JsonValue
	public String getCode() {
		return code;
	}

}
