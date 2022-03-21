/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.
 */
package introjava;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Walter
 */
public class ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese una frase: ");
        String frase = leer.nextLine();
        
        frase=toLowerCase(frase);
        System.out.println("La misma frase en minúsculas es: " +frase);
        frase=toUpperCase(frase);
        System.out.println("La misma frase en mayúsculas es: " +frase);
        
    }
    
}
