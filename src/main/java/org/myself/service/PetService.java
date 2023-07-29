package org.myself.service;


import jakarta.ws.rs.*;
import org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.myself.model.Pet;

import java.util.Set;

@Path("/pet")
@RegisterRestClient(configKey = "pet-api")
@RegisterClientHeaders(RequestUUIDHeaderFactory.class)
public interface PetService {

    @GET
    @Path("/findByStatus")
    public Set<Pet> findByStatus(@QueryParam("status") String status);


    @POST
    public Pet createPet(Pet pet);

}
