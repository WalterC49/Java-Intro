/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] v;int n;
        
        System.out.println("Este programa llena un Vector de tamaño N y muestra cuantos Nº son de un 1 digito, cuántos de 2 digitos, etc.");
        System.out.print("Ingrese N: ");
        n = leer.nextInt();
        v = new int[n];
        
        llenar(v);
        mostrar_D(v);
    }
    
    public static void llenar(int[] v){
        for(int i=0;i<v.length;i++){
            v[i]=(int)(Math.random()*100000);
        }
    }
    
    public static void mostrar_D(int[] v){
        int d1=0,d2=0,d3=0,d4=0,d5=0;
        
        for(int i=0;i<v.length;i++){
            if(v[i]<10){
                d1++;
            }else if(v[i]>9 && v[i]<100){
                d2++;
            }else if(v[i]>99 && v[i]<1000){
                d3++;
            }else if(v[i]>999 && v[i]<10000){
                d4++;
            }else if(v[i]>9999 && v[i]<100000){
                d5++;
            }
            
        }
        
        for(int i=0;i<v.length;i++){
            System.out.println(v[i]);
        }
        
        System.out.println("Se encontrarón "+d1+" Nº de un 1 digito.");
        System.out.println("Se encontrarón "+d2+" Nº de un 2 digitos.");
        System.out.println("Se encontrarón "+d3+" Nº de un 3 digitos.");
        System.out.println("Se encontrarón "+d4+" Nº de un 4 digitos.");
        System.out.println("Se encontrarón "+d5+" Nº de un 5 digitos.");
        
    }
}
