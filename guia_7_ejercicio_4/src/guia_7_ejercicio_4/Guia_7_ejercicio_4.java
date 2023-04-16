/*
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
 * Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package guia_7_ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author Desarrollador
 */
public class Guia_7_ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //se crea la variable scanner para el ingreso por teclado
        Scanner leer = new Scanner(System.in);
        
        //se pide ingresar los grados centigrados y guardarlos en la variable c
        System.out.println("Ingrese los grados centigrados");
        int C = leer.nextInt();
        
        //se realiza la operacion para convertir grados centigrados a fahrenheit
        int F = 32 + (9 * C / 5);
        
        //se imprime por pantalla el resultado
        System.out.println("Los grados centigrados ingresdos: " + C + ". Equivalen a " + F + " grados Fahrenheit");
    }
    
}
