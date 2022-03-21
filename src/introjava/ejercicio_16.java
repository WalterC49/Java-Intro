/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cc=0,ci=0,l; String cad;String FDE = "&&&&&";
        
        do{
            System.out.println("Ingrese una cadena que comience con X y termine con O de 5 carácteres.");
            cad = leer.nextLine();
            l=cad.length();
            if("X".equals(cad.substring(0,1)) && "O".equals(cad.substring(4)) && l==5){
                cc++;
            }else{
                ci++;
            }
            /*
            if(cad.equals(FDE)){
                break;
            }
            */
        }while(!cad.equals(FDE));
        
        System.out.println("Cantidad de lecturas correctas: " +cc);
        System.out.println("Cantidad de lecturas incorrectas: " +(ci-1));
        
    }
    
}
