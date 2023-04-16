/*
 * Crea una aplicación que a través de una función nos convierta una cantidad de euros
 * introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
 * función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
 * una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
 * (void).
 * El cambio de divisas es:
 * * 0.86 libras es un 1 €
 * * 1.28611 $ es un 1 €
 * * 129.852 yenes es un 1 €*
 */

package guia_7_ejercicio_14;

import java.util.Scanner;

/**
 *
 * @author Desarrollador
 */
public class Guia_7_ejercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //se crea la variable scanner para el ingreso por teclado
        Scanner teclado = new Scanner(System.in);
        
        int moneda;
        
        // se ingresa por teclado los euros a convertir
        System.out.println("Ingrese la canrtidad de euros a convertir");
        int euro = teclado.nextInt();
        do{
            System.out.println("Elija a que moneda quiere convetir:");
            System.out.println("1. Libra");
            System.out.println("2. Dolar");
            System.out.println("3. Yen");
            moneda = teclado.nextInt();
        } while(moneda <= 0 || moneda > 3);
        
        
        //se invoca a la funcion "conversionDelEuro"
        conversionDelEuro(euro, moneda);
        
    }
    
    public static void conversionDelEuro(int euro, int moneda){
        
        double libra, dolar, yene;
        
        libra = euro * 0.86;
        dolar = euro * 1.28611;
        yene = euro * 129.852;
        
        switch (moneda){
            case 1:
                System.out.println(euro + " € equivalen a " + libra + " libras");
                break;
            case 2:
                System.out.println(euro + " € equivalen a " + dolar + " dolares");
                break;
            case 3:
                System.out.println(euro + " € equivalen a " + yene + " yenes");
                break;
        } 
    }
    
}
