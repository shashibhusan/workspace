package com.shashi;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.consumeXmlJson.Student;
          
@Path("/helloworld")  
public class HelloWorld {

	@POST   
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response  sayPlainTextHello(JSONObject obj) throws JSONException {
		System.out.println("==gggg="+obj);
		
		return Response.status(200).entity(obj).build();
	}

	/*@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello() {
		return "<?xml version=\"1.0\"?>" + "<hello> This is the XML response"
				+ "</hello>";
	}*/
	/*
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHtmlHello() {
		return "<html> " + "<title>" + "This is TEXT HTML call"
				+ "</title>" + "<body><h1>" + "This is simple text html call"
				+ "</body></h1>" + "</html> ";
	}
*/
}
