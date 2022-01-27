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

import br.com.projetoPascoa.pascoamicroserviceapi.dto.SellerDTO;
import br.com.projetoPascoa.pascoamicroserviceapi.service.SellerService;

@RestController
@Validated
@RequestMapping(value = "/v1/api/seller", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class SellerController {

	@Autowired
	private SellerService sellerService;

	@PostMapping
	public ResponseEntity<?> addNewSeller(@Valid @RequestBody SellerDTO sellerRequest) {
		
		SellerDTO sellerDTO = SellerDTO.toDTO(sellerService.saveNewSeller(sellerRequest));

		return new ResponseEntity<>(sellerDTO, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<SellerDTO>> findAllProducts() {

		List<SellerDTO> response = StreamSupport.stream(this.sellerService.findAllSellers().spliterator(), false)
				.map(sellerEntity -> SellerDTO.toDTO(sellerEntity)).collect(Collectors.toList());

		return new ResponseEntity<List<SellerDTO>>(response, HttpStatus.OK);
	}
}
