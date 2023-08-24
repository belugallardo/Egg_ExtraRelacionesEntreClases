/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;


import java.util.ArrayList;


/**
 *
 * @author belugallardo
 */
/*De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada.*/
public class Cine {
    private Pelicula pelicula;
    private String[][] sala;
    private int precio;

    public Cine() {
    }

    public Cine(Pelicula pelicula, String[][] sala, int precio) {
        this.pelicula = pelicula;
        this.sala = new String[8][6];
        this.precio = precio;
        
    }
    

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public String[][] getSala() {
        return sala;
    }

    public void setSala(String[][] sala) {
        this.sala = sala;
    }


    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", sala=" + sala + ", precio=" + precio + '}';
    }
    

   
    
    
}
