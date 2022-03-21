/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa).
Matriz      Matriz Transpuesta
 0 -2  4     0  2 -4
 2  0  2    -2  0 -2
-4 -2  0     4  2  0

En este caso la matriz es anti simétrica.
*/
package introjava;


import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] m;int n;
        
        System.out.println("Este programa carga una matriz NxN y luego revisa si es antisimetrica.");
        
        do{
            System.out.print("Ingrese N: ");
            n = leer.nextInt();
        }while(n<0);
        
        m = new int[n][n];
        llenar(m,leer);
        mostrar(m);
        mostrarT(m);
        
    }
    
    public static void llenar(int[][] m,Scanner leer){
        
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                System.out.print("Ingrese m["+i+"]["+j+"]: ");
                m[i][j]= leer.nextInt();
                //m[i][j]=(int)(Math.random()*10);
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
        
        int cont=0;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(mt[i][j]+m[i][j]==0){
                    cont++;
                }
                
            }
        }
        
        System.out.println("");
        if(cont==pow(m.length,2)){
            System.out.println("La matriz ingresada es antisimetrica.");
        }else{
            System.out.println("La matriz ingresada no es antisimetrica.");
        }
        
    }
    
}
