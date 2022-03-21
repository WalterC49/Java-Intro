/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_Ex_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        int n;int[] v1,v2;
        
        System.out.println("Este programa compara 2 vectores de N tamaño.");
        System.out.print("Ingrese N: ");
        n=s.nextInt();
        
        v1= new int[n];
        v2= new int[n];
        
        llenar(v1,v2,s);
        comparar(v1,v2);
    }
    
    public static void llenar(int[] v1,int[] v2,Scanner s){
        System.out.println("");
        for(int i=0;i<v1.length;i++){
            System.out.print("Ingrese vector 1["+i+"]: ");
            v1[i]=s.nextInt();
        }
        
        System.out.println("");
        for(int i=0;i<v2.length;i++){
            System.out.print("Ingrese vector 2["+i+"]: ");
            v2[i]=s.nextInt();
        }
        
    }
    
    public static void comparar(int[] v1,int[] v2){
        System.out.println("");
        System.out.println("Comparando vectores, el programa terminara si los vectores no son iguales.");
        for(int i=0;i<v1.length;i++){
            if(v1[i]==v2[i]){
                System.out.println("Vector 1["+i+"] y Vector 2["+i+"] son iguales.");
            }else{
                System.out.println("Vector 1["+i+"] y Vector 2["+i+"] no son iguales.");
                System.out.println("Comparación terminada.");
                break;
            }
        }
    }
    
}
