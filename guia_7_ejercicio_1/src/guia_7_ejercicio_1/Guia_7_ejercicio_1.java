/*
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
 * dos. El programa deberá después mostrar el resultado de la suma
 */
package guia_7_ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author Desarrollador
 */
public class Guia_7_ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //se crea la variable Scanner que se utiliza para leer datos
        Scanner leer = new Scanner(System.in);
        
        //se pide por por pantalla los numeros a ingresar y se guarda en las variables num1 y num2
        System.out.println("Ingrese el 1er numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el 2do numero");
        int num2 = leer.nextInt();
        
        //se suman los 2 numeros ingreados y se
        int suma = num1 + num2;
        
        System.out.println("la suma de los 2 numeros ingresados es: " + suma);
    }
    
}
