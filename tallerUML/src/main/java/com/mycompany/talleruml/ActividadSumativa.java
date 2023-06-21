
package com.mycompany.talleruml;
import java.util.ArrayList;
import java.util.Date;

public abstract class ActividadSumativa {
    protected String titulo;
    protected Date fechaDeEntrega;
    protected float puntajeMaximo;
    protected String contenido;
    protected float calificacion;
    protected String id;
    private ArrayList<ActividadSumativa> actividadesSumativas[];
    
    
    
    public ActividadSumativa(String titulo, Date fechaDeEntrega, float puntajeMaximo, String contenido, float calificacion, String id) {
        this.titulo = titulo;
        this.fechaDeEntrega = fechaDeEntrega;
        this.puntajeMaximo = puntajeMaximo;
        this.contenido = contenido;
        this.calificacion = calificacion;
        this.id = id;
    }
    
    
    
    
}
