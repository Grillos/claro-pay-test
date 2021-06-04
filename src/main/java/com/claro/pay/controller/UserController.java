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

import com.claro.pay.model.User;
import com.claro.pay.request.UserRequest;
import com.claro.pay.service.UserService;

@Tag(name = "Users")
@Path("/users")
public class UserController {
	
	@Inject
	UserService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(description = "Find all users", summary = "Find users")
    public List<User> listAll() {
        return service.listAll();
    }
    
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Operation(description = "Persist users", summary = "Persist users")
    public void persist(@RequestBody UserRequest request) {

    	service.persist(User
    			.builder()
    			.username(request.getUsername())
    			.password(request.getPassword())
    			.build());
        
    }
}