/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc1.tarea3_201700670_;

import java.util.Scanner;

/**
 *
 * @author Andrea Palomo
 */
public class Promedio {
    public void Promedio(String[] args) {
        // TODO code application logic here
        
         int matriz [] [] = new int [6][6];//aquí indica el orden de la matriz que se desea utilizar
        Scanner a= new Scanner (System.in);//ingresa una variable para ingresar los números
        Scanner menu= new Scanner (System.in);//ingresa el dato del menú
        int b=0;//nuestras variables globales
        int ID;
        int n1;
        int n2;
        int n3;
        int n4;
        int h=0;
        do{
        System.out.println("MENÚ DE OPCIONES PARA PROMEDIO ESTUDIANTES");//el menú de opciones del programa
        System.out.println("1. INGRESAR DATOS DEL ESTUDIANTE");
        System.out.println("2. MOSTRAR RESULTADOS DE DATOS ESTUDIANTES");
        System.out.println("3. MENÚ PRINCIPAL");
        System.out.print("¿Qué opción desea elegir (1-3)? ");  
        b=menu.nextInt();//ingresa el dato a escoger del menú
        System.out.println("");
        switch(b){//se utiliza un switch para que al ingresar un número sea el del menú y se desarrolle
            //lo que desea el usuario hacer
            case 1:
                for(int i = 0; i<matriz.length; i++){//se cumple porque va desde 0 a la longitud de la matriz
                        System.out.println("Ingrese su carné ID: ");//ingresa el número de ID
                        ID=a.nextInt();//variable con la sentencia de ingresar datos
                        matriz[i][0]=ID;//va imprimir en ese orden la matriz
                        System.out.println("Ingrese Nota 1: ");
                        n1=a.nextInt();//una variable diferente para cada caso
                        matriz[i][1]=n1;
                        System.out.println("Ingrese Nota 2: ");
                        n2=a.nextInt();
                        matriz[i][2]=n2;
                        System.out.println("Ingrese Nota 3: ");
                        n3=a.nextInt();
                        matriz[i][3]=n3;
                        System.out.println("Ingrese Nota 4: ");
                        n4=a.nextInt();
                        matriz[i][4]=n4;
                        matriz[i][5]=((n1+n2+n3+n4)/4);//se utilizó una variable para cada situación para que
                        //se pudiera hacer la operación, aunque se utilice la misma sentencia de ingresado
                        h++;
                }
                break;
            case 2:
                System.out.println("\tID"+"\tnota1"+"\tnota2"+"\tnota3"+"\tnota4"+"\tPromedio");//apracerán los datos
                for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz.length; j++){
                System.out.print("\t"+matriz[i][j]+" ");//aparecerán los datos ingresados
            }
             System.out.println("");
        }
                break;
            case 3:
                IPC1Tarea3_201700670_ entrad= new IPC1Tarea3_201700670_();//regresará al menú principal
               entrad.main(args);
                break;
            default:
                System.exit(0);// de lo contrario se sale del programa
                break;
        }
      }   while (b<=3);////la condición se cumple siempre y cuando el usuario ingrese de 1-3
    }
}
