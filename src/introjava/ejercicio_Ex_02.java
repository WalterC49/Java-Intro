/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a
cada una. A continuación, realizar las instrucciones necesarias para que: B tome el
valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una
variable auxiliar.
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_Ex_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a,b,c,d;
        
        System.out.println("Este programa crea 4 variables enteras e intercambia sus valores y los muestra en pantalla.");
        System.out.print("Ingrese la variable A: ");
        a = leer.nextInt();
        System.out.print("Ingrese la variable B: ");
        b = leer.nextInt();
        System.out.print("Ingrese la variable C: ");
        c = leer.nextInt();
        System.out.print("Ingrese la variable D: ");
        d = leer.nextInt();
        
        cambio(a,b,c,d);
        
    }
    
    public static void cambio(int a,int b,int c,int d){
        int aux;
        //b=c c=a a=d d=b
        aux=d;
        d=b;//*db
        b=aux;//bd aa cc
        aux=a;
        a=b;//*ad db cc bd
        b=c;
        c=aux;
        
        System.out.println("");
        System.out.println("Ahora el valor de A es D: "+a);
        System.out.println("Ahora el valor de B es C: "+b);
        System.out.println("Ahora el valor de C es A: "+c);
        System.out.println("Ahora el valor de D es B: "+d);
        
    }
    
}
