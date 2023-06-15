/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete9;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDistancia extends Reporte{
    
    private ArrayList<EstudianteDistancia> lista;
    private double totalMatriculaDistancia;
    
    public ReporteDistancia(String nombre, String carrera, String ciclo){
        super(nombre, carrera, ciclo);
        
    }
    
    public void establecerLista(ArrayList<EstudianteDistancia> listado){
        lista = listado;
    }
    
    public void establecerTotalMatriculasDistancia(){
        
        for (int i = 0; i < lista.size(); i++) {
            totalMatriculaDistancia = totalMatriculaDistancia + 
                    lista.get(i).obtenerMatriculaDistancia();
        }
    }
    
    public ArrayList<EstudianteDistancia> obtenerLista(){
        return lista;
    }
    
    public double obtenerTotalMatriculasDistancia(){
        return totalMatriculaDistancia;
    }
    
    @Override
    public String toString(){
        
        String cadena = String.format("Carrera: %s \n"
                + "Ciclo: %s\n\n",
                carrera,
                ciclo);
        
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%sNombre: %s\n"
                    + "Edad: %d\n"
                    + "ID: %s\n"
                    + "Numero Asignaturas: %d\n"
                    + "Costo Matriculas: $%.2f\n"
                    + "Matricula Presencial: $%.2f\n\n", 
                    cadena,
                    lista.get(i).obtenerNombresEstudiante(),
                    lista.get(i).obtenerEdadEstudiante(),
                    lista.get(i).obtenerIdentificacionEstudiante(),
                    lista.get(i).obtenerNumeroAsignaturas(),
                    lista.get(i).obtenerCostoAsignatura(),
                    lista.get(i).obtenerMatriculaDistancia());
        }
        
        cadena = String.format("%s\nTotal matriculas a distancia: %.2f",
                cadena,
                totalMatriculaDistancia);
        return cadena;
    }
    
}
