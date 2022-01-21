package br.com.projetoPascoa.pascoamicroserviceapi.entity;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(indexes = { @Index(name = "ID_PRODUCT", columnList = "id") })
public class ProductEntity extends BaseEntity {

	private String nome;

	private float preco;

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + "]";
	}

}
