/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.pba.drs.webroot;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @author Pouria
 */
@Path("/")
public class DRS {
    
    @GET
    public Response getRoot(){
        return Response.ok("Test").build();
    }
}
