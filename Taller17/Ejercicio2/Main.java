/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller17.Ejercicio2;

/**
 *
 * @author altoc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           // Crear una cuenta de ahorros
        CuentaAhorros cuenta = new CuentaAhorros("Juan Perez", 2000000.0);

        // Mostrar la información inicial de la cuenta
        cuenta.mostrarInformacion();

        // Depositar dinero en la cuenta
        cuenta.depositar(500000.0);
        System.out.println("Despues de depositar $500.000: ");
        cuenta.mostrarInformacion();

        // Retirar dinero de la cuenta
        cuenta.retirar(200000.0);
        System.out.println("Despues de retirar $200.000: ");
        cuenta.mostrarInformacion();
    }
    
    
}
