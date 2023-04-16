/*
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
 * de 2 dígitos, etcétera (hasta 5 dígitos).

 */
package guia_7_ejercicio_17;

import java.util.Scanner;

/**
 *
 * @author Desarrollador
 */
public class Guia_7_ejercicio_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int[] vector;
        
        System.out.println("Ingrese el tamaño del vector");
        int vectorN = teclado.nextInt();
        
        vector = new int[vectorN];
         
        numerosAleatoreos(vector, vectorN);
        
        contador(vector, vectorN);
    }
    
    public static void numerosAleatoreos(int[] vector, int vectorN){
        
        for(int i=0; i < vectorN; i++){
            int numAleatoreo = (int) (Math.random() * 99999);
            vector[i] = numAleatoreo;
        }
    }
    
    public static void contador(int[] vector, int vectorN){
        
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        
        for(int i=0; i<vectorN; i++){
            if (vector[i] >= 0 && vector[i] <= 9){
                cont1 += 1;
            } else if (vector[i] >= 10 && vector[i] <= 99){
                cont2 += 1;
            } else if (vector[i] >= 100 && vector[i] <= 999){
                cont3 += 1;
            } else if (vector[i] >= 1000 && vector[i] <= 9999){
                cont4 += 1;
            } else if (vector[i] >= 10000 && vector[i] <= 99999){
                cont5 += 1;
            }
        }
        System.out.println("Hay " + cont1 + " numeros con 1 cifra");
        System.out.println("Hay " + cont2 + " numeros con 2 cifras");
        System.out.println("Hay " + cont3 + " numeros con 3 cifras");
        System.out.println("Hay " + cont4 + " numeros con 4 cifras");
        System.out.println("Hay " + cont5 + " numeros con 5 cifras");
    }
    
}
