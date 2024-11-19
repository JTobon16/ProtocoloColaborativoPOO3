/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15.Ejercicio2;

/**
 *
 * @author altoc
 */
public class CalcularPrecio {
   
    public double calcularPrecioFinal(Producto producto) {
       double precioBase = producto.getPrecioBase();
       double impuesto = producto.getImpuesto();
              return precioBase + (precioBase * impuesto);
    }   
}
