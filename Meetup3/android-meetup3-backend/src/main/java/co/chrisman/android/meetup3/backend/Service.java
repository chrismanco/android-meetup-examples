package co.chrisman.android.meetup3.backend;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/service")
public class Service {
    
    @POST
    @Path("/login")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces("text/plain")
    public String login(@FormParam("user") String user, @FormParam("pwd") String pwd) {
        if (user.equals("proycomp") && pwd.equals("vector")) {
            return "Ok";
        } else {
            return "Wrong!";
        }
    }
    
    @GET
    @Produces("text/plain")
    public String check() {
        return "Working!";
    }
}