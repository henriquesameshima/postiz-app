package com.postiz.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/hello")
public class GreetingResource {

    @ConfigProperty(name = "frontend.url")
    String frontendUrl;

    @ConfigProperty(name = "main.url")
    String mainUrl;

    @ConfigProperty(name = "api.limit")
    int apiLimit;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Frontend: " + frontendUrl + ", Main: " + mainUrl + ", API limit: " + apiLimit;
    }
}
