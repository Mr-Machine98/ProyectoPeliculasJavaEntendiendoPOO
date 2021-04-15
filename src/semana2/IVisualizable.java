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
public interface IVisualizable {
    
    public void marcarVisto(); //CAMBIA EL ATRIBUTO VISTO A TRUE
    public boolean esVisto(); //DEVUELVE EL ESTADO DEL ATRIBUTO VISTO
    public String tiempoVisto(String visto);// DEVUELVE EL TIEMPO EN QUE SE VISUALIZO
    
}
