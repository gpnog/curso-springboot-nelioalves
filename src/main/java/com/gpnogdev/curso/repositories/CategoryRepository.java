package com.gpnogdev.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gpnogdev.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	 
	

}
