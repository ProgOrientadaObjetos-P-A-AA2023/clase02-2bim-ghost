/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author LUIS MORA
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        // 1. Crear y presentar un obj de tipo Estudiante Presencial
        EstudiantePresencial estPresencial =
                new EstudiantePresencial("Luis", "Mora", "4646222", 19);
        estPresencial.establecerNumeroCreditos(25);
        estPresencial.establecerCostoCredito(23.3);
        estPresencial.calcularMatriculaPresencial();
        
        System.out.println(estPresencial);
    }
}
