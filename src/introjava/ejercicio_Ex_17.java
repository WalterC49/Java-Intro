/*
Crea una aplicación que nos pida un número por teclado y con una función se lo
pasamos por parámetro para que nos indique si es o no un número primo, debe
devolver true si es primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25
no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_Ex_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        
        System.out.println("Este programa recibe un número y dice si es primo o no.");
        System.out.print("Ingrese un número: ");
        n=s.nextInt();
        
        if(revisar(n)){
            System.out.println(n+" es un número primo.");
        }else{
            System.out.println(n+" no es un número primo.");
        }
    }
    
    public static boolean revisar(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        
        return c==2;
    }
    
}
