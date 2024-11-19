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
public class GeneradorReportes {
       // reporte con al informacion del libro usando los get que genere en la clase Libro
        
        public String generarReporte(Libro libro) {
            return "Reporte del libro:\n" +
               "Titulo: " + libro.getTitulo() + "\n" +
               "Autor: " + libro.getAutor() + "\n" +
               "Numero de paginas: " + libro.getNumeroPaginas();
    }
}
    