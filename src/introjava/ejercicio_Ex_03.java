/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la
clase String.
*/
package introjava;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/**
 *
 * @author Walter
 */
public class ejercicio_Ex_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String v;
        
        System.out.println("Este programa detecta si una letra ingresada es una vocal o no.");
        
        do{
            System.out.print("Ingrese una letra: ");
            v = leer.next();
        }while(v.length()!=1);
        
        revisar(v);
        
    }
    
    public static void revisar(String v){
        v=toLowerCase(v);
        
        if(v.equals("a")||v.equals("e")||v.equals("i")||v.equals("o")||v.equals("u")){
            System.out.println("Se ingresó una vocal.");
        }else{
            System.out.println("No se ingresó una vocal");
        }
        
    }
    
}
