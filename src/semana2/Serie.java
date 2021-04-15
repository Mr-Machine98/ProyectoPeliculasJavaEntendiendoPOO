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
public class Serie extends Video implements IVisualizable{
    
    private int num_temp;
    
    public Serie(String titulo, char genero, String creador, String duracion) {
        super(titulo, genero, false, creador, duracion);
        this.num_temp = 1;
    }
    
    

    @Override
    public void mostrarDatos(String infoSerie) {
        super.mostrarDatos(infoSerie); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Número de temporadas: " + num_temp);
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

    public int getNum_temp() {
        return num_temp;
    }

    public void setNum_temp(int num_temp) {
        this.num_temp = num_temp;
    }
    
     
    
}
