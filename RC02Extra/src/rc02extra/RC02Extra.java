/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc02extra;

import Servicio.Servicio;
import java.util.Scanner;

/**
 *
 * @author belugallardo
 */
public class RC02Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Servicio serv = new Servicio();
        Scanner leer = new Scanner(System.in); 
        String opcionPeli;
        String opcionEspectador;
        String opcionCine;
        
        do{
            System.out.println("Ingrese una pelicula");
            serv.llenarPelicula();
            
            System.out.println("Desea agregar otro? S/N");
            opcionPeli = leer.nextLine();
        }while(opcionPeli.equalsIgnoreCase("S"));
    
        do{
            System.out.println("Ingrese un espectador");
            serv.crearEspectador();
            
            System.out.println("Desea agregar otro? S/N");
            opcionEspectador = leer.nextLine();
        }while(opcionEspectador.equalsIgnoreCase("S"));
        
        serv.llenarCine();
            
        serv.mostrarSala();
    }
    
}
