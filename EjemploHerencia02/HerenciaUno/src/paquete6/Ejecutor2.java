/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        // Ingresar estudiante de tipo presencial por teclado.
        // El usuario decide cuando terminar
        // No utilizar super.toString en EstudiantePresencial
        // Debe existir 1 sola impresión de todos los estudiantes presenciales
        // No usar arreglos
        
        // Trabajo clases 16 junio 2022
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        String cadena = "";
        
        
        
        while(bandera){
            entrada.nextLine();
            System.out.println("\nIngrese nombre");
            String n = entrada.nextLine();
            System.out.println("Ingrese apellido");
            String ap = entrada.nextLine();
            System.out.println("Ingrese identificación");
            String ced = entrada.nextLine();
            System.out.println("Ingrese edad");
            int edad = entrada.nextInt();
            System.out.println("Ingrese número de créditos");
            int creditos = entrada.nextInt();
            System.out.println("Ingrese costo de créditos");
            double costo = entrada.nextInt();

            EstudiantePresencial presencial = new EstudiantePresencial(n, ap, ced,
                    edad, costo, creditos);
            presencial.calcularMatriculaPresencial();
  
            cadena = String.format("%s\n"
                    + "Nombre: %s\n"
                    + "Apellido: %s\n"
                    + "Edad: %d\n"
                    + "ID: %s\n\n%s\n",
                    cadena,
                    presencial.obtenerNombresEstudiante(),
                    presencial.obtenerApellidoEstudiante(),
                    presencial.obtenerEdadEstudiante(),
                    presencial.obtenerIdentificacionEstudiante(),
                    presencial);
            
            System.out.println("Desea salir, pulse 0:");
            int opcion = entrada.nextInt();
            
            if(opcion == 0){
                bandera = false;
            }
        }
        
        System.out.printf("%s\n", cadena);
        
        
    }
}




