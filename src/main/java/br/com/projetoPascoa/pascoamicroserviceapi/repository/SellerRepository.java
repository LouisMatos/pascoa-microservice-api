package br.com.projetoPascoa.pascoamicroserviceapi.repository;

import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.projetoPascoa.pascoamicroserviceapi.entity.SellerEntity;

@Repository
public interface SellerRepository extends PagingAndSortingRepository<SellerEntity, Long> {

	Optional<SellerEntity> findByNome(String nome);

}
