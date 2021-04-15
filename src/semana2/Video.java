/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2;

/**
 *
 * @author camil
 */
public class Video {
    //Atributos
    private String titulo;
    private char genero;
    private boolean visto;
    private String creador;
    private String duracion;

    public Video(String titulo, char genero, boolean visto, String creador, String duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.visto = visto;
        this.creador = creador;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }
    


    
    public void mostrarDatos(String infoVideo) {
        
        System.out.println("Información de "+ titulo +": " + infoVideo);
        System.out.println("Título: " + titulo);
        System.out.println("Género: " + genero);
        System.out.println("Visto: " + visto);
        System.out.println("Creador: " + creador);
        System.out.println("Duración: " + duracion);

        
        
    }
    
    
    
    
    
    
}
