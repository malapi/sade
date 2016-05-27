package com.blink.sade.integration.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.blink.sade.integration.filter.DateRequired;

@Path("/filtered")
public class FilteredResource {

    @GET
    @DateRequired
    @Path("hello")
    public String sayHello() {
        return "hello";
    }
}
