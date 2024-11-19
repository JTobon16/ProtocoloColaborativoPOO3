/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller17.Ejercicio1;

/**
 *
 * @author altoc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
         // cree una instancia de cada clase
        Figura circulo = new Circulo(6.0);
        Figura rectangulo = new Rectangulo(2.0, 4.0); 

        //llame los metodos sin problema cumpliendose el principio de lsp, ya que ambas clases les sirve el mismo metodo
        System.out.println("Area del circulo: " + circulo.calcularArea());
        System.out.println("Area del rectangulo: " + rectangulo.calcularArea());
    }
    
    
}
