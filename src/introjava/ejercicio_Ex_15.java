/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada
operación matemática y deben devolver sus resultados para imprimirlos en el main.
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_Ex_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double[] rd=new double[2];
        int n1,n2,op;
        
        System.out.println("Este programa pide 2 Nº y luego muestra un menú para elegir que operación realizar.");
        System.out.print("Ingrese el primer número: ");
        n1=leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        n2=leer.nextInt();
        
        do{
            System.out.println("");        
            System.out.println("Menú");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            op=leer.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("El resultado de la suma es "+sum(n1,n2));
                    break;
                case 2:
                    System.out.println("El resultado de la resta es "+rest(n1,n2,leer));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicación es "+mult(n1,n2));
                    break;
                case 4:
                    rd=div(n1,n2,leer);
                    
                    if(rd[1]==1){
                        System.out.println("El resultado de la división es "+String.format("%.2f",rd[0]));
                    }else{
                        System.out.println("La división por cero no está definida.");
                    }
                    break;
                case 5:
                    System.out.println("Hata luego.");
                    break;
                default:
                    System.out.println("Opción no valida.");
                    break;
            }
            
        }while(op!=5);
        
    }
    
    public static int sum(int n1,int n2){
        return n1+n2;
    }
    
    public static int rest(int n1,int n2,Scanner leer){
        int op;
        do{
            System.out.println("Elija el ordén de la resta: ");
            System.out.println("1- "+n1+"-"+n2);
            System.out.println("2- "+n2+"-"+n1);
            System.out.println("Opción: ");
            op=leer.nextInt();
            
            if(op!=1 && op!=2){
                System.out.println("Opción no valida intenta de vuelta.");
            }
            
        }while(op!=1 && op!=2);
        
        if(op==1){
            return n1-n2;
        }else{
            return n2-n1;
        }
        
    }
    
    public static int mult(int n1,int n2){
        return n1*n2;
    }
    
    public static double[] div(int n1,int n2,Scanner leer){
        int op;double[] r=new double[2];
        
        do{
            System.out.println("Elija el ordén de la divición: ");
            System.out.println("1- "+n1+"/"+n2);
            System.out.println("2- "+n2+"/"+n1);
            System.out.print("Opción: ");
            op=leer.nextInt();
            
            if(op!=1 && op!=2){
                System.out.println("Opción no valida intenta de vuelta.");
            }
            
        }while(op!=1 && op!=2);
        
        if(op==1){
            if(n2!=0){
                r[0]=(double)n1/n2;
                r[1]=1;
                return r;
            }else{
                r[1]=0;
                return r;
            }
        }else{
            if(n1!=0){
                r[0]=(double)n2/n1;
                r[1]=1;
                return r;
            }else{
                r[1]=0;
                return r;
            }
        }
        
    }
}
