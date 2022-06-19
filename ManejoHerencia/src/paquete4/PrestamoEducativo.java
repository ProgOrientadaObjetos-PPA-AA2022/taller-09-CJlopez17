/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;


import paquete2.Persona;
import paquete2.Prestamo;

public class PrestamoEducativo extends Prestamo {

        protected String nivEstudio;
        protected InstitucionEducativa centEducat;
        protected double valCarrera;
        protected double mesualidad;

        public PrestamoEducativo(Persona b, int e, String d, String as,
                                 InstitucionEducativa h, double f){
            super(b,e,d);
            nivEstudio = as;
            centEducat = h;
            valCarrera = f;
        }
        public void establecerNivleEstudios(String g){
            nivEstudio = g;
        }
        public void establecerCentroEducativo(InstitucionEducativa g){
            centEducat = g;
        }
        public void establecerValorCarrera(double g){
            valCarrera = g;
        }
        public void calcularMensuliad(){
            mesualidad = (valCarrera / timMeses)-((valCarrera / timMeses)*0.1);
        }
        public String obtenerNivelEstudios(){
            return nivEstudio;
        }
        public InstitucionEducativa obtenerCentroEducativo(){
            return centEducat;
        }
        public double obtenerValorCarrera(){
            return valCarrera;
        }
        public double obtenerMensulidad(){
            return mesualidad;
        }
        @Override
        public String toString(){
            String cadena = String.format("%s",super.toString());
            cadena = String.format("%s\n Nivel de estudios: %s\nCentro Educativo: %s\n" +
                    "Valor de la Carrera: %s\nMensualida: %s\n",cadena,nivEstudio,centEducat,
                    valCarrera,mesualidad);
            return cadena;
        }

}
