/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller17.Ejercicio3;

/**
 *
 * @author altoc
 */
abstract class Transporte {
    
      private String tipo;

    // Constructor 
    public Transporte(String tipo) {
        this.tipo = tipo;
    }

    // Método para la clase
    public void mover() {
        System.out.println("El " + tipo + " se esta moviendo.");
    }

    // un metodo abstracto para implementar en las clases derivadas
    public abstract void mostrarInformacion();
    
}
