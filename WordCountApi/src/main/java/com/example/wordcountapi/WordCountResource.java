package com.example.wordcountapi;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/wordcount")
public class WordCountResource {

    @GET
    public Response ping() {
        return Response.ok("pong!").build();
    }


    @POST
    @Path("/upload")
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public String UploadFile() {
        return "Hello, World!";
    }

    @GET
    @Path("/fileinformation")
    @Produces(MediaType.TEXT_HTML)
    public String GetFileInformation() {
        return "<h1>File Information</h1>";
    }
}