/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los
datos de las personas ingresadas por teclado e indique si son mayores o menores
de edad. Después de cada persona, el programa debe preguntarle al usuario si
quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra
“No”.
*/
package introjava;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/**
 *
 * @author Walter
 */
public class ejercicio_Ex_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] ed;String[] nom;
        int n;
        
        System.out.println("Este programa pide el nombre y la edad de N personas, luego los imprime y dice si son mayor de edad o no.");
        System.out.print("Ingrese N: ");
        n=leer.nextInt();
        
        ed=new int[n];
        nom=new String[n];
        
        llenar(ed,nom,leer);
        mostrar(ed,nom,leer);
        
    }
    
    public static void llenar(int[] ed,String[] nom,Scanner leer){
        for(int i=0;i<ed.length;i++){
            System.out.print("Ingrese el nombre de la "+(i+1)+"º persona: ");
            nom[i]=leer.next();
            System.out.print("Ingrese su edad: ");
            ed[i]=leer.nextInt();
        }
    }
    
    public static void mostrar(int[] ed,String[] nom,Scanner leer){
        String op;boolean termi = false;
        
        System.out.println("");
        System.out.println("Imprimiendo datos ingresados:");
        for(int i=0;i<ed.length;i++){
            System.out.println("Nombre: "+nom[i]+". Edad: "+ed[i]);
            if(ed[i]>=18){
                System.out.println("Es mayor de edad.");
            }else{
                System.out.println("Es menor de edad.");
            }
            
            if(i+1<ed.length){
                do{
                    System.out.println("¿Desea continuar imprimiendo datos?(SI/NO)");
                    op=leer.next();
                    op=toLowerCase(op);
            
                    switch (op) {
                        case "no":
                            System.out.println("Hasta luego.");
                            termi=true;
                            break;
                        case "si":
                            break;
                        default:
                            System.out.println("Opción no valida.");
                            break;
                    }
                    
                }while(!"si".equals(op)&&!"no".equals(op));
                
            }
            
            if(termi){
                break;
            }
        }
    }
    
}
