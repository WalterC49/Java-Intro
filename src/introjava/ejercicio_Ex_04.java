/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_Ex_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        
        System.out.println("Este programa recibe un Nº entre 1 y 10 y muestra su equivalente en romano.");
        
        do{
            System.out.print("Ingrese un Nº entre 1 y 10: ");
            n = leer.nextInt();
            
        }while(n<0 || n>11);
        
        romano(n);
    }
    
    public static void romano(int n){
        switch(n){
            case 1:
                System.out.println(+n+" en número romano es I");
                break;
            case 2:
                System.out.println(+n+" en número romano es II");
                break;
            case 3:
                System.out.println(+n+" en número romano es III");
                break;
            case 4:
                System.out.println(+n+" en número romano es IV");
                break;
            case 5:
                System.out.println(+n+" en número romano es V");
                break;
            case 6:
                System.out.println(+n+" en número romano es VI");
                break;
            case 7:
                System.out.println(+n+" en número romano es VII");
                break;
            case 8:
                System.out.println(+n+" en número romano es VIII");
                break;
            case 9:
                System.out.println(+n+" en número romano es IX");
                break;
            case 10:
                System.out.println(+n+" en número romano es X");
                break;         
        }
    }
    
}
