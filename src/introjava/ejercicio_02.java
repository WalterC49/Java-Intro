/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nombre = leer.nextLine();
        System.out.println("Su nombre es: " +nombre);
        
    }
    
}
