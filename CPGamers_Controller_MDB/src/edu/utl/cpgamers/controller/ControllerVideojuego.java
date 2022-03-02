package edu.utl.cpgamers.controller;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import edu.utl.cpgamers.model.Videojuego;
import org.bson.Document;

public class ControllerVideojuego
{          
    public boolean insertarRegistro(Videojuego videojuego)
    {
        MongoClientURI uri = new MongoClientURI("mongodb+srv://root:root@examenbdpcn.4ewy2.mongodb.net/CPGamersDB?retryWrites=true&w=majority");
        try(MongoClient mongoclient = new MongoClient(uri))
        {    
            MongoDatabase database = mongoclient.getDatabase("CPGamersDB");
            MongoCollection<Document> collections = database.getCollection("Videojuego");
            System.out.println("¡Conexión Exitosa!");
        
            var d1 = new Document();
            d1.append("nombre", videojuego.getNombre());
            d1.append("plataforma", videojuego.getPlataforma());
            d1.append("marca", videojuego.getMarca());
            d1.append("clasificacion", videojuego.getClasificacion());
            d1.append("tipo", videojuego.getTipo());
            d1.append("annioEstreno", videojuego.getAnnioEstreno());
            collections.insertOne(d1);
            return true;
        }
    }
}
