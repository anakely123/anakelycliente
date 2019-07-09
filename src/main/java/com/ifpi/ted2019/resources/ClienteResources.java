package com.ifpi.ted2019.resources;

import java.util.ServiceLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/Cliente")
public class ClienteResources<ClienteService> {
	@Autowired
	private ClienteService service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public <ClienteEndpoint> ResponseEntity<?> find(@PathVariable Integer id) {
		ClienteEndpoint object = ServiceLoader.buscar(id);
		return ResponseEntity.ok().body(object);

	}

}
