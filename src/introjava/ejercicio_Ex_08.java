/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de
números pares y la cantidad de números impares. Al igual que en el ejercicio
anterior los números negativos no deben sumarse. Nota: recordar el uso de la
sentencia break.
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_Ex_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n,np=0,ni=0,c=0;
        
        System.out.println("Este programa lee Nº enteros hasta que se ingrese un Nº multiplo de 5.");
        System.out.println("Luego muestra en pantalla unas cant. calculadas.");
        
        do{
            System.out.print("Ingrese un número: ");
            n=leer.nextInt();
            
            c++;
            if(n%2==0){
                    np++;
                }else{
                    ni++;
                }
            
        }while(n%5!=0);
        
        System.out.println("La cantidad total de número que se ingresarón fue de "+c);
        System.out.println("La cantidad de números pares ingresados fue de "+np);
        System.out.println("La cantidad de números impares ingresados fue de "+ni);
        
    }
    
}
