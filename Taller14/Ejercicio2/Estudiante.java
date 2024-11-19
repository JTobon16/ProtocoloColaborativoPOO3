/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller14.Ejercicio2;

/**
 *
 * @author OCTAVIO MARTINEZ
 */
public class Estudiante extends Persona{
    
    private String nombre; 
    private String apellido;

    public Estudiante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    @Override
    public void presentarse(){
        System.out.println(" EL NOMBRE DEL ESTUDIANTE ES ALEJANDRO RAMOS. ");
    }
            
    
}
