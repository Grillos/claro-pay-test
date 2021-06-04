package com.claro.pay.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.claro.pay.client.PersonClient;
import com.claro.pay.model.Person;

@ApplicationScoped
public class PersonService {

	@Inject
	@RestClient
	PersonClient client;
	
	public List<Person> listAll() {
		//throw new ErrorResponseException(Response.builder().code(1).message("error").description("erro interno").build(), null);

		return client.listAll();
	}
	
	public void persist(Person person) {
		client.persist(person);
	}
	
}
