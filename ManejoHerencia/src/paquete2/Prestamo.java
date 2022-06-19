
package paquete2;


import com.sun.nio.sctp.AbstractNotificationHandler;

public class Prestamo {
    protected Persona beneficiario;
    protected int timMeses;
    protected String ciudad;

    public Prestamo(Persona a, int b, String c) {
        beneficiario = a;
        timMeses = b;
        ciudad = c;
    }
    public void establecerBeneficiario(Persona g){
        beneficiario = g;
    }
    public void establercerTiempoMeses(int g){
        timMeses = g;
    }
    public void establercerCiudad(String g){
        ciudad = g;
    }
    public Persona obtenerBeneficiario(){
        return beneficiario;
    }
    public int obtenerTiempoMeses(){
        return timMeses;
    }
    public String obtenerCiudad(){
        return ciudad;
    }
    @Override
    public String toString(){
        String cadena = String.format("Beneficiadio: \n%sMeses de prestamo: \n%s" +
                "Ciudad: \n%s",obtenerBeneficiario(),obtenerTiempoMeses(),
                obtenerCiudad());
        return cadena;
    }
}
