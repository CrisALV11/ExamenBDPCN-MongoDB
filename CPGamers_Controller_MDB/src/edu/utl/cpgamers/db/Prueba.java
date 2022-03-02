package edu.utl.cpgamers.db;

import edu.utl.cpgamers.controller.ControllerVideojuego;
import edu.utl.cpgamers.model.Videojuego;

public class Prueba 
{
    public static void main(String[] args) 
    {
        ControllerVideojuego objCMDB = new ControllerVideojuego();
        Videojuego objV = new Videojuego("Waa", "Waa2", "Waa3", "Waa4", "Waa5", 1);
        objCMDB.insertarRegistro(objV);
    }
}
