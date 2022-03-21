/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si
el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2
horas.
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_Ex_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int m;
        
        System.out.println("Este programa recibe un tiempo en minutos y luego lo transforma a días y horas y lo muestra en pantalla..");
        System.out.print("Ingrese un tiempo en minutos: ");
        m = leer.nextInt();
        
        DyH(m);
        
    }
    
    public static void DyH(int m){
        //d1440 h60
        int d,h;
        
        d=m/1440;
        h=(m%1440)/60;
        
        switch (d) {
            case 0:
                switch (h) {
                    case 0:
                        System.out.println("");
                        System.out.println(+m+" minutos equivalen a "+d+" días y "+h+" horas.");
                        break;
                    case 1:
                        System.out.println("");
                        System.out.println(+m+" minutos equivalen a "+d+" días y "+h+" hora.");
                        break;
                    default:
                        System.out.println("");
                        System.out.println(+m+" minutos equivalen a "+d+" días y "+h+" horas.");
                        break;
                }   break;
            case 1:
                switch (h) {
                    case 0:
                        System.out.println("");
                        System.out.println(+m+" minutos equivalen a "+d+" día y "+h+" horas.");
                        break;
                    case 1:
                        System.out.println("");
                        System.out.println(+m+" minutos equivalen a "+d+" día y "+h+" hora.");
                        break;
                    default:
                        System.out.println("");
                        System.out.println(+m+" minutos equivalen a "+d+" día y "+h+" horas.");
                        break;
                }   break;
            default:
                System.out.println("");
                System.out.println(+m+" minutos equivalen a "+d+" días y "+h+" horas.");
                break;
        }
        
    }
    
}
