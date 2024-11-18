/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller15.Ejercicio3;

/**
 *
 * @author altoc
 */
public class Main {

    public static void main(String[] args) {
        // creo la instancia de usuario
        Usuario usuario = new Usuario("altoce16", "123456789", "altoce@gmail.com");

        // Validar datos del usuario
        ValidadorUsuario validador = new ValidadorUsuario();
        if (validador.validarDatos(usuario)) {
            System.out.println("Los datos del usuario son validos.");
        } else {
            System.out.println("Los datos del usuario no son válidos.");
        }

        // Autenticar al usuario
        ServicioAutenticacion autenticador = new ServicioAutenticacion();
        if (autenticador.autenticar(usuario, "altoce16", "123456789")) {
            System.out.println("la autenticacion exitosa.");
        } else {
            System.out.println("la autenticacion fallida.");
        }
    }
    
}
