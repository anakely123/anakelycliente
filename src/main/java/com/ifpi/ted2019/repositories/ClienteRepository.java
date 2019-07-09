package com.ifpi.ted2019.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifpi.ted2019.domain.Cliente;

public class ClienteRepository {

	@Repository
	public interface CategoriaRepository extends JpaRepository<Cliente, Integer>{
}

	public Optional<Cliente> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}