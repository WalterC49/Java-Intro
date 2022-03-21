/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Este programa crea un cuadrado de asteriscos de N tamaño.");
        System.out.print("Ingrese N: ");
        n = leer.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i>1 && i<n && j>1 && j<n){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        
    }
    
}
