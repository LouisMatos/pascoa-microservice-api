package br.com.projetoPascoa.pascoamicroserviceapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(indexes = { @Index(name = "ID_PRODUCT", columnList = "productId") })
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;

	private String guid;

	private String name;

	@Override
	public String toString() {
		return "ProductEntity [name=" + name + ", guid=" + guid + "]";
	}

}
