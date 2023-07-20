package br.com.pascoa.dto;

import br.com.pascoa.entity.SellerEntity;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SellerDTO {

	private Long id;

	private String nome;

	private String sexo;

	private String telefone;

	private String celular;

	public static SellerDTO toDTO(SellerEntity sellerEntity) {
		return SellerDTO.builder().id(sellerEntity.getId()).nome(sellerEntity.getNome()).sexo(sellerEntity.getSexo())
				.telefone(sellerEntity.getTelefone()).celular(sellerEntity.getCelular()).build();
	}

	@Override
	public String toString() {
		return "SellerDTO [id=" + id + ", nome=" + nome + ", sexo=" + sexo + ", telefone=" + telefone + ", celular="
				+ celular + "]";
	}

}
