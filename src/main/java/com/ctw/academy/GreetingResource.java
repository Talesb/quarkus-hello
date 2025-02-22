package com.ctw.academy;

import io.quarkus.runtime.Quarkus;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.jboss.resteasy.reactive.RestQuery;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@RestQuery String name ) {
        name = name == null ? "World" : name;
        return "Hello "+name+", Hi from Quarkus REST";
    }
}
