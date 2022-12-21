package com.shashi;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("consumesboth")
public class ConsumesBothExample {
	@Path("both")
    @POST
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public void getBothRequest(Student s)
    {
        System.out.println("****Student Details*****");
        System.out.println("Student Name : "+s.getName());
        System.out.println("Student Age  : "+s.getAge());
    }
}
