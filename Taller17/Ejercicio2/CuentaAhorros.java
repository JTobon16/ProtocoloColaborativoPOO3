/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller17.Ejercicio2;

/**
 *
 * @author altoc
 */
public class CuentaAhorros extends CuentaBancaria{
    
  
    public CuentaAhorros(String titular, double saldoInicial) {
        super(titular, saldoInicial);  // Llamada al constructor de la clase base
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Cuenta de Ahorros de " + getTitular());
        System.out.println("Saldo: " + consultarSaldo());
    }
}
