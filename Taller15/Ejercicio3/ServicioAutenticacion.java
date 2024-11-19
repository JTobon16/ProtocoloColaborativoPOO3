/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15.Ejercicio3;

/**
 *
 * @author altoc
 */
public class ServicioAutenticacion {
    
    // metodo para auteenticar los datos
     public boolean autenticar(Usuario usuario, String username, String password) {
             return usuario.getUsername().equals(username) && usuario.getPassword().equals(password);
            }
}
