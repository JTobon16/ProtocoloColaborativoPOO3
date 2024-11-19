/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller16.Ejercicio1;

/**
 *
 * @author OCTAVIO MARTINEZ
 */
public class Efectivo extends Descuento {

    public Efectivo() {
    }
    
    
    
    @Override
    public void procesarDescuento(double monto){
        System.out.println("el descuento por pago en efectivo es: " + monto);
    }
    
    
    
    
    
}
