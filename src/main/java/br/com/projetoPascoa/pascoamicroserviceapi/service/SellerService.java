package br.com.projetoPascoa.pascoamicroserviceapi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoPascoa.pascoamicroserviceapi.dto.SellerDTO;
import br.com.projetoPascoa.pascoamicroserviceapi.entity.SellerEntity;
import br.com.projetoPascoa.pascoamicroserviceapi.repository.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository sellerRepository;

	private static Logger LOG = LoggerFactory.getLogger(SellerService.class);

	public SellerEntity saveNewProduct(SellerDTO sellerDTO) {

		SellerEntity entity = new SellerEntity();

		LOG.info("Cadastrando novo vendedor [ {} ]", entity);

		return this.sellerRepository.save(entity);
	}

}
