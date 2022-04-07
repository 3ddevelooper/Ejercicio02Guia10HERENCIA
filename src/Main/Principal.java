/*
 * Bienvenido, este es un mensaje auto-generado por Damian Dries
 * Damian Dries - JAVA DEV 
 * www.damiandries.com.ar
 */
package Main;

import Entidades.Lavadora;
import Entidades.Televisor;

/**
 *
 * @author Damian Dries - "www.damiandries.com.ar"
 */
public class Principal {

    public static void main(String[] args) {
          Lavadora l1 = new Lavadora();
          System.out.println("Cargar datos de la Lavadora");
          l1 = l1.crearLavadora();
          System.out.println("El Precio Final de la Lavadora es: "+l1.precioFinal());
          Televisor t1 = new Televisor();
          System.out.println("Cargar datos del Televisor");
          t1 = t1.crearTelevisor();
          System.out.println("El Precio Final del televisor es: "+t1.precioFinal());
    }
    
}
