package com.ifpi.ted2019.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifpi.ted2019.domain.Cliente;
import com.ifpi.ted2019.repositories.ClienteRepository;

	@Service
	public class ClienteService {

		@Autowired
		private ClienteRepository repository;
		
		public Cliente buscar(Integer id) {
			Optional<Cliente> object = repository.findById(id);
			return object.orElse(null);
		}

}
