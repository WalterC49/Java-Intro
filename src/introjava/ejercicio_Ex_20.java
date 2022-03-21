/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo
por parámetro. Después haremos otra función o procedimiento que imprima el
vector.
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_Ex_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        int[] v;
        
        System.out.println("Este programa llena un vector[N] con números aleatorios.");
        
        do{
            System.out.print("Ingrese N: ");
            n=s.nextInt();
        
        }while(n<1);
        
        
        v = new int[n];
        
        llenar(v);
        mostrar(v);
        
    }
    
    public static void llenar(int[] v){
        for(int i=0;i<v.length;i++){
            v[i]=(int)(Math.random()*10);
        }
    }
    
    public static void mostrar(int[] v){
        System.out.println(" \nMostrando Vector:");
        for(int i=0;i<v.length;i++){
            System.out.print(v[i]+" ");
        }
        System.out.println("");
    }
}
