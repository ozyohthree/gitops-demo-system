package io.openliberty.guides.system;

// CDI
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
// JAX-RS
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Path("hello")
public class HelloResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getGreeting() {
        String greeting = "Hello_Openshift_World";
        return greeting;
    }

}
