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
public class Mayorme {
    public void Mayorme(String[] args) {
        // TODO code application logic here
        Scanner men= new Scanner (System.in);//ingresa los datos de menú
        Scanner a1= new Scanner (System.in);//datos de numero 1
        Scanner c1= new Scanner (System.in);//datos de numero2
        Scanner m1= new Scanner (System.in);//datos de número 3
        int a=0;//variables globale a utilizar
        int c=0;
        int b=0;
        int m=0;
        int r=0;
        do{
        System.out.println("MENÚ DE OPCIONES PARA TRES NÚMEROS DE MAYOR A MENOR");//menú de opciones del programa
        System.out.println("1. INGRESAR NÚMEROS");
        System.out.println("2. MOSTRAR ORDENADOS");
        System.out.println("3. MENÚ PRINCIPAL");
        System.out.print("¿Qué opción desea elegir (1-3)? ");  
        b=men.nextInt();//ingresa los datos de las opciones del menú que se muestra en pantalla antes de elegir esta opcion
        System.out.println("");
        switch(b){//se utiliza un switch para que al ingresar un número sea el del menú y se desarrolle
            //lo que desea el usuario hacer
            case 1:
                System.out.println("Ingrese primer número; ");
                a=a1.nextInt();//se ingresan los datos a utilizar
                System.out.println("Ingrese segundo número; ");
                c=c1.nextInt();
                System.out.println("Ingrese tercer número; ");
                m=m1.nextInt();
                break;
            case 2:
            {// se realiza cada una de las condicines para que aparezcan en orden los números ya sea que 
                //la persona desee ingresarlas desordenadamente y los imprimirá en el orden correspondiente
                //en este mostrará el primer número el menor
                if (a<c&&a<m){
                  System.out.println("primer numero "+a);
                }
                if (c<m&&c<a){
                    System.out.println("primer numero "+c);
                }
                if(m<a&&m<c){
                    System.out.println("primer numero "+m);
                }
            }
            {//mostrará el segundo número que sigue del primero
                if (a>c&&a<m){
                  System.out.println("segundo número "+a);
                }
                if (c<m&&c>a){
                    System.out.println("segundo número "+c);
                }
                if(m>a&&m<c){
                    System.out.println("segundo número "+m);
                }
            }
            {
                if (a>m&&a<c){
                    System.out.println("segundo número "+a);
                }
            }
            {//tercer número y el mayor
                if (a>c&&a>m){
                  System.out.println("tercer número "+a);
                }
                if (c>m&&c>a){
                    System.out.println("tercer número "+c);
                }
                if(m>a&&m>c){
                    System.out.println("tercer número "+m);
                }
            }
                break;
            case 3:
                IPC1Tarea3_201700670_ entrad= new IPC1Tarea3_201700670_();//regresa al menú
               entrad.main(args);
                break;
            default:
                System.exit(0);//de lo contrario sale del programa
                break;
      }   
        }while (b<=3);//la condición se cumple siempre y cuando el usuario ingrese de 1-3
        }
}
