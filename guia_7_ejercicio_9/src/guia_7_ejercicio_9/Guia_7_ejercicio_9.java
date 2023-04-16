/*
 * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
 * es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
 * que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
 * investigar la función Substring y equals() de Java.
 */
package guia_7_ejercicio_9;

import java.util.Scanner;

/**
 *
 * @author Desarrollador
 */
public class Guia_7_ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //se crea la variable scanner para el ingreso por teclado
        Scanner leer = new Scanner(System.in);
        
        //se pide por pantalla el ingrese de una frase o palabra
        System.out.println("Ingrese una frase o palabra");
        String frase = leer.nextLine();
        
        //se guarda en la variable C el primer caracter de la frase o palabra ingresada
        String C = frase.substring(0, 1);
        
        //se comprueba si la variable C es igual a la letra "a" o "A", si es asi sera "correcto" de lo contrario sera "incorrecto"
        if (C.equalsIgnoreCase("A")){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
    
}
