/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;int num2;int num3;
        
        System.out.println("Ingrese un Nº:");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro Nº:");
        num2 = leer.nextInt();
        
        num3=num1+num2;
        
        System.out.println("Su suma es " +num3);
        
    }
    
}
