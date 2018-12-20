package com.DemoMaven.multimodule.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.DemoMaven.multimodule.business.logic.UserBO;
import com.DemoMaven.multimodule.rest.dto.UserDTO;

import javax.ws.rs.Produces;

@Path("/user")
public class UserRestService {
	@EJB
	private UserBO user;
	
	//Log
	private static final Logger LOG = LogManager.getLogger();
		
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<UserDTO> getUsers(){
		
		return null;
	}
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/{id}")
	public Response getUser(@PathParam("id") final long id){
		//Get id and print: console
		LOG.info("Get user by id: " + id);
		//Return result
		UserDTO userDto = new UserDTO("User " + id, "user" + id + "@tsystems.com");
		
		return Response.ok(userDto).build();
	}
}