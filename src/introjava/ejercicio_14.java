/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num; int s = 0;
        
        System.out.println("Este programa suma 20 Nº positivos, se puede cortar la suma con el Nº cero.");
        
        for(int i=0;i<20; i++){
            System.out.print("Ingrese un Nº: ");
            num = leer.nextInt();
            
            if(num<0){
                continue;
            }
            s=s+num;
            if(num==0){
                System.out.println("Se capturó el número cero.");
                break;
            }
        }
        
        System.out.println("La suma total fue " +s);
        
    }
    
}
