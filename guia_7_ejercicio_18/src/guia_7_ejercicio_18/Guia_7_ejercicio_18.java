/*
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
 * traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
 * obtiene cambiando sus filas por columnas (o viceversa).
 */
package guia_7_ejercicio_18;

/**
 *
 * @author Desarrollador
 */
public class Guia_7_ejercicio_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] matriz = new int[4][4];
        
        llenadoDeMatriz(matriz);
        mostrarMatriz(matriz);
        mostrarMatrizTraspuesta(matriz);
        
    }
    
    public static void llenadoDeMatriz (int[][] matriz){
        
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                matriz[i][j] = (int) (Math.random() * 100);
            }        
        }
    }
    
    public static void mostrarMatriz (int[][] matriz){
        
        System.out.println("Matriz normal");
        System.out.println("-------------");
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
        System.out.println();
    }
    
    public static void mostrarMatrizTraspuesta (int[][] matriz){
        
        System.out.println("Matriz traspuesta");
        System.out.println("-----------------");
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                System.out.print("[" + matriz[j][i] + "] ");
            }
            System.out.println("");
        }
    }
}
