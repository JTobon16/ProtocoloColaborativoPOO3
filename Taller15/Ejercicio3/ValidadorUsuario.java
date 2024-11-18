/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15.Ejercicio3;

/**
 *
 * @author altoc
 */
public class ValidadorUsuario {
    
    public boolean validarDatos(Usuario usuario) {
        return validarEmail(usuario.getEmail()) && validarPassword(usuario.getPassword());
    }
    
    //se valida que el correo tenga un arroba y punto 
    private boolean validarEmail(String email) {
        return email.contains("@") && email.contains(".");
    }
    
    //se valida que la contraseña sea mayor o igual a 8
    private boolean validarPassword(String password) {
        return password.length() >= 8;
    }
}
