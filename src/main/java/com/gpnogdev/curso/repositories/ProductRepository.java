package com.gpnogdev.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gpnogdev.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
 
	

}
