/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;


import paquete2.Persona;
import paquete2.Prestamo;

public class PrestamoAutomovil extends Prestamo{

    protected String tipAuto;
    protected String marca;
    protected Persona garante;
    protected double valAuto;
    protected double mensualidad;

    public PrestamoAutomovil(Persona nom,int ape,String usName,String tiAu,
                             String mar,Persona per,Double vaAut){
        super (nom, ape, usName);
        tipAuto = tiAu;
        marca = mar;
        garante = per;
        valAuto = vaAut;

    }
    public void establecerTipoAuto(String j){
        tipAuto = j;
    }
    public void establecerMarca(String j){
        marca = j;
    }
    public void establecerGarante(Persona j){
        garante = j;
    }
    public void establecerValorAuto(double j){
        valAuto = j;
    }
    public void cacularMensualidad(){
        mensualidad = valAuto / timMeses;
    }
    public String obtenerTipoAuto(){
        return tipAuto;
    }
    public String obtenerMarca(){
        return marca;
    }
    public Persona obtenerGarante(){
        return garante;
    }
    public double obtenerValorAuto(){
        return valAuto;
    }
    public double obtenerMensualidad(){
        return mensualidad;
    }
    @Override
    public String toString(){
        String cadena = String.format("\n%s",super.toString());
        cadena = String.format("\n%sTipo de carro: \n%sMarca del Carro: \n%sGarante: \n%s" +
                "Precio del Carro: \n%sValor de la mensualidad: \n%s",cadena, tipAuto,
                marca,garante,valAuto,mensualidad);
        return cadena;
    }
}