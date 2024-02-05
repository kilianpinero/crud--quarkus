package com.plexus.infrastructure.rest;

import com.plexus.application.service.CountryService;
import com.plexus.infrastructure.adapter.entity.Country;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@Path("/country")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CountryController implements CountryService {

    @Inject
    CountryService service;

    @Override
    public void save(Country country) {
        service.save(country);
    }

    @GET
    @Path("/list")
    public List<Country> findAll() {
        return service.findAll();
    }

    @GET
    @Path("/list/{id}")
    public Country findById(Long id) {
        return service.findById(id);
    }

    @POST
    @Path("/add")
    public Response add(Country country) {
        service.save(country);
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id) {
        service.delete(id);
    }

    @PUT
    @Path("/update")
    public void update(Country country) {

        service.update(country);
    }

}
