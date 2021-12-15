package br.com.projetoPascoa.pascoamicroserviceapi.repository;

import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.projetoPascoa.pascoamicroserviceapi.entity.ProductEntity;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<ProductEntity, Long> {

	Optional<ProductEntity> findByName(String name);

}
