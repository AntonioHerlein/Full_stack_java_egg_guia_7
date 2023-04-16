/*
 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
 * al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
 * numero y si se encuentra repetido
 */
package guia_7_ejercicio_16;

import java.util.Scanner;

/**
 *
 * @author Desarrollador
 */
public class Guia_7_ejercicio_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        int vectorN = teclado.nextInt();
        
        int[] vector = new int[vectorN];
        
        int[] retorno = numerosAleatoreos(vector, vectorN);
        
        numeroABuscar(vector, vectorN);
        
        
    }
    
    public static int[] numerosAleatoreos(int[] vector, int vectorN){
        
        for(int i=0; i < vectorN; i++){
            int numAleatoreo = (int) (Math.random() * 100);
            vector[i] = numAleatoreo;
        }
        return vector;
    }
    
    public static void numeroABuscar(int[] vector, int vectorN){
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el numero a buscar");
        int numABuscar = teclado.nextInt();
        
        int count = 0;
        int[] pos = new int[vectorN];
        
        for (int i=0; i<vectorN; i++){
            if (vector[i] != numABuscar){
                continue;
            }
            count += 1;
            System.out.println("El numero se encontro en la posicion " + i + " del vector");
            }
        System.out.println("-------------------------------------------------");
        if (count == 1){
            System.out.println("El numero buscado se encontro " + count + " vez");
        } else {
            System.out.println("El numero buscado se encontro " + count + " veces");
        }
        
        }
    }