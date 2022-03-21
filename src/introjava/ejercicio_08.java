/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String pal;
        
        System.out.print("Ingrese la palabra EUREKA: ");
        pal = leer.nextLine();
        
        if ("EUREKA".equals(pal)){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        
    }
    
}
