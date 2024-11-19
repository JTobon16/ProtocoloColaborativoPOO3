/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller14.Ejercicio3;

/**
 *
 * @author OCTAVIO MARTINEZ
 */
public class Carro extends Vehiculo {
    
    protected String nombre; 

    public Carro(String nombre) {
        this.nombre = nombre;
    }
    
    public void manejar(){
        System.out.println(" El carro lo maneja valentina. ");
    }
    
}
