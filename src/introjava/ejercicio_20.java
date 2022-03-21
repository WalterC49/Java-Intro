/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] v = new int[100];
        
        v=llenar();
        
        for(int i=99;i>=0;i--){
            System.out.println(v[i]);
        }
        
    }
    
    public static int[] llenar(){
        int[] v = new int[100];
        
        for(int i=0;i<v.length;i++){
            v[i]=i+1;
        }
        
        return v;
    }
}
