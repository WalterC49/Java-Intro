/*
Realice un programa para que el usuario adivine el resultado de una multiplicación
entre dos números generados aleatoriamente entre 0 y 10. El programa debe
indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea
incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para
realizar este ejercicio investigue como utilizar la función Math.random() de Java.
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_Ex_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int r,n;
        
        System.out.println("Este programa genera 2 Nº entre 0 y 10 y los multiplica intenta adivinar el resultado");
        
        r=resultado();
        
        System.out.println(r);
        do{
            System.out.print("Ingresa una respuesta: ");
            n=leer.nextInt();
            
            if(n==r){
                System.out.println("Respuesta correcta, bien hecho.");
            }else{
                System.out.println("Respuesta incorrecta, intenta de vuelta.");
            }
            
        }while(r!=n);
        
    }
    
    public static int resultado(){
        int n1,n2; 
        
        n1=(int) (Math.random() * 11);
        n2=(int) (Math.random() * 11);
        
        return n1*n2;
    } 
    
}
