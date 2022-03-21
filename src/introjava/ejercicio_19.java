/*
Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n,op;String camb;
        
        System.out.println("Este programa recibe una una cant. de euros y muestra el cambio que se elija.");
        System.out.print("Ingrese una cant. de euros: ");
        n = leer.nextInt();
        
        do{
            System.out.println("¿A qué desea cambiar?");
            System.out.println("1. Libras");
            System.out.println("2. Dolar");
            System.out.println("3. Yenes");
            System.out.println("4. Salir del programa");
            System.out.print("Elija una opción: ");
            op = leer.nextInt();
            
            switch(op){
                case 1:
                    camb="libra";
                    cambio(n,camb);
                    break;
                case 2:
                    camb="dolar";
                    cambio(n,camb);
                    break;
                case 3:
                    camb="yen";
                    cambio(n,camb);
                    break;
                case 4:
                    System.out.println("Hasta luegos.");
                    break;
                default:
                    System.out.println("Opción no valida.");
                    break;
            }
            
            if(op==1 ||op==2 ||op==3){
                //cambio(n,camb);
                break;
            }
            
        }while(op!=4);
        
    }
    
    public static void cambio(int n,String camb){
        switch(camb){
            case "libra":
                System.out.println(+n+" euros a libras son: "+(n*0.86));
                break;
            case "dolar":
                System.out.println(+n+" euros a dolaress son: "+(n*1.28611));
                break;
            case "yen":
                System.out.println(+n+" euros a yenes son: "+(n*129.852));
                break;
        }
    }
    
}
