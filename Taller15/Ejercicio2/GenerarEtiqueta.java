/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15.Ejercicio2;

/**
 *
 * @author altoc
 */
public class GenerarEtiqueta {
    
    
    public String generarEtiqueta(Producto producto, double precioFinal) {
            return "Producto: " + producto.getNombre() + "\nPrecio: $" + precioFinal;
    }
}
