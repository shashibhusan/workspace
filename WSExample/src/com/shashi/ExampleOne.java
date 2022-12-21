package com.shashi;
import javax.ws.rs.GET;  
import javax.ws.rs.Path;  
import javax.ws.rs.PathParam;  
import javax.ws.rs.core.Response;  
@Path("/hello")  
public class ExampleOne{  
    @GET  
    @Path("{day}/{month}/{year}")  
    public Response getMsg(
    		@PathParam("day") String day, 
    		@PathParam("month") String month,
    		@PathParam("year") String year
    		) {  
        String output = "Jersey say : " + day+"/"+month+"/"+year;
        System.out.println("Date you have entered is : "+output);
        return Response.status(200).entity(output).build();  
    }  
}  