package br.com.projetoPascoa.pascoamicroserviceapi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetoPascoa.pascoamicroserviceapi.service.ProductService;

@RestController
@RequestMapping("/v1/api/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	private static Logger LOG = LoggerFactory.getLogger(ProductController.class);

	@GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> addNewProduct() {

		LOG.info("DEU BOM ");

		return new ResponseEntity<String>("Deu bom ", HttpStatus.OK);
	}

}
