/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.talleruml;

import java.util.ArrayList;

/**
 *
 * @author CltControl
 */
public class Profesor extends PersonalAcademico{
    private ArrayList<Curso> cursosACargo;

    public Profesor(String usuario, String contraseña, String nombre, String apellido) {
        super(usuario, contraseña, nombre, apellido);
    }
    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){
        
    }
    public void calificarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa actividadSumativa){
        
    }
    public void aceptarInscripcion(Curso curso, String usuarioEstudiante){
        
    }
    public void crearNuevoForo(Foro foro){
        
    }
    
    
}
