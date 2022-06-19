package paquete2;

public class Persona {

    protected String nombre;
    protected String apellido;
    protected String userName;

    public Persona (String nom, String ape, String usNam){
        nombre = nom;
        apellido = ape;
        userName = usNam;
    }
    public void establecerNombre(String g){
        nombre = g;
    }
    public void establecerApellido(String g){
        apellido = g;
    }
    public void establecerUserName(String g){
        userName = g;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerApeliido(){
        return apellido;
    }
    public String obtenerUserName(){
        return userName;
    }
    @Override
    public String toString(){
        String cadena = String.format("Nombre: \n%sApellido: \n%s User Name: \n%s",
                nombre,apellido,userName);
        return cadena;
    }
}
