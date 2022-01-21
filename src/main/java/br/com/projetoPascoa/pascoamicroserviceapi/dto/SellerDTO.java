package br.com.projetoPascoa.pascoamicroserviceapi.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SellerDTO {

	private String guid;

	private String nome;

	private float preco;

	@Override
	public String toString() {
		return "ProductDTO [guid=" + guid + ", nome=" + nome + ", preco=" + preco + "]";
	}

}
