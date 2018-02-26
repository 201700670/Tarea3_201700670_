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
public class Usuarios {
    public void Usuarios(String[] args) {
        Scanner menu= new Scanner(System.in);//ingresa datos de menú
        int c;int i;
        String d;//nuestra variable es global
        Scanner a= new Scanner (System.in);//ingresa datos de usuarios
        String[]persona= new String [5];//se guardan con el array 5 usuarios
        do{ 
        System.out.println("MENÚ DE OPCIONES DE USUARIOS");//menú de Usuarios y opciones
        System.out.println("1. INGRESAR USUARIOS");
        System.out.println("2. MOSTRAR USUARIOS ASCENDENTES");
        System.out.println("3. MOSTRAR USUARIOS DESCENDIENTES");
        System.out.println("4. MENÚ PRINCIPAL");
        System.out.print("¿Qué opción desea elegir (1-4)? ");  
        c=menu.nextInt();
        System.out.println("");
        switch(c){//se utiliza un switch para que al ingresar un número sea el del menú y se desarrolle
            //lo que desea el usuario hacer
            case 1:
               for ( i=0; i<persona.length;i++){
                System.out.println("Ingrese el nombre de Usuario: ");
                d=a.next();//se ingresa 5 veces el usuario
                persona[i]=d;
                for (int l=0; l<i; l++){//esta bucle va de 0 hasta la variable del for anterior
                    if (persona[i].equals(persona[l])){//se compran la variable global en cada una de las condiciones
                    System.out.println("Ya existe la persona, ingrese de nuevo");
                     d=a.next();
                    persona[i]=d; //si no se cumple la condición se vuelve a ingresar el usuario
                    }
               } 
               }
                break;
            case 2:
                for (int j=0; j<persona.length; j++){//aparecerán los datos guardados de forma ascendente
                    System.out.println(""+persona[j]);//guardados en una variable global
                }
                break;
            case 3:
                for (int k=persona.length-1; k>=0;k--){//guardará los datos de forma descendente
                    System.out.println(""+persona[k]);//guardados en una variable global
                }
                break;
            case 4:
                IPC1Tarea3_201700670_ entrad= new IPC1Tarea3_201700670_();//regresará al menú principal
               entrad.main(args);
                break;
            default:
                System.exit(0);//sale del sistema
                break;
        }
        }while(c<=4);//la condición se cumple siempre y cuando el usuario ingrese de 1-4
    }
    
}
