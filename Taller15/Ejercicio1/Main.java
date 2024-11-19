/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller15.Ejercicio1;

/**
 *
 * @author altoc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // aqui cree la instancia 
        Libro libro = new Libro("El coronel no tiene quien le escriba", "Gabriel Garcia Marquez", 150);

        // genero y muestro el reporte
        GeneradorReportes generadorReporte = new GeneradorReportes();
        String reporte = generadorReporte.generarReporte(libro);
        System.out.println(reporte);

        // la simulacion de gestor de persistencia
        GestorPersistencia gestorPersistencia = new GestorPersistencia();
        gestorPersistencia.guardarEnArchivo(libro, "libro2.txt");
    }
  }
    

