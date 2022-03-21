/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
columnas, existe al menos una que coincida con la matriz P. En ese caso, el
programa debe indicar la fila y la columna de la matriz M en la cual empieza el
primer elemento de la submatriz P.
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] m = new int[10][10];
        int[][] p = new int[3][3];
        
        System.out.println("Este programa llena una matriz M de 10x10 y una P de 3x3 y luego comprueba si P existe dentro de M.");
        
        llenar(m,p,leer);
        mostrar(m,p);
        
    }
    
    public static void llenar(int[][] m,int[][] p,Scanner leer){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                /*
                do{
                    System.out.print("Ingrese m["+i+"]["+j+"] con Nº entre 1 y 99:  ");
                    //m[i][j]= leer.nextInt();
                    m[i][j]=(int)(Math.random()*(99-1)+1+1);
                }while(m[i][j]<1 || m[i][j]>99);
                */
                m[i][j]=(int)(Math.random()*(99-1)+1+1);
            }
        }
        
        System.out.println("");
        System.out.println("Mostrando matriz M:");
        
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                System.out.print(+m[i][j]+" ");
            }
            System.out.println("");
        }
        
        for(int i=0;i<p.length;i++){
            for(int j=0;j<p[0].length;j++){
                
                do{
                    System.out.print("Ingrese p["+i+"]["+j+"] con Nº entre 1 y 99:  ");
                    p[i][j]= leer.nextInt();
                }while(p[i][j]<1 || p[i][j]>99);
                
            }
        }
        
    }
    
    public static void mostrar(int[][] m,int[][] p){
        System.out.println("");
        System.out.println("Mostrando matriz M:");
        
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                System.out.print(+m[i][j]+" ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Mostrando matriz P:");
        
        for(int i=0;i<p.length;i++){
            for(int j=0;j<p[0].length;j++){
                System.out.print(+p[i][j]+" ");
            }
            System.out.println("");
        }
        
        //i=0 a 7   i1 a 8 i2 a 9  i<7
        int f=0,c=0,aci;
        boolean listo=false;
        
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                aci=0;
                for(int k=0;k<3;k++){
                    for(int l=0;l<3;l++){
                        if(m[i+k][j+l]==p[k][l]){
                            aci++;
                            if(aci==9){
                                listo=true;
                                f=i;
                                c=j;
                            }
                        }
                    }
                }
                
            }
        }
        /*
        int f=0,c=0;
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if(m[i][j]==p[0][0]){
                    if(m[i][j+1]==p[0][1]){
                        if(m[i][j+2]==p[0][2]){
                            if(m[i+1][j]==p[1][0]){
                                if(m[i+1][j+1]==p[1][1]){
                                    if(m[i+1][j+2]==p[1][2]){
                                        if(m[i+2][j]==p[2][0]){
                                            if(m[i+2][j+1]==p[2][1]){
                                                if(m[i+2][j+2]==p[2][2]){
                                                    f=i;
                                                    c=j;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }   
                }
            }
        }
        */
        if(listo){
            System.out.println("Se encontró P dentro de M en los índices:");
            System.out.println("");
            System.out.println(+f+","+c+"-"+f+","+(c+1)+"´-"+f+","+(c+2));
            System.out.println(+(f+1)+","+c+"-"+(f+1)+","+(c+1)+"-"+(f+1)+","+(c+2));
            System.out.println(+(f+2)+","+c+"-"+(f+2)+","+(c+1)+"-"+(f+2)+","+(c+2));
        }else{
            System.out.println("No se encontró P en M.");
        }
        
    }
    
    
}
