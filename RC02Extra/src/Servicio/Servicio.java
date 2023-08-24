/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cine;
import Entidad.Espectador;
import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author belugallardo
 */
public class Servicio {

    ArrayList<Espectador> listaEspectadores = new ArrayList();
    ArrayList<Pelicula> listaPelicula = new ArrayList();
    Cine cine = new Cine();
    Scanner leer = new Scanner(System.in);

    public void crearEspectador() {
        Espectador espectador = new Espectador();
        System.out.println("Ingrese su nombre");
        espectador.setNombre(leer.nextLine());
        System.out.println("Ingrese la edad");
        espectador.setEdad(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingrese dinero disponible");
        espectador.setDineroDisponible(leer.nextInt());
        leer.nextLine();

        listaEspectadores.add(espectador);
    }

    public void llenarPelicula() {
        Pelicula peli = new Pelicula();

        System.out.println("Ingrese el nombre del director");
        peli.setDirector(leer.nextLine());

        System.out.println("Ingrese el titulo de la pelicula");
        peli.setTitulo(leer.nextLine());

        System.out.println("Ingrese la edad requerida para poder verla");
        peli.setEdadMinima(leer.nextInt());
        leer.nextLine();

        System.out.println("Ingrese la duracion de la pelicula");
        peli.setDuracion(leer.nextInt());
        leer.nextLine();

        listaPelicula.add(peli);
    }

    public void llenarCine() {
        
        Pelicula busqueda = buscarPelicula();
        cine.setPelicula(busqueda);

        System.out.println("Que precio tiene la entrada?");
        cine.setPrecio(leer.nextInt());
        leer.nextLine();
        abrirSala();

        for (Espectador espectadores : listaEspectadores) {
            if (espectadores.getEdad() >= busqueda.getEdadMinima() && espectadores.getDineroDisponible() >= cine.getPrecio()) {

                while (!chequearAsientoVacio()) {
                }
            }
        }
    }

    private void abrirSala(){
        String[][] abrir = new String[8][6];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                abrir[i][j] = "E";
            }
            
        }
        cine.setSala(abrir);
    }
    private boolean chequearAsientoVacio() {

        Random random = new Random();
        int fila = random.nextInt(8);
        int columna = random.nextInt(6);
        
       
        if (cine.getSala()[fila][columna].equals("E")) {
                        cine.getSala()[fila][columna] = "X";
                        System.out.println("Asiento Ocupado");
                       return true;
                   } 
        
//        
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 6; j++) {
//                if (i == fila && j == columna) {
//                    if (cine.getSala()[i][j].equals("E")) {
//                        asiento[i][j] = "X";
//                        
//                        return true;
//                    } 
//
//                }
//            }
//        }
        
        return false;
    }


     private Pelicula buscarPelicula() {
        System.out.println("De que pelicula se trata?");
        String peliculaBuscada = leer.nextLine();

        for (Pelicula pelicula : listaPelicula) {
            if (pelicula.getTitulo().equalsIgnoreCase(peliculaBuscada)) {
                return pelicula;
            }
        }
        System.out.println("Pelicula no disponible");
        return buscarPelicula();
    }
     
     public void mostrarSala(){
         String[][] copiaCine = cine.getSala();
         for (int i = 0; i < 8; i++) {
             for (int j = 0; j < 6; j++) {
                 System.out.print(copiaCine[i][j]);
             }
             System.out.println("");
         }
     }
}