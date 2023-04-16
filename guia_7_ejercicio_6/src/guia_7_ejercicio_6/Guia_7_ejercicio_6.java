/*
 * Crear un programa que dado un numero determine si es par o impar.
 */
package guia_7_ejercicio_6;

/**
 *
 * @author Desarrollador
 */
public class Guia_7_ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //se crea un numero aleatoreo del 1 al 20
        double numAleatorio = Math.floor(Math.random() * 20);
        
        parONo(numAleatorio);
        }
    
    public static void parONo(double numAleatorio){
        //se verifica si el numero es par o impar y segun el resultado el mismo se imprime por pantalla
        if (numAleatorio % 2 == 0){
            System.out.println("El numero " + numAleatorio + " es PAR");
        } else {
            System.out.println("El numero " + numAleatorio + " es IMPAR");
        }
    }

}
