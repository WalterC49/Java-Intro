/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] v;int n,b;
        
        System.out.println("Este programa llena un Vector de tamaño N con Nº aleatorios");
        System.out.println("Luego pedirá al usuario un Nº a buscar dentro del vector y mostrara en pantalla en donde está y si está repetido.");
        System.out.print("Ingrese el tamaño del vector: ");
        n = leer.nextInt();
        v = new int[n];
        
        llenar(v);
        
        System.out.print("Ingrese un Nº entre 0 y 9 para buscar dentro del vector: ");
        b = leer.nextInt();
        
        buscar(v,b);
        
    }
    
    public static void llenar(int[] f){
        
        for(int i=0;i<f.length;i++){
            f[i]=(int)(Math.random()*10);
        }
        
    }
    
    public static void buscar(int[] v,int b){
        boolean encontrado=false;
        
        for(int i=0;i<v.length;i++){
            if(v[i]==b){
                encontrado=true;
            }
            
        }
        
        if(encontrado){
            for(int i=0;i<v.length;i++){
                if(v[i]==b){
                    System.out.println(+b+" se encontró en v["+i+"]");
                }
            }
        }else{
            System.out.println("No se encontro el Nº "+b);
        }
        
    }
}
