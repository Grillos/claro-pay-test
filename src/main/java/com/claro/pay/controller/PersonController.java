package com.claro.pay.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import com.claro.pay.model.Person;
import com.claro.pay.request.PersonRequest;
import com.claro.pay.service.PersonService;

@Tag(name = "Persons")
@Path("/persons")
public class PersonController {
	
	@Inject
	PersonService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(description = "Find all clients", summary = "Find clients")
    public List<Person> listAll() {
        return service.listAll();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Operation(description = "Persist persons", summary = "Persist persons")
    public void persist(@RequestBody PersonRequest request) {

    	service.persist(Person
    			.builder()
    			.name(request.getName())
    			.document(request.getDocument())
    			.build());
        
    }
}