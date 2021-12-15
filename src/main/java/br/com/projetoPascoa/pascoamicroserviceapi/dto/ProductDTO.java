package br.com.projetoPascoa.pascoamicroserviceapi.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ProductDTO {

	private String guid;

	private String name;

	@Override
	public String toString() {
		return "ProductDTO [guid=" + guid + ", name=" + name + "]";
	}

}
