/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.

2 7 6 
9 5 1
4 3 8

*/
package introjava;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] m = new int[3][3];
        
        System.out.println("Este programa carga una matriz 3x3 por teclado y comprueba si es mágica.");
        
        llenar(m,leer);
        mostrar(m);
    }

    public static void llenar(int[][] m,Scanner leer){
        
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                
                do{
                    System.out.print("Ingrese m["+i+"]["+j+"] con Nº entre 1 y 9:  ");
                    m[i][j]= leer.nextInt();
                }while(m[i][j]>0 && m[i][j]<10);
                
            }
        }
        
    }

    public static void mostrar(int[][] m){
        int tv=m.length;
        tv=(int) (pow(tv,2)+2);
        int[] aux = new int[tv]; 
        
        System.out.println("");
        System.out.println("Mostrando matriz:");
        
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                System.out.print(+m[i][j]+" ");
            }
                System.out.println("");
        }
        
        for(int i=0;i<aux.length;i++){
            aux[i]=0;
        }
        
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                //filas
                aux[i]+=m[i][j];
                //columnas
                aux[j+m.length]+=m[i][j];
            }
            //diagonal principal
            aux[m.length*2]+=m[i][i];
            //diagonal secundaria
            aux[m.length*2+1]+=m[i][m.length-1-i];
        }
        
        int s=0;
        for(int i=0;i<aux.length;i++){
            s+=aux[i];
        }
        
        System.out.println("");
        if(s/tv==aux[0]){
            System.out.println("La matriz es mágica.");
        }else{
            System.out.println("La matriz no es mágica.");
        }
        
    }

}
