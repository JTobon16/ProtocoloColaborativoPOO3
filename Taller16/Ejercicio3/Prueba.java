/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller16.Ejercicio3;

/**
 *
 * @author OCTAVIO MARTINEZ
 */
public class Prueba {
    
    public static void main(String[] args) {
        // Crear instancias de los diferentes tipos de mensajeros
        Mensajero sms = new SMS();
        Mensajero texto = new Texto();
        
        // Crear instancia del gestor de notificaciones
        GestorNotificacion gestor = new GestorNotificacion();
        
        // Enviar notificación utilizando SMS
        gestor.notificar(sms, "Hola Jonathan, ¿cómo estás?");
        
        // Enviar notificación utilizando Texto
        gestor.notificar(texto, "Hola Camila, ¡nos vemos pronto!");
    }
    
}
