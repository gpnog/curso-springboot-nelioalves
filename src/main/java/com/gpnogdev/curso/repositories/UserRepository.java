package com.gpnogdev.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gpnogdev.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	 
	

}
