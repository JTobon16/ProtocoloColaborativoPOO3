/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller14.Ejercicio3;

/**
 *
 * @author OCTAVIO MARTINEZ
 */
public class Moto extends Vehiculo {
    
     protected String nombre; 

    public Moto(String nombre) {
        this.nombre = nombre;
    }
    
    public void conducir(){
        System.out.println(" LA MOTO ES CONDUCIDA POR CAMILO. ");
    }
    
}
