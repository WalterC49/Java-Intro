/*
Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
 */
package introjava;

import static java.lang.Math.max;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;int num2;
        
        System.out.print("Ingrese un Nº: ");
        num1 = leer.nextInt();
        System.out.print("Ingrese otro Nº: ");
        num2 = leer.nextInt();
        
        System.out.println("El mayor de ambos es el Nº " +max(num1,num2));
        
    }
    
}
