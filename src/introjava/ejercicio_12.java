/*
 Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        
        do{
            System.out.print("Ingrese un valor entre 0 y 10: ");
            num = leer.nextInt();
            
            if(num>=0 && num<=10){
                break;
            }
            
        }while(num<0 || num>10);
        
    }
    
}
