/*
Simular la división usando solamente restas. Dados dos números enteros mayores
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor
que el divisor, este resultado es el residuo, y el número de restas realizadas es el
cociente. Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_Ex_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n,d;
        
        System.out.println("Este programa divide 2 Nº enteros mayores que 1 con resta consecutivas.");
        System.out.print("Ingrese el primer Nº: ");
        n= leer.nextInt();
        System.out.print("Ingrese el segundo Nº: ");
        d= leer.nextInt();
        
        restaC(n,d);
        
    }
    
    public static void restaC(int n,int d){
        int c=0,aux=n;
        
        do{
            if(n>d){
                n-=d;
                c++;
            }
        }while(n>d);
        
        System.out.println("El resto y el cociente de la división "+aux+"/"+d+" son "+n+" y "+c+" respectivamente.");
        
    }
    
}
