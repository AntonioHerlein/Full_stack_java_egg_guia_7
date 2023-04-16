/*
 * Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
 * una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
 * de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
 * denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package guia_7_ejercicio_19;

/**
 *
 * @author Desarrollador
 */
public class Guia_7_ejercicio_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    int[][] matriz = new int[3][3];
    int[][] matriz2 = new int[3][3];
        
        llenadoDeMatriz(matriz);
        mostrarMatriz(matriz);
        mostrarMatrizTraspuesta(matriz, matriz2);
        antiSimetrica(matriz,matriz2);
        
    }
    
    public static void llenadoDeMatriz (int[][] matriz){
        
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                int num = -1 + (int) (Math.random() * 3);
                matriz[i][j] = num;
            }        
        }
    }
    
    public static void mostrarMatriz (int[][] matriz){
        
        System.out.println("Matriz normal");
        System.out.println("-------------");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
        System.out.println();
    }
    
    public static void mostrarMatrizTraspuesta (int[][] matriz, int[][]matriz2){
        
        System.out.println("Matriz traspuesta");
        System.out.println("-----------------");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                matriz2[i][j] = matriz[j][i];
                System.out.print("[" + matriz2[i][j] + "] ");
            }
            System.out.println("");
        }
    }
    
    public static void antiSimetrica(int[][] matriz, int[][] matriz2){
        
        int cont = 0;
        
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                if (matriz2[i][j] == -(matriz[j][i])){
                    cont += 1;
                }
            }
        }
        System.out.println("----------------------------------------------");
        if (cont == 9){
            System.out.println("La Matriz 1 es anti simetrica a la Matriz 2");
        } else {
            System.out.println("La Matriz 1 NO es anti simetrica a la Matriz 2");
        }
    }
}
