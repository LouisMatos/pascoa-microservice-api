package br.com.projetoPascoa.pascoamicroserviceapi.dto;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonInclude;

import br.com.projetoPascoa.pascoamicroserviceapi.entity.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDTO {

	private String guid;

	@NotBlank(message = "Campo nome é obrigatório!")
	private String nome;

	private float preco;

	private Integer estoque;

	private String descricao;

	public static ProductDTO toDTO(ProductEntity productEntity) {
		return ProductDTO.builder().guid(productEntity.getGuid()).nome(productEntity.getNome())
				.preco(productEntity.getPreco()).estoque(productEntity.getEstoque())
				.descricao(productEntity.getDescricao()).build();
	}

	@Override
	public String toString() {
		return "ProductDTO [guid=" + guid + ", nome=" + nome + ", preco=" + preco + "]";
	}

}
