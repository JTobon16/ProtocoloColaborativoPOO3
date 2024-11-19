/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller17.Ejercicio3;

/**
 *
 * @author altoc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          // creo un instancia de bicicleta
        Transporte bicicleta = new Bicicleta();
        bicicleta.mover();  // La bicicleta se mueve
        bicicleta.mostrarInformacion();  // Muestra información sobre la bicicleta

        System.out.println();  

        //creo una instancia de coche
        Transporte coche = new Coche();
        coche.mover();  
        coche.mostrarInformacion();  
    }
    
    
}
