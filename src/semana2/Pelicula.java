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
public class Pelicula extends Video implements IVisualizable{
    
    private int año;

    public int getYear() {
        return año;
    }

    public void setYear(int año) {
        this.año = año;
    }
    
    public Pelicula(String titulo, char genero, String creador, String duracion, int año) {
        super(titulo, genero, false, creador, duracion);
        this.año = año;
    }
    
    

    @Override
    public void mostrarDatos(String infoPelicula) {
        super.mostrarDatos(infoPelicula); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Año: " + año);
    }

    @Override
    public void marcarVisto() {
        setVisto(true);
    }

    @Override
    public boolean esVisto() {
        
       return isVisto();
    }

    @Override
    public String tiempoVisto(String visto) {
       return "Visto hasta min " + visto;
    }

    
    
}
