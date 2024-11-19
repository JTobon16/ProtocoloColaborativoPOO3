/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller17.Ejercicio3;

/**
 *
 * @author altoc
 */
public class Bicicleta extends Transporte {
    
    
    //llame el constructor de la clase base
     public Bicicleta() {
        super("Bicicleta");  
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Esto es una bicicleta. Es un medio de transporte no motorizado.");
    }
}
