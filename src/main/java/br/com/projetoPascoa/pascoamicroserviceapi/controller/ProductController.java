package br.com.projetoPascoa.pascoamicroserviceapi.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetoPascoa.pascoamicroserviceapi.dto.ProductDTO;
import br.com.projetoPascoa.pascoamicroserviceapi.entity.ProductEntity;
import br.com.projetoPascoa.pascoamicroserviceapi.service.ProductService;

@RestController
@Validated
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class ProductController {

	@Autowired
	private ProductService productService;

	private static Logger LOG = LoggerFactory.getLogger(ProductController.class);

	@PostMapping("/v1/api/product")
	public ResponseEntity<?> addNewProduct(@Valid @RequestBody ProductDTO productDTO) {

		ProductEntity product = productService.saveNewProduct(productDTO);

		LOG.info("Produto cadastrado com sucesso!");

		return new ResponseEntity<>(product, HttpStatus.OK);
	}

	@GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ProductDTO>> findAllProducts() {

		List<ProductDTO> response = StreamSupport.stream(this.productService.findAllProducts().spliterator(), false)
				.map(productEntity -> ProductDTO.toDTO(productEntity)).collect(Collectors.toList());

		return new ResponseEntity<List<ProductDTO>>(response, HttpStatus.OK);
	}

}
