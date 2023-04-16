/*
 * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
 * muestre por pantalla en orden descendente.
 */
package guia_7_ejercicio_15;

/**
 *
 * @author Desarrollador
 */
public class Guia_7_ejercicio_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] vector = new int[100];
        
        mostrarInverso(vector);
    }
    
    public static void mostrarInverso(int[] vector){
        
        for (int i = 0; i < 100; i++){
            vector[i] = i+1;
        }
        
        for (int j = 99; j >= 0; j--){
            System.out.println(vector[j]);
        }
    }
    
}
