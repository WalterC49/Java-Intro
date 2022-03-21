/*
Escribir un programa que lea un número entero y devuelva el número de dígitos
que componen ese número. Por ejemplo, si introducimos el número 12345, el
programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente
utilizando el operador de división. Nota: recordar que las variables de tipo entero
truncan los números o resultados.
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_Ex_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        
        System.out.println("Este programa lee un Nº entero y devuelve su cant. de cifras.");
        System.out.print("Ingrese un número: ");
        n=leer.nextInt();
        
        System.out.println("La cantidad de cifras que tiene "+n+" es "+cifras(n));
        
    }
    
    public static int cifras(int n){
        int c=0;
        
        do{
            if(n>0){
                n=n/10;
                c++;
            }
        }while(n>0);
        
        return c;
    } 
    
}
