/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller17.Ejercicio3;

/**
 *
 * @author altoc
 */
public class Coche extends Transporte {
    
    // llame nuevamente el constructor en esta clase derivada
    public Coche() {
        super("Coche");  
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Esto es un coche. Es un medio de transporte motorizado.");
    }
}
