/*
Los profesores del curso de programación de Egg necesitan llevar un registro de
las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
aprobados y desaprobados. Durante el periodo de cursado cada alumno obtiene 4
notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de
cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%

Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final
del programa los profesores necesitan obtener por pantalla la cantidad de
aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos
con promedio mayor o igual al 7 de sus notas del curso.
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class ejercicio_Ex_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[] alum = new double[10]; 
        
        System.out.println("Este programa calcula la nota final de 10 alumnos, luego muestra cuantos aprobarón y desaprobarón.");
        
        llenar(alum,s);
        mostrar(alum);
    }
    
    public static void llenar(double[] alum,Scanner s){
        double[] not = new double[4];
        
        for(int i=0;i<alum.length;i++){
            System.out.println("Alumno "+(i+1)+":");
            for(int j=0;j<not.length;j++){
                switch(j){
                    case 0:
                        do{
                            System.out.print("Ingrese la nota del 1º trabajo evaluativo: ");
                            not[0]=s.nextDouble();
                        }while(not[0]<-1||not[0]>11);
                        break;
                    case 1:
                        do{
                            System.out.print("Ingrese la nota del 2º trabajo evaluativo: ");
                            not[1]=s.nextDouble();
                        }while(not[1]<-1||not[1]>11);
                        break;
                    case 2:
                        do{
                            System.out.print("Ingrese la nota del 1º integrador: ");
                            not[2]=s.nextDouble();
                        }while(not[2]<-1||not[2]>11);
                        break;
                    case 3:
                        do{
                            System.out.print("Ingrese la nota del 2º integrador: ");
                            not[3]=s.nextDouble();
                        }while(not[3]<-1||not[3]>11);
                        break;
                }
            }
            alum[i]=(not[0]*0.1)+(not[1]*0.15)+(not[2]*0.25)+(not[3]*0.5);
            //p[i]=alum[i][0]*(6.5);
            //System.out.print(p[i]+"-");
        }
    }
    
    public static void mostrar(double[] alum){
        double s=0;
        int[] c ={0,0};
        
        for(int i=0;i<alum.length;i++){
            s+=alum[i];
            if(alum[i]>=7){
                c[0]++;
            }else{
                c[1]++;
            }
        }
        System.out.println("Aprobarón "+c[0]+" alumnos y desaprobarón "+c[1]+" alumnos.");
        System.out.println("El promedio de las notas de los alumnos fue "+String.format("%.2f",s/10.0));
    }
    
}
