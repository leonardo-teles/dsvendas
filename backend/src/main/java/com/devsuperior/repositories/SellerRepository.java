package com.devsuperior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.entities.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {

}
