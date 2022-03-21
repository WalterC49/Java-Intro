/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial. 
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int lim;int s = 0;int num;
        
        System.out.println("Este programa solicita un valor limite y luego recibe Nº hasta que la suma supere el valor inicial.");
        
        do{
            System.out.print("Ingrese un valor limite positivo: ");
            lim = leer.nextInt();
        
            if(lim>=1){
                break;
            }
            
        }while(lim<0);
        
        do{
            System.out.print("Ingrese un valor: ");
            num = leer.nextInt();
            
            s=s+num;
            
            System.out.println("La suma actual es: "+s);
            
            if(s-1>lim){
                break;
            }
            
        }while(s<=lim);
        
    }
    
}
