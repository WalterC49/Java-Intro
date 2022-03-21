/*
Crear un programa que dibuje una escalera de números, donde cada línea de
números comience en uno y termine en el número de la línea. Solicitar la altura de
la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_Ex_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        
        System.out.println("Este programa dibuja una escalera de tamaño N donde cada linea tiene el tamaño del Nº de la linea.");
        
        do{
            System.out.print("Ingrese el tamaño de la escalera: ");
            n=leer.nextInt();
        }while(n<0);
        
        mostrar(n);
    }
    
    public static void mostrar(int n){
        int L=0;
        
        do{
            for(int i=0;i<L;i++){
                System.out.print(i+1);
            }
            
            System.out.println("");
            
            L++;
        }while(L<=n);
        
    }
    
}
