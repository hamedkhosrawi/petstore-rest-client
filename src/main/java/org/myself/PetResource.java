package org.myself;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.myself.model.Pet;
import org.myself.service.PetService;

import java.util.Set;

@Path("/pet")
public class PetResource {

    @RestClient
    PetService petService;

    @GET
    @Path("/status/{status}")
    public Set<Pet> status(@PathParam("status") String status){
        return petService.findByStatus(status);
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Pet pet){
        petService.createPet(pet);
        return Response.status(Response.Status.CREATED).build();

    }
}
