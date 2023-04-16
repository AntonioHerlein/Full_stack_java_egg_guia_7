/*
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
 * pantalla.
 */
package guia_7_ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author Desarrollador
 */
public class Guia_7_ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //se crea la variable scanner para el ingreso de datos por pantalla
        Scanner leer = new Scanner(System.in);
        
        //se pide por pantalla un nombre y se guarda en la varible nombre
        System.out.println("Ingrese su nombre");
        String nombreUsuario = leer.nextLine();
        
        //se muestra por pantalla el nombre ingresado
        System.out.println("El nombre ingresado es: " + nombreUsuario);
    }
    
}
