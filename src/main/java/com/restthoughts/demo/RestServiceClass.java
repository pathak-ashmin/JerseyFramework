package com.restthoughts.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/demo")
public class RestServiceClass {
	
	@GET
	@Path("/{param}")
	public Response  getMessage(@PathParam("param")String message){
		
		String output = "Jersey Response: " + message;
		
		return Response.status(200).entity(output).build();
		
	}

}
