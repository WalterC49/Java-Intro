/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_Ex_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] m = new int[1000][3];
        String[][] c = new String[1000][3];
        
        System.out.println("Este programa muestra un contador (X-X-X) desde (0-0-0) a (9-9-9) reemplazando el 3 con E.");
        
        llenar(m);
        cambiar(m,c);
        mostrar(c);
        
    }
    
    public static void llenar(int[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                m[i][j]=0;
            }
        }
        
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(i<10){
                    m[i][2]=i;
                    m[i][1]=i/10;
                }else if(i<100){
                    m[i][2]=i%10;
                    m[i][1]=i/10;
                }else{
                    m[i][2]=i%10;
                    m[i][1]=(i/10)%10;
                    m[i][0]=i/100;
                }
            }
        }
    }
    
    public static void cambiar(int[][] m,String[][] c){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                c[i][j] = String.valueOf(m[i][j]);
                if(c[i][j].equals("3")){
                    c[i][j]="E";
                }
            }
        }
    }
    
    public static void mostrar(String[][] c){
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[0].length;j++){
                if(j==0){
                    System.out.print("("+c[i][j]+"-");
                }else{
                    if(j==2){
                        System.out.print(c[i][j]+")");
                    }else{
                        System.out.print(c[i][j]+"-");
                    }
                }
                
            }
            System.out.println("");
        }
    }
}
