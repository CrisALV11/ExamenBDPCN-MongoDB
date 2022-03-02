package edu.utl.cpgamers.model;
public class Videojuego
{
    private String nombre;
    private String plataforma;
    private String marca;
    private String clasificacion;
    private String tipo;
    private int annioEstreno;

    public Videojuego()
    {
        
    }

    public Videojuego(String nombre, String plataforma, String marca, String clasificacion, String tipo, int annioEstreno)
    {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.marca = marca;
        this.clasificacion = clasificacion;
        this.tipo = tipo;
        this.annioEstreno = annioEstreno;
    }

    public int getAnnioEstreno()
    {
        return annioEstreno;
    }

    public void setAnnioEstreno(int annioEstreno)
    {
        this.annioEstreno = annioEstreno;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getPlataforma() 
    {
        return plataforma;
    }

    public void setPlataforma(String plataforma)
    {
        this.plataforma = plataforma;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getClasificacion() 
    {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion)
    {
        this.clasificacion = clasificacion;
    }

    public String getTipo()
    {
        return tipo;
    }

    public void setTipo(String tipo) 
    {
        this.tipo = tipo;
    }

    @Override
    public String toString() 
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Videojuego{");
        sb.append("nombre=").append(nombre);
        sb.append(", plataforma=").append(plataforma);
        sb.append(", marca=").append(marca);
        sb.append(", clasificacion=").append(clasificacion);
        sb.append(", tipo=").append(tipo);
        sb.append(", annioEstreno=").append(annioEstreno);
        sb.append('}');
        return sb.toString();
    }  
}
