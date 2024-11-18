/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15.Ejercicio1;

/**
 *
 * @author altoc
 */
public class Libro_Sobrecargado {
    
        private String titulo;
        private String autor;
         private int numeroPaginas;

    // Constructor
    public Libro_Sobrecargado(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // Métodos relacionados con la información
    public String obtenerInformacion() {
        return "'" + titulo + "' por " + autor + " (numero de paginas: " + numeroPaginas + ")";
    }

    // Métodos relacionados con la generación de reportes
    public String generarReporte() {
        return "Reporte del libro: \nTítulo: " + titulo + "\nAutor: " + autor + "\nnumero de paginas: " + numeroPaginas;
    }

    // Métodos relacionados con la persistencia
    public void guardarEnArchivo(String archivo) {
        // Simulación de guardar en archivo
        System.out.println("Guardando en el archivo: " + archivo);
        System.out.println(obtenerInformacion());
    }
}
        
  

