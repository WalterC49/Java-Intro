/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a
medida que el usuario las va ingresando, construya una “sopa de letras para niños”
de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden
horizontal en una fila que será seleccionada de manera aleatoria. Una vez
concluida la ubicación de las palabras, rellene los espacios no utilizados con un
número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras
creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes
funciones de Java substring(), Length() y Math.random().
*/
package introjava;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Walter
 */
public class ejercicio_Ex_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[][] sop= new String[20][20];
        
        System.out.println("Este programa recibe 5 palabras y las colocas dentro de una sopa de letras 20x20.");
        
        llenar(sop,s);
        mostrar(sop);
    }
    
    public static void llenar(String[][] sop,Scanner s){
        String[] pal = new String[5];
        int[] filas = new int[5];
        int aux,b=0,tp,pi=0;
        boolean rep=false;
        
        for(int i=0;i<5;i++){
            do{
            System.out.print("Ingrese la "+(i+1)+"º palabra de 3 a 5 carácteres: ");
            pal[i]=s.next();
            pal[i]=toUpperCase(pal[i]);
            }while(pal[i].length()<3 || pal[i].length()>5);
        }
        //genero 5 números aleatorios sin repetir
        do{
            for(int i=0;i<5;i++){
                filas[i]=(int)(Math.random()*20);
            }
            
            for(int i=0;i<5;i++){
                aux=filas[i];
                b=0;
                for(int j=0;j<5;j++){
                    //b=0;
                    if(aux==filas[j]){
                        b++;
                        if(b>1){
                            rep=true;
                        }
                    }
                }
                if(rep){
                    break;
                }
            }    
        }while(b>1);
        
        //llena la matriz con Nº de 0 a 9
        for(int i=0;i<sop.length;i++){
            for(int j=0;j<sop[0].length;j++){
                sop[i][j]=String.valueOf((int)(Math.random()*10));
            }
        }
        //coloco las palabras ingresadas en la matriz
        for(int k=0;k<5;k++){
            tp=pal[k].length();
            do{
                for(int i=0;i<sop.length;i++){
                    if(i==filas[k]){
                        for(int j=0;j<tp;j++){
                            sop[filas[k]][j]=pal[k].substring(j,j+1);
                        }
                    }    
                }
                pi++;
            }while(pi<5);
        }
    }
    
    public static void mostrar(String[][] sop){
        System.out.println("\nMostrando la sopa de letras:");
        for(int i=0;i<sop.length;i++){
            for(int j=0;j<sop[0].length;j++){
                System.out.print(sop[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
