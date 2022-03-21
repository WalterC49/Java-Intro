/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y
los números serán introducidos por el usuario. Realice dos versiones del programa,
una usando el bucle “while” y otra con el bucle “do - while”.
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_Ex_07a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        
        System.out.println("Este programa calcula el mayor y menor valor y el promedio de N números.");
        
        do{
            System.out.print("Ingrese N: ");
            n=leer.nextInt();
        }while(n<=0);
        
        calculos(n,leer);
        
    }
    
    public static void calculos(int n,Scanner leer){
        int num,may=0,men=0,i=0;
        float p=0;
        
        while(i<n){
            System.out.print("Ingrese el "+(i+1)+" Nº: ");
            num=leer.nextInt();
            
            if(i==0 || num>may){
                may=num;
            }
            if(i==0 || num<men){
                men=num;
            }
            p+=num;
            
            i++;
        }
        
        System.out.println("El mayor número ingresado fue el "+may);
        System.out.println("El menor número ingresado fue el "+men);
        System.out.println("El promedio de los número ingresados fue "+String.format("%.2f",p/n));
        
    }
    
}
