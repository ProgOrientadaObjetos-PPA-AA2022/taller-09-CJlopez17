/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;


import paquete2.Persona;
import paquete3.PrestamoAutomovil;
import paquete4.InstitucionEducativa;
import paquete4.PrestamoEducativo;

import java.lang.runtime.SwitchBootstraps;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Ejecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        String ls = "";
        String cadena1 = "";
        String cadena2 = "";
        do{
            System.out.println("Ingrese el tipo de prestamo que desea: ");
            System.out.println("Prestamo para Carro  [1]");
            System.out.println("Prestamo para Carrea [2]");
            System.out.println("Cerrar prceso        [0]");
            op = sc.nextInt();
            sc.nextLine();
            if(op == 1 || op == 2) {
                System.out.println("Ingrese el nombre de la persona: ");
                String nombre = sc.nextLine();
                System.out.println("Ingrese el apeliido de la persona: ");
                String apellido = sc.nextLine();
                System.out.println("Ingrese el UserName de la persona: ");
                String username = sc.nextLine();
                System.out.println("Ingrese el tiempo a pagar en meses: ");
                int meses = sc.nextInt();
                System.out.println("Ingrese la cuiadad: ");
                String ciudad = sc.nextLine();

                Persona pers = new Persona(nombre, apellido, username);
                pers.establecerNombre(nombre);
                pers.establecerApellido(apellido);
                pers.establecerUserName(username);

                switch (op) {
                    case 1:
                        do {
                            System.out.println("Ingrese el nombre de la persona: ");
                            String nomper = sc.nextLine();
                            System.out.println("Ingrese el apeliido de la persona: ");
                            String apeper = sc.nextLine();
                            System.out.println("Ingrese el UserName de la persona: ");
                            String usernameper = sc.nextLine();
                            System.out.println("Ingrese el tipo de Carro: ");
                            String tipcar = sc.nextLine();
                            System.out.println("Ingrese la marca del Carro: ");
                            String marCar = sc.nextLine();
                            System.out.println("Ingrese el valor del Carro: ");
                            double valCar = sc.nextDouble();

                            Persona pers1 = new Persona(nomper, apeper, usernameper);
                            pers1.establecerNombre(nomper);
                            pers1.establecerApellido(apeper);
                            pers1.establecerUserName(usernameper);

                            PrestamoAutomovil pres1 = PrestamoAutomovil(pers,meses,ciudad,
                                    tipcar,marCar,pers1,valCar);
                            pres1.establecerBeneficiario(pers);
                            pres1.establercerTiempoMeses(meses);
                            pres1.establercerCiudad(ciudad.toLowerCase(Locale.ROOT));
                            pres1.establecerTipoAuto(tipcar);
                            pres1.establecerMarca(marCar);
                            pres1.establecerGarante(pers1);
                            pres1.establecerValorAuto(valCar);
                            pres1.cacularMensualidad();

                            System.out.println("Ingrese (S) si desea continuar o (N) si desea terminar: ");
                            sc.nextLine();
                            ls = sc.nextLine();

                            cadena1 = String.format("%s\n", pres1);
                        } while (ls.equals("S"));
                        System.out.println(cadena1);
                        break;
                    case 2:
                        do{
                        System.out.println("Ingrese el nivel de estudio: ");
                        String nivEstu = sc.nextLine();
                        System.out.println("Ingrese el nombre de centro educativo: ");
                        String centEdu = sc.nextLine();
                        System.out.println("Ingrese las siglas del centro: ");
                        String siglas = sc.nextLine();
                        System.out.println("Ingrese el valor de la carrear: ");
                        double valCa = sc.nextDouble();

                        InstitucionEducativa j1 = new InstitucionEducativa(centEdu, siglas);

                        PrestamoEducativo k1 = new PrestamoEducativo(pers, meses, ciudad,
                                nivEstu, j1, valCa);

                        k1.establecerBeneficiario(pers);
                        k1.establercerTiempoMeses(meses);
                        k1.establercerCiudad(ciudad.toLowerCase(Locale.ROOT));
                        k1.establecerNivleEstudios(nivEstu);
                        k1.establecerCentroEducativo(j1);
                        k1.establecerValorCarrera(valCa);
                        k1.calcularMensuliad();

                        System.out.println("Ingrese (S) si desea continuar o (N) si desea terminar: ");
                        sc.nextLine();
                        ls = sc.nextLine();

                        cadena2 = String.format("%s%s\n", cadena2, k1);
                    } while (ls.equals("S")) ;
                    System.out.println(cadena2);
                    break;
                }
            }else if(op != 0){
                System.out.println("Solo puede ingresar 1 o 2");
            }else{
                System.out.println("Fin.");
            }
        }while(op != 0);
    }
}
