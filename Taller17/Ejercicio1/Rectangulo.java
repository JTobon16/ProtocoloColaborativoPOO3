/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller17.Ejercicio1;

/**
 *
 * @author altoc
 */
public class Rectangulo extends Figura{
    
        private double ancho;
        private double alto;

    // realice su respectivo constructor
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // metodo para calcular area
    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}
