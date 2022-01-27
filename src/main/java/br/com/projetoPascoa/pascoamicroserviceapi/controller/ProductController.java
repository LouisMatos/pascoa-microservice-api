package br.com.projetoPascoa.pascoamicroserviceapi.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.validation.Valid;

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
import br.com.projetoPascoa.pascoamicroserviceapi.service.ProductService;

@RestController
@Validated
@RequestMapping(value = "/v1/api/product", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping
	public ResponseEntity<?> addNewProduct(@Valid @RequestBody ProductDTO productRequest) {

		ProductDTO productDTO = ProductDTO.toDTO(productService.saveNewProduct(productRequest));

		return new ResponseEntity<>(productDTO, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<ProductDTO>> findAllProducts() {

		List<ProductDTO> response = StreamSupport.stream(this.productService.findAllProducts().spliterator(), false)
				.map(productEntity -> ProductDTO.toDTO(productEntity)).collect(Collectors.toList());

		return new ResponseEntity<List<ProductDTO>>(response, HttpStatus.OK);
	}

}
