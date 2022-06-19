package paquete4;

public class InstitucionEducativa {

    protected String nombre;
    protected String siglas;

    public InstitucionEducativa (String nom, String sig){
        nombre = nom;
        siglas = sig;
    }
    public void establecerNombre(String nom){
        nombre = nom;
    }
    public void establecersiglas(String nom){
        siglas = nom;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerSiglas(){
        return siglas;
    }
    @Override
    public String toString(){
        String cadena = String.format("Nombre: %s\nSiglas: %s\n",nombre,
                siglas);
        return cadena;
    }
}
