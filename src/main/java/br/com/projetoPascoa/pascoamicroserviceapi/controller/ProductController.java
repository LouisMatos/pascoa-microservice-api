package br.com.projetoPascoa.pascoamicroserviceapi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetoPascoa.pascoamicroserviceapi.dto.ProductDTO;
import br.com.projetoPascoa.pascoamicroserviceapi.entity.ProductEntity;
import br.com.projetoPascoa.pascoamicroserviceapi.service.ProductService;

@RestController
@RequestMapping("/v1/api/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	private static Logger LOG = LoggerFactory.getLogger(ProductController.class);

	@PostMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ProductEntity> addNewProduct(@RequestBody ProductDTO productDTO) {

		ProductEntity product = productService.saveNewProduct(productDTO);

		LOG.info("Produto cadastrado com sucesso!");

		return new ResponseEntity<ProductEntity>(product, HttpStatus.OK);
	}

}
