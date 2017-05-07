package com.aquacompany.web.jersey.pilotjerseyjava8;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.server.mvc.Viewable;
import org.jboss.logging.Logger;

@Path("/")
public class IndexAction {

	Logger logger = Logger.getLogger(IndexAction.class);

	@GET
	@Path("/hello-json")
	@Produces(MediaType.APPLICATION_JSON)
	public String getHello() {
		JsonObject jsonObject = Json.createObjectBuilder()
				.add("hoge", "hage")
				.build();
		return jsonObject.toString();
	}

	@GET
	@Path("/hello-string")
	@Produces(MediaType.APPLICATION_JSON)
	public String getHelloString() {
		return "hello!";
	}

	@GET
	@Path("/hello-post-form")
	public Viewable getHelloPostForm() {

		logger.info("GetHelloPostForm execute");

		return new Viewable("/hello-post-form");
	}

	@POST
	@Path("/hello-post")
	@Produces(MediaType.APPLICATION_JSON)
	public String getHelloPost(@FormParam("hoge") String hoge) {
		JsonObject jsonObject = Json.createObjectBuilder()
				.add("hoge", hoge)
				.build();
		return jsonObject.toString();
	}
}
