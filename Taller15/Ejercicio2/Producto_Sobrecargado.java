/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15.Ejercicio2;

/**
 *
 * @author altoc
 */
public class Producto_Sobrecargado {
    
        // declare los atributos que quiero que tenga la clase
        private String nombre;
        private double precioBase;
        private double impuesto; 

    // se genera el constructor
    public Producto_Sobrecargado(String nombre, double precioBase, double impuesto) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.impuesto = impuesto;
    }

    // cree un metodo que calculo el precio final con el porcentaje de impuesto 
    public double calcularPrecioFinal() {
        return precioBase + (precioBase * impuesto);
    }

    // cree el metodo para generar la etiqueta
    public String generarEtiqueta() {
        return "Producto: " + nombre + "\nPrecio: $" + calcularPrecioFinal();
    }

    // genere getters para los atributos 
    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double getImpuesto() {
        return impuesto;
    }
}
