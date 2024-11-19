/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller14.Ejercicio2;

/**
 *
 * @author OCTAVIO MARTINEZ
 */
public class Prueba {
    
    public static void main(String[] args) {
        // Crear una instancia de Estudiante
        Estudiante estudiante = new Estudiante("Alejandro", "Ramos");

        // Llamar al método presentarse
        estudiante.presentarse();
        
        Profesor profesor = new Profesor("Andres", "Fuentes");
        
        
        profesor.presentarse();
    }
}
