/*
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
 * doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package guia_7_ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author Desarrollador
 */
public class Guia_7_ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //se crea la variable scanner para el ingreso por teclado
        Scanner leer = new Scanner(System.in);
        
        //se pide que se ingrese un numero por teclado
        System.out.println("Ingrese un numero entero");
        int numIngresado = leer.nextInt();
        
        //se invoca a la funcion "calculo"
        calculo(numIngresado);
        
    }
    
    public static void calculo(int numIngresado){
        
         //se realiza las operaciones matematicas
        int doble = numIngresado * 2;
        int triple = numIngresado * 3;
        double raiz = Math.sqrt(numIngresado);
        
        //muestra por pantalla los resultados de las operaciones matematicas
        System.out.println("el doble del numero ingresado es: " + doble);
        System.out.println("El triple del numero ingresado es: " + triple);
        System.out.println("La raiz cuadrada del numero ingresado es: " + raiz);
    }
}
