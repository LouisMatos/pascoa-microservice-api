package br.com.pascoa.service;

import java.util.Date;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pascoa.dto.ProductDTO;
import br.com.pascoa.entity.ProductEntity;
import br.com.pascoa.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	private static Logger LOG = LoggerFactory.getLogger(ProductService.class);

	public ProductEntity saveNewProduct(ProductDTO productDTO) {

		ProductEntity entity = new ProductEntity();

		entity.setNome(productDTO.getNome());
		entity.setGuid(UUID.randomUUID().toString());
		entity.setPreco(productDTO.getPreco());
		entity.setEstoque(productDTO.getEstoque());
		entity.setDataCadastro(new Date());
		entity.setDescricao(productDTO.getDescricao());

		LOG.info("Cadastrando novo produto [ {} ]", entity);

		return this.productRepository.save(entity);
	}

	public Iterable<ProductEntity> findAllProducts() {
		return this.productRepository.findAll();
	}

}
