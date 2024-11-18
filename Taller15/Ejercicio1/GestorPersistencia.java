/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15.Ejercicio1;

import Taller15.Ejercicio1.Libro;

/**
 *
 * @author altoc
 */
public class GestorPersistencia {
    
    //hice una simulacion de como quedarian guardado el contenido y lo mostraria
     public void guardarEnArchivo(Libro libro, String archivo) {
        System.out.println("Simulando guardar en el archivo: " + archivo);
        System.out.println("Contenido guardado:");
        System.out.println(libro.getInformacion());
    }
}
