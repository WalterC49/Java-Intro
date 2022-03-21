/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        
        System.out.print("Ingrese un Nº entero: ");
        num = leer.nextInt();
        
        System.out.println("Su doble es: " +num*2);
        System.out.println("Su triple es: " +num*3);
        System.out.println("Su raíz cuadrada es: " +Math.sqrt(num));
        
    }
    
}
