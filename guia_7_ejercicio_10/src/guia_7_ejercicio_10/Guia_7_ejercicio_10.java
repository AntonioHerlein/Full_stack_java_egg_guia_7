/*
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
 * solicite números al usuario hasta que la suma de los números introducidos supere el
 * límite inicial.
 */
package guia_7_ejercicio_10;

import java.util.Scanner;

/**
 *
 * @author Desarrollador
 */
public class Guia_7_ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //se crea la variable scanner para el ingreso por teclado
        Scanner leer = new Scanner(System.in);
        
        //se pide que se ingrese un numero de valor limite y positivo
        System.out.println("Ingrese un valor limite positivo");
        int valorLimite = leer.nextInt();
        
        //se inicializa la variable suma en 0
        int suma = 0;
        
        //se crea un bucle do while donde la condicion es que la varible valorLimite debe ser mayor a la variable suma
        do{
            System.out.println("Ingrese un numero positivo");
            int numero = leer.nextInt();
            
            if(numero < 0){
                continue;
            }
            suma = suma + numero;
        } while (suma < valorLimite);
        
        System.out.println("El valor limite es " + valorLimite + " y la suma de los enteros digitados es: " + suma);
    } 
}
