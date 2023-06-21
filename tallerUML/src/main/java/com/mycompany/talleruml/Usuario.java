/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.talleruml;

/**
 *
 * @author CltControl
 */
public abstract class Usuario {
    protected String usuario;
    protected String contraseña;
    protected String nombre;
    protected String apellido;

    public Usuario(String usuario, String contraseña, String nombre, String apellido) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
    protected  boolean logIn(){
    
        return false;
    
    }
    protected  boolean logOut(){
        
        return false;
        
    }
    
}
