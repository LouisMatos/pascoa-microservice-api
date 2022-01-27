package br.com.projetoPascoa.pascoamicroserviceapi.entity;

import java.util.Date;

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

	private String sexo;

	private String telefone;

	private String celular;

	private Date dataCadastro;

	@Override
	public String toString() {
		return "SellerEntity [nome=" + nome + ", sexo=" + sexo + ", telefone=" + telefone + ", celular=" + celular
				+ ", dataCadastro=" + dataCadastro + "]";
	}

}
