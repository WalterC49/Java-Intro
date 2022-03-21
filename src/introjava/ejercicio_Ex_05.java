/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real
que represente el costo del tratamiento (previo al descuento) y determine el importe
en efectivo a pagar por dicho socio.
*/
package introjava;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/**
 *
 * @author Walter
 */
public class ejercicio_Ex_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String op;
        
        
        do{
            System.out.print("Ingrese el tipo de socio(A/B/C): ");
            op = leer.next();
            
            toLowerCase(op);
            if(op.equals("a")||op.equals("b")||op.equals("c")){
                descuento(op,leer);
            }else{
                System.out.println("Ese tipo de socio no existe");
            }
            
        }while(!"a".equals(op) && !"b".equals(op) && !"c".equals(op));
        
    }
    
    public static void descuento(String op,Scanner leer){
        int n;
        
        System.out.print("Ingrese el importe a cobrar: ");
        n= leer.nextInt();
        
        switch(op){
            case "a":
                System.out.println("Como el socio es tipo A este tiene un descuento del 50%.");
                System.out.println("Total a pagar $ "+n/2);
                break;
            case "b":
                System.out.println("Como el socio es tipo B este tiene un descuento del 35%.");
                System.out.println("Total a pagar $ "+(n-n*0.35));
                break;
            case "c":
                System.out.println("Como el socio es tipo C no se le otorga descuento de ningún tipo..");
                System.out.println("Total a pagar $ "+n);
                break;
            }
    }
    
}
