package br.com.projetoPascoa.pascoamicroserviceapi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.projetoPascoa.pascoamicroserviceapi.enums.ErrorCode;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FailResponseDTO {

	@JsonProperty("code")
	private ErrorCode code;

	@JsonProperty("description")
	private String description;

//	public FailResponseDTO(ErrorCode code, PaymantMessageResponse response) {
//
//	}

	public FailResponseDTO(ErrorCode code, String description) {
		this.code = code;
		this.description = description;
	}

}
