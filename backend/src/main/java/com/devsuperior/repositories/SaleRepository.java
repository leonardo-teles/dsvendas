package com.devsuperior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.entities.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

}
