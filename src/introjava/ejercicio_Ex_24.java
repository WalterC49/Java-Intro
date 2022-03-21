/*
Realizar un programa que complete un vector con los N primeros números de la
sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de
los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por
ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente...
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que
reciba como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_Ex_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;int[] v;
        
        System.out.println("Este programa llena un vector con los primeros N números de la sucesión de Fibonacci.");
        System.out.print("Ingrese N: ");
        n=s.nextInt();
        
        v= new int[n];
        llenar(n,v);
        mostrar(v);
    }
    
    public static void llenar(int n,int[] v){
        int f1=1,f2=0;
        for(int i=0;i<v.length;i++){
            if(i==0){
                v[i]=1;
            }else{
                v[i]=f1+f2;
                f2=f1;
                f1=v[i];
            }
        }
    }
    
    public static void mostrar(int[] v){
        System.out.println("\nMostrando vector:");
        for(int i=0;i<v.length;i++){
            System.out.print(v[i]+" ");
        }
        System.out.println("");
    }
    
}
