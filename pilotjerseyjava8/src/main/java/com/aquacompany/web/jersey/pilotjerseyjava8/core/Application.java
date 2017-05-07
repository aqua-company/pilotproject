package com.aquacompany.web.jersey.pilotjerseyjava8.core;

import javax.json.stream.JsonGenerator;

import org.glassfish.jersey.moxy.json.MoxyJsonConfig;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.mvc.jsp.JspMvcFeature;

public class Application extends ResourceConfig {

	public Application() {

		 this.packages(Application.class.getPackage().getName())
         .register(JspMvcFeature.class);

		 this.register(MoxyJsonConfig.class)
        .packages(Application.class.getPackage().getName())
        .property(JsonGenerator.PRETTY_PRINTING, true);

	}
}
