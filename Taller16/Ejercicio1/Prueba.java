/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller16.Ejercicio1;

/**
 *
 * @author OCTAVIO MARTINEZ
 */
public class Prueba {
    
    public static void main(String[] args) {
        
        // Crear instancias de los diferentes métodos de pago
        Descuento efectivo = new Efectivo();
        Descuento nequi = new Nequi();
        Descuento tarjeta = new TarjetaCredito();
        
        // Crear instancia de ProcesarDescuento
        ProcesarDescuento procesar = new ProcesarDescuento();
        
        // Definir un monto de ejemplo
        double monto = 18000.0;
        
        // Realizar pagos con diferentes métodos de descuento
        System.out.println("Proceso de pagos:");
        procesar.realizarPago(efectivo, monto);
        procesar.realizarPago(nequi, monto);
        procesar.realizarPago(tarjeta, monto);
    }
}
