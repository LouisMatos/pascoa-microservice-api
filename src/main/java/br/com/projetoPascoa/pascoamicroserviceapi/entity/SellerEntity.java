package br.com.projetoPascoa.pascoamicroserviceapi.entity;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(indexes = { @Index(name = "ID_SELLER", columnList = "id") })
public class SellerEntity extends BaseEntity {

	private String nome;

	private float preco;

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + "]";
	}

}
