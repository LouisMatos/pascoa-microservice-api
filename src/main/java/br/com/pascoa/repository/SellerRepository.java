package br.com.pascoa.repository;

import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.pascoa.entity.SellerEntity;

@Repository
public interface SellerRepository extends PagingAndSortingRepository<SellerEntity, Long> {

	Optional<SellerEntity> findByNome(String nome);

}
