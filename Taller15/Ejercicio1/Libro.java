/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15.Ejercicio1;

/**
 *
 * @author altoc
 */
public class Libro {
    
     private String titulo;
     private String autor;
     private int numeroPaginas;

    // Constructor
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // Método que devuelve la información completa del libro
    public String getInformacion() {
        return "'" + titulo + "' por " + autor + " (numero de paginas: " + numeroPaginas + ")";
    }

    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
}
