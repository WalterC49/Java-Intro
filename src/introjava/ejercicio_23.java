/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre
la traspuesta de la matriz.
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] m = new int[4][4];
        
        System.out.println("Este programa carga una matriz 4x4 con Nº de 0 a 9 y luego muestra su transpuesta.");
        llenar(m);
        mostrar(m);
        mostrarT(m);
    }
    
    public static void llenar(int[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                m[i][j]=(int)(Math.random()*10);
            }
        }
        
    }
    
    public static void mostrar(int[][] m){
        System.out.println("");
        System.out.println("Mostrando matriz:");
        
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                System.out.print(+m[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void mostrarT(int[][] m){
        int[][] mt = new int[4][4];
        
        System.out.println("");
        System.out.println("Mostrando matriz transpuesta:");
        
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                mt[j][i]=m[i][j];
            }
        }
        
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                System.out.print(+mt[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
