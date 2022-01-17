package br.com.projetoPascoa.pascoamicroserviceapi.service;

import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoPascoa.pascoamicroserviceapi.dto.ProductDTO;
import br.com.projetoPascoa.pascoamicroserviceapi.entity.ProductEntity;
import br.com.projetoPascoa.pascoamicroserviceapi.repository.ProductRepository;

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

		LOG.info("Cadastrando novo produto [ {} ]", entity);

		return this.productRepository.save(entity);
	}

	
	public List<ProductEntity> getAllProducts() {
		return (List<ProductEntity>) this.productRepository.findAll();
	}
	
}
