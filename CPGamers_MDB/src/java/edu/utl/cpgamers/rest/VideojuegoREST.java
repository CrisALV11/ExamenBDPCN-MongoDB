package edu.utl.cpgamers.rest;

import com.google.gson.Gson;
import edu.utl.cpgamers.controller.ControllerVideojuego;
import edu.utl.cpgamers.model.Videojuego;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("videojuego")
public class VideojuegoREST extends Application
{
    @Path("insertarRegistro")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertarRegistro(@QueryParam("videojuego") String v) 
    {
        String out = "";
        try 
        {
            System.out.println(v);
            //Se crea un objeto de la libreria Gson para convertir un JSON en objeto Java
            Gson objGS = new Gson();
            Videojuego videojuego = objGS.fromJson(v, Videojuego.class);
            //Se crea un objeto del Controlador
            ControllerVideojuego objCV = new ControllerVideojuego();
            objCV.insertarRegistro(videojuego);
            out = "{\"result\": \"Se insertó de manera correcta\"}";        
        } 
        catch (Exception ex)
        {
            ex.printStackTrace();
            // En caso de error, se genera la respuesta de error del servicio
            out = "{\"error\": \"Hubo un fallo en la inserción, "
                    + "vuelve a intentarlo, o llama al administrador del sistema\"}";
        }
        return Response.status(Response.Status.OK).entity(out).build();
    }
}
