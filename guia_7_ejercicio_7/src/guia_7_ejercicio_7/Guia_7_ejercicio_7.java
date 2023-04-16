/*
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
 * pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
 * investigar la función equals() en Java.
 */
package guia_7_ejercicio_7;

import java.util.Scanner;

/**
 *
 * @author Desarrollador
 */
public class Guia_7_ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //se crea la variable scanner para el ingreso por teclado
        Scanner leer = new Scanner(System.in);
        
        //se pide el ingreso de una palabra por teclado
        System.out.println("Ingrese una palabra");
        String palabra = leer.nextLine();
        
        //se verifica que la palabra ingresa sea igual a "eureka", si es asi mostrara "correcto", de lo contrario "incorrecto"
        if (palabra.equals("eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
