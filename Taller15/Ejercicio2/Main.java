/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller15.Ejercicio2;

/**
 *
 * @author altoc
 */
public class Main {

        
    public static void main(String[] args) {
        // cree la instancia de producto y le coloque los valores (le anexe el iva actual)
        Producto producto = new Producto("Televisor", 1500000.0, 0.19);

        // Calcular el precio final
        CalcularPrecio calcularPrecio1 = new CalcularPrecio();
        double precioFinal = calcularPrecio1.calcularPrecioFinal(producto);

        // Generar una etiqueta
        GenerarEtiqueta generadorEtiqueta1 = new GenerarEtiqueta();
        String etiqueta = generadorEtiqueta1.generarEtiqueta(producto, precioFinal);

        // Mostrar la etiqueta
        System.out.println(etiqueta);
    }
}
