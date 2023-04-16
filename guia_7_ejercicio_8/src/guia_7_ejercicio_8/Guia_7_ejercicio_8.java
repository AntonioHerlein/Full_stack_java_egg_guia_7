/*
 * Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si
 * el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
 * por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
 * “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
package guia_7_ejercicio_8;

import java.util.Scanner;

/**
 *
 * @author Desarrollador
 */
public class Guia_7_ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //se crea la variable scanner para el ingreso de teclado por consola
        Scanner leer = new Scanner(System.in);
        
        String frase;
        
        do{
            //se pide al usuario que ingrese una frase o palabra y se guarda en la varible frase
            System.out.println("Ingrese una palabra o frase");
            frase = leer.nextLine(); 
        } while (frase.length() != 8);
        
        //se crea un condicional para saber si la frase ingresada tiene 8 letras o no
        //de ser verdadero se mostrara por pantalla "correcto", de lo contrario se mostrara "incorrecto"
            if (8 == frase.length()){
                System.out.println("Correcto");
            } else {
                System.out.println("Incorrecto");
            }
    }
    
}
