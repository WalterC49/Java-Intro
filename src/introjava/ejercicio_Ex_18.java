/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de
tamaño N, con los valores ingresados por el usuario.
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_Ex_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        float[] n;int t;
        
        System.out.println("Este programa muestra la suma de los números ingresados en un vector de tamaño N.");
        System.out.print("Ingrese el tamaño del vector: ");
        t=s.nextInt();
        
        n = new float[t];
        
        System.out.println("La suma de los elementos del vector es "+sumar(n,s));
        
    }
    
    public static float sumar(float[] n,Scanner s){
        float sum=0;
        
        for(int i=0;i<n.length;i++){
            sum+=n[i];
        }
        
        return sum;
    }
    
}
