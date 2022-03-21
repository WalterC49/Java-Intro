/*
Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
*/
package introjava;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/**
 *
 * @author Walter
 */
public class ejercicio_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1,num2,op;
        
        System.out.println("Este programa recibe dos Nº y luego muestra un Menú de opciones a realizar.");
        
        do{
            System.out.print("Ingrese un entero positivo: ");
            num1 = leer.nextInt();
            
            if(num1>0){
                break;
            }
            
        }while(num1<0);
        
        do{
            System.out.print("Ingrese otro entero positivo: ");
            num2 = leer.nextInt();
            
            if(num2>0){
                break;
            }
            
        }while(num2<0);
        
        /*
        System.out.print("\033[H\033{2j");
        System.out.flush();
        */
        do{
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elija opción: ");
            op = leer.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("La suma de los Nº es: " +(num1+num2));
                break;
                case 2:
                    System.out.println("La resta de los Nº es: " +(num1-num2));
                break;
                case 3:
                    System.out.println("La multiplicación de los Nº es: " +(num1*num2));
                break;
                case 4:
                    System.out.println("La divición de los Nº es: " +(num1/num2));
                break;
                case 5:
                    System.out.println("¿Está seguro que desea salir?(S/N)");
                    String conf = leer.next();
                    conf=toLowerCase(conf);
                    if(conf.equals("s")){
                        break;
                    }
                    
                break;
                default:
                    System.out.println("Ingresó una opción no valida");
                break;
            }
            
        }while(op!=5);
        
    }
    
}
