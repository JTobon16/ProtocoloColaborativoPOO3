/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller16.Ejercicio2;

/**
 *
 * @author OCTAVIO MARTINEZ
 */
public class Excel implements Exportable {
    
    @Override
    public void exportar(String contenido){
        System.out.println("Exportando a Excel: " + contenido);
    }
    
}
