/*
Leer la altura de N personas y determinar el promedio de estaturas que se
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_Ex_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        
        System.out.println("Este programa calculará unos promedios de estaturas de N personas.");
        
        do{
            System.out.print("Ingrese N: ");
            n = leer.nextInt();
        }while(n<=0);
        
        promedio(n,leer);
        
    }
    
    public static void promedio(int n,Scanner leer){
        float a,p1=0,p2=0;
        int cont=0;
        
        for(int i=0;i<n;i++){
            System.out.print("Ingrese la altura de la "+(i+1)+"º persona en metros: ");
            a= leer.nextFloat();
            
            p1+=a;
            
            if(a<1.60){
                cont++;
                p2+=a;
            }
        }
        
        System.out.println("La estatura promedio en general fue de "+p1/n+" metros.");
        System.out.println("La estatura promedio por debajo de 1,60 fue de "+p2/cont+" metros.");
        
    }
    
}
