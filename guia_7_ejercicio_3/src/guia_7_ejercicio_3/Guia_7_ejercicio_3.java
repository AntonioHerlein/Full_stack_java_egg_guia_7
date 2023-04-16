/*
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
 * en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package guia_7_ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author Desarrollador
 */
public class Guia_7_ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //se crea la variable scanner para el ingreso por patanlla
        Scanner leer = new Scanner(System.in);
        
        //se pide por teclado el ingreso de una frase 
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        
        //muestra por pantalla el resultado en minuscula y mayuscula
        System.out.println("La frase en meniscula es: " + frase.toLowerCase());
        System.out.println("La frase en mayuscula es: " + frase.toUpperCase());
    }
    
}
