package com.claro.pay.client;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.claro.pay.model.Person;

@Path("/")
@RegisterRestClient
public interface PersonClient {
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public List<Person> listAll();
	
	@POST
    @Produces(MediaType.APPLICATION_JSON)
	public Person persist(@RequestBody Person person);

}
