/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
cantidad de hijos. Escriba un programa que pida la cantidad de familias y para
cada familia la cantidad de hijos para averiguar la media de edad de los hijos de
todas las familias.
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_Ex_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] f;int n;
        float[] ed;
        
        System.out.println("Este programa calcula la edad promedio de los hijos de N familias.");
        System.out.print("Ingrese la cantidad de familias: ");
        n=leer.nextInt();
        
        f=new int[n];
        ed=new float [n];
        
        llenar(f,ed,leer);
        
    }
    
    public static void llenar(int[] f,float[] ed,Scanner leer){
        int aux,tam;
        
        for(int i=0;i<f.length;i++){
            ed[i]=0;
        }
        
        for(int i=0;i<f.length;i++){
            System.out.print("Ingrese la cant. de hijos de la "+(i+1)+"º familia: ");
            tam=leer.nextInt();
            
            for(int j=0;j<tam;j++){
                System.out.print("Ingrese la edad del "+(j+1)+"º hijo de la familia "+(i+1)+": ");
                aux=leer.nextInt();
                
                ed[i]+=aux;
                
            }
            ed[i]=ed[i]/tam;
        }
        
        System.out.println("");
        for(int i=0;i<f.length;i++){
            System.out.println("La edad promedio de los hijos la familia "+(i+1)+" es: "+String.format("%.1f",ed[i]));
        }
        
    }
    
}
