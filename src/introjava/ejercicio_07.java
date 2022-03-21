/*
Crear un programa que dado un numero determine si es par o impar.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        
        System.out.print("Ingrese un Nª: ");
        num = leer.nextInt();
        
        if(num%2==0){
            System.out.println("El Nº " +num+ " es par");
        }else{
            System.out.println("El Nº " +num+ " es impar");
        }
        
    }
    
}
