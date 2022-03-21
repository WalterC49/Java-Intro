/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1,num2,num3,num4;
        
        System.out.println("Este programa recibe 4 e imprime lineas de asteriscos del tamaño de lo número ingresados.");
        do{
            System.out.print("Ingrese el 1er nº entre 1 y 20: ");
            num1 = leer.nextInt();
        }while(num1<1 && num1>20);
        do{
            System.out.print("Ingrese el 2do nº entre 1 y 20: ");
            num2 = leer.nextInt();
        }while(num2<1 && num2>20);
        do{
            System.out.print("Ingrese el 3er nº entre 1 y 20: ");
            num3 = leer.nextInt();
        }while(num3<1 && num3>20);
        do{
            System.out.print("Ingrese el 4to nº entre 1 y 20: ");
            num4 = leer.nextInt();
        }while(num4<1 && num4>20);
        
        System.out.println("");
        System.out.print(""+num1+" ");
        for(int i=1;i<=num1;i++){
            System.out.print("*");
        }
        
        System.out.println("");
        System.out.print(""+num2+" ");
        for(int i=1;i<=num2;i++){
            System.out.print("*");
        }
        
        System.out.println("");
        System.out.print(""+num3+" ");
        for(int i=1;i<=num3;i++){
            System.out.print("*");
        }
        
        System.out.println("");
        System.out.print(""+num4+" ");
        for(int i=1;i<=num4;i++){
            System.out.print("*");
        }
        
        System.out.println("");
    }
    
}
