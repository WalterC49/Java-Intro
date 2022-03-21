/*
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios
y muestre la suma de sus elementos.
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_Ex_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n,m;
        int[][] mat;
        
        System.out.println("Este programa llena una matriz[N][M] con números aleatorios y luego muestra la suma de sus elementos.");
        
        do{
            System.out.print("Ingrese N: ");
            n=s.nextInt();
        
        }while(n<1);
        
        do{
            System.out.print("Ingrese M: ");
            m=s.nextInt();
        
        }while(m<1);
        
        mat= new int[n][m];
        
        llenar(mat);
        mostrar(mat);
        System.out.println("\nLa suma de los elementos de la matriz es "+sumar(mat));
    }
    
    public static void llenar(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                mat[i][j]=(int)(Math.random()*10);
            }
            
        }
    }
    
    public static void mostrar(int[][] mat){
        System.out.println("\nMostrando matriz: ");
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println("");   
        }
    }
    
    public static int sumar(int[][] mat){
        int s=0;
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                s+=mat[i][j];
            }    
        }
        return s;
    }
    
}
