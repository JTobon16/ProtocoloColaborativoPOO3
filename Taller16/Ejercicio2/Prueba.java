/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller16.Ejercicio2;

/**
 *
 * @author OCTAVIO MARTINEZ
 */
public class Prueba {
    
    public static void main(String[] args) {
        String contenido = " TALLER COLABORATIVO UNIDAD 3";

        // Exportación a PDF
        Exportable documentoPDF = new Documento();
        documentoPDF.exportar(contenido);
        
        // Exportación a Word
        Exportable word = new Word();
        word.exportar(contenido);

        // Exportación a Excel
        Exportable excel = new Excel();
        excel.exportar(contenido);
    }
    
}
