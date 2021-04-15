/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author camil
 */
public class Main {
    public static void main(String[] args) {
        //ArraysList código nuevo
        
        
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        peliculas.add(new Pelicula("Cars 3", 'M', "Camilo", "1:30:59", 1998));
        peliculas.add(new Pelicula("La Momia", 'F', "Juan", "2:30:59", 2020));
        peliculas.add(new Pelicula("La Monja", 'F', "Camilo", "1:30:59", 2000));
        peliculas.add(new Pelicula("La Boquitrompona", 'F', "Juan", "2:30:59", 1999));
        peliculas.add(new Pelicula("La Gareta", 'F', "Camilo", "1:30:59", 1998));
        
        
        
        
        ArrayList<Serie> series = new ArrayList<>();
        
        series.add(new Serie("La Ñata", 'F', "Juan", "Por cap: 45:00"));
        
        series.add(new Serie("La Patitorcida", 'F', "Camilo", "Por cap: 45:00"));
        //series[1].setNum_temp(4);
        series.get(1).setNum_temp(4);
        
        
        series.add(new Serie("La Cumbanbona", 'F', "Juan", "Por cap: 45:00"));
        
        
        series.add(new Serie("La Narizona", 'F', "Camilo", "Por cap: 45:00"));
        series.get(1).setNum_temp(5);
        //series[3].setNum_temp(5);
        series.get(3).setNum_temp(5);
        
        
        
        
        series.add(new Serie("La Bembona", 'F', "Juan", "Por cap: 45:00"));
        series.get(1).setNum_temp(10);
        //series[4].setNum_temp(10);
        series.get(4).setNum_temp(10);
        
        
        
        /*
        //Marcar Series y pelis
        peliculas[0].marcarVisto();
        peliculas[3].marcarVisto();
        peliculas[4].marcarVisto();
        
        series[1].marcarVisto();
        series[2].marcarVisto();
        series[3].marcarVisto();
        series[4].marcarVisto();
        
        */
        
        peliculas.get(0).marcarVisto();
        peliculas.get(3).marcarVisto();
        peliculas.get(4).marcarVisto();
        
        
        series.get(1).marcarVisto();
        series.get(2).marcarVisto();
        series.get(3).marcarVisto();
        series.get(4).marcarVisto();
        
        
        
        
        
        //CÖDIGO viejo
        
        //Pelicula peliculas[] = new Pelicula[5];
        //Serie series[] = new Serie[5];
        
        //lenar las pelis y series
        //Pelis
        /*
        peliculas[0] = new Pelicula("Cars 3", 'M', "Camilo", "1:30:59", 1998);
        peliculas[1] = new Pelicula("La Momia", 'F', "Juan", "2:30:59", 2020);
        peliculas[2] = new Pelicula("La Monja", 'F', "Camilo", "1:30:59", 2000);
        peliculas[3] = new Pelicula("La Boquitrompona", 'F', "Juan", "2:30:59", 1999);
        peliculas[4] = new Pelicula("La Gareta", 'F', "Camilo", "1:30:59", 1998);
        
        //Series
        series[0] = new Serie("La Ñata", 'F', "Juan", "Por cap: 45:00");
        
        series[1] = new Serie("La Patitorcida", 'F', "Camilo", "Por cap: 45:00");
        series[1].setNum_temp(4);
        
        series[2] = new Serie("La Cumbanbona", 'F', "Juan", "Por cap: 45:00");
        
        series[3] = new Serie("La Narizona", 'F', "Camilo", "Por cap: 45:00");
        series[3].setNum_temp(5);
        
        series[4] = new Serie("La Bembona", 'F', "Juan", "Por cap: 45:00");
        series[4].setNum_temp(10);
         
        //Marcar Series y pelis
        peliculas[0].marcarVisto();
        peliculas[3].marcarVisto();
        peliculas[4].marcarVisto();
        
        series[1].marcarVisto();
        series[2].marcarVisto();
        series[3].marcarVisto();
        series[4].marcarVisto();
        
        */
        
        /*
        • Muestra una lista de las Películas y Series que se visualizaron y 
        un detalle de los minutos/segundos visualizados.
        */

        //LA LISTA PUES LOCO películas
        String listaPelis = "Lista de Películas: \n";
        int contadorPelis = 0;
        
        for (Pelicula pelicula : peliculas) {
            if (pelicula.esVisto() == true) {
                
                //metemos el try aquí
                
                try {
                    Scanner entrada = new Scanner(System .in);
                    System.out.print("¿Cúanto tiempo duró viendo la pellícula " + pelicula.getTitulo() + "?: ");
                    int tiempoVisto =  entrada.nextInt();
                    
                    listaPelis += "Nombre: " + pelicula.getTitulo() + "\n";
                    listaPelis += "Detalle: " + pelicula.tiempoVisto(Integer.toString(tiempoVisto)) + "\n\n";
                    contadorPelis += 1;

                } catch (Exception e) {
                    System.out.println("Ingresaste algo erróneo.");
                }
                
                
            } 
        }
        System.out.println(listaPelis);
        System.out.println("Total películas: " + contadorPelis);
        System.out.println("\n\n\n");
        
        //LISTA DE SERIES MI NEGRO
        String listaSeries = "Lista de Series: \n";
        int contadorSeries = 0;
        
        for (Serie serie : series) {
            if (serie.esVisto() == true) {
                
                try {
                    Scanner entrada = new Scanner(System .in);
                    System.out.print("¿Cúanto tiempo duró veindo la serie " + serie.getTitulo() + "?: ");
                    int tiempoVisto = entrada.nextInt();
                    
                    listaSeries += "Nombre: " + serie.getTitulo() + "\n";
                    listaSeries += "Detalle: " + serie.tiempoVisto(Integer.toString(tiempoVisto)) + "\n\n";
                    contadorSeries += 1;
                    
                } catch (Exception e) {
                    System.out.println("Ingresaste algo erróneo.");
                }
               
            } 
        }
        
        System.out.println(listaSeries);
        System.out.println("Total Series: " + contadorSeries);
        
        
        /*
        • Por último, indica la serie con más temporadas y la película 
        del año más reciente. Muéstralos en pantalla con toda su información 
        (usa el método toString()).
        */
        System.out.println("\n\n\n\n");
        
        int mayorNumTemp = series.get(0).getNum_temp();
        int mayorYear = peliculas.get(0).getYear();
        
        for (int i = 0; i < 4; i++) {
            
            /*
            
            if(mayorNumTemp < series[i + 1].getNum_temp())  mayorNumTemp = series[i + 1].getNum_temp();

            if(mayorYear < peliculas[i + 1].getYear()) mayorYear = peliculas[i + 1].getYear();
            
            */
             if(mayorNumTemp < series.get( i + 1).getNum_temp()) 
                 mayorNumTemp = series.get( i + 1).getNum_temp();
             
             if(mayorYear < peliculas.get(i + 1).getYear())
                 mayorYear = peliculas.get(i + 1).getYear();
        }
        
        System.out.println("\n\n\n");
        
        for(Serie serie: series){
            
            if (serie.getNum_temp() == mayorNumTemp){
                serie.mostrarDatos("Info sobre la serie con más temporadas");
            }
        }
        
        System.out.println("\n\n\n");
        
        for(Pelicula pelicula: peliculas){
            if(pelicula.getYear() == mayorYear) pelicula.mostrarDatos("Info sobre la pélicula más reciente.");
        }
        
        
        
        
    }
}
