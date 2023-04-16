/*
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
 * cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
   * * * *
   *     *
   *     *
   * * * *
 */
package guia_7_ejercicio_13;

import java.util.Scanner;

/**
 *
 * @author Desarrollador
 */
public class Guia_7_ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //se crea la variable scanner para el ingreso por teclado
        Scanner teclado = new Scanner(System.in);
        
        //se pide que se ingrese por teclado el tamaño del cuadrado
        System.out.println("Ingrese el tamaño del cuadrado");
        int cuadradoN = teclado.nextInt();
        
        //se invoca a la funcion cuadrado
        cuadrado(cuadradoN);
    }
    
    public static void cuadrado(int cuadradoN){
        
        //se crea 2 bucles para el recorrido del cuadrado
        for(int i = 0; i < cuadradoN; i++){
            for(int j = 0; j < cuadradoN; j++){
                
                //usa un condicional para agregar o no los asteriscos
                if (i==0 || i==cuadradoN-1 || j==0 || j==cuadradoN-1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            //se hace un salto de linea
            System.out.println("");
        }
    }
    
}
