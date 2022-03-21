/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese una temperatura en Celsius:");
        num = leer.nextInt();
        
        num=32+(9*num/5);
        
        System.out.println(num);
        
        
    }
    
}
