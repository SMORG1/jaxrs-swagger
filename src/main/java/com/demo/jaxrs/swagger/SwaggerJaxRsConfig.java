package com.demo.jaxrs.swagger;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("services")
public class SwaggerJaxRsConfig extends ResourceConfig {

	   public SwaggerJaxRsConfig() {
	      packages("com.demo.jaxrs.swagger");

	      register(io.swagger.jaxrs.listing.ApiListingResource.class);
	      register(io.swagger.jaxrs.listing.SwaggerSerializers.class);

	      io.swagger.jaxrs.config.BeanConfig beanConfig = new io.swagger.jaxrs.config.BeanConfig();
	      beanConfig.setSchemes(new String[] { "http",  "https"  });
	      beanConfig.setHost("localhost:8080");
	      beanConfig.setBasePath("/jaxrs-swagger/services");
	      beanConfig.setResourcePackage("com.demo.jaxrs.swagger");
	      beanConfig.setScan(true);
	      beanConfig.setPrettyPrint(true);

	      io.swagger.models.Info info = new io.swagger.models.Info();
	      io.swagger.models.Contact contact = new io.swagger.models.Contact();
	      contact.setEmail("dummy@gmail.com");
	      contact.setName("Sk Manjur");
	      contact.setUrl("dummy.url");
	      info.setContact(contact);
	      info.setDescription("Swagger JAX-RS Example");
	      info.setTitle("swagger-jaxrs-example");
	      info.setVersion("1.0");
	      beanConfig.setInfo(info);
	   }
}
