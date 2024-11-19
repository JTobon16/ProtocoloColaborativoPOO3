/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller17.Ejercicio1;

/**
 *
 * @author altoc
 */
public class Circulo extends Figura {
    private double radio;

   //realice el constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // coloque un metodo
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
