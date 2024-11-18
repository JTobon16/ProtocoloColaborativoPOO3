/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15.Ejercicio3;

/**
 *
 * @author altoc
 */
public class Usuario_Sobrecargado {
    
        private String username;
        private String password;
        private String email;

    // Constructor
    public Usuario_Sobrecargado(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // Método para autenticar al usuario
    public boolean autenticar(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    // Método para validar los datos del usuario
    public boolean validarDatos() {
        return email.contains("@") && password.length() >= 8;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
