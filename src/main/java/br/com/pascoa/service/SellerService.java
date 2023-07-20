package br.com.pascoa.service;

import java.util.Date;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pascoa.dto.SellerDTO;
import br.com.pascoa.entity.SellerEntity;
import br.com.pascoa.repository.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository sellerRepository;

	private static Logger LOG = LoggerFactory.getLogger(SellerService.class);

	public SellerEntity saveNewSeller(SellerDTO sellerDTO) {

		SellerEntity entity = new SellerEntity();

		entity.setNome(sellerDTO.getNome());
		entity.setGuid(UUID.randomUUID().toString());
		entity.setSexo(sellerDTO.getSexo());
		entity.setTelefone(sellerDTO.getTelefone());
		entity.setCelular(sellerDTO.getCelular());
		entity.setDataCadastro(new Date());

		LOG.info("Cadastrando novo vendedor [ {} ]", entity);

		return this.sellerRepository.save(entity);
	}

	public Iterable<SellerEntity> findAllSellers() {
		return this.sellerRepository.findAll();
	}
}
