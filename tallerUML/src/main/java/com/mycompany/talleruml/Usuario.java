/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.talleruml;

import Autenticacion.MetodoAutenticacion;
import java.util.ArrayList;

/**
 *
 * @author CltControl
 */
public class Usuario {
    protected String usuario;
    protected String contraseña;
    protected String nombre;
    protected String apellido;
    protected ArrayList<Incidente> incidentes;

    public Usuario(String usuario, String contraseña, String nombre, String apellido) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
    protected  boolean logIn(MetodoAutenticacion autenticar){
    
        return false;
    
    }
    protected  boolean logOut(MetodoAutenticacion autentico){
        
        return false;
        
    }
    
}
