
package com.mycompany.talleruml;

import java.util.ArrayList;


public class Curso {
    private String id;
    private String nombre;
    private boolean estadoDisponible;
    private Profesor profesor;
    private Estudiante estudiante;
    
    private ArrayList<Estudiante> estudiantesEnEspera[];
    private ArrayList<Estudiante> estudiantesInscritos[];
    private ArrayList<Foro> foros[];
    
    

    public Curso(String id, String nombre, boolean estadoDisponible) {
        this.id = id;
        this.nombre = nombre;
        this.estadoDisponible = estadoDisponible;
    }
    
    
    
}
