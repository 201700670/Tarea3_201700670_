/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc1.tarea3_201700670_;

import java.util.Scanner;//es una librería para ingresar los datos

/**
 *
 * @author Andrea Palomo
 */
public class Contadigi {
    public void Contadigi(String[] args) {
        // TODO code application logic here
      
        Scanner entrada= new Scanner (System.in);//se crea una vatiable para ingresar los datos
        Scanner menu= new Scanner (System.in);//una variable para ingresar el dato del menú
        int b=0;
        int i;
        int a = 0; do{//Do while para crear un bucle del programa
        System.out.println("MENÚ DE OPCIONES PARA EL CONTADOR DE DÍGITOS");//mí menú de opciones aparecerá en pantalla
        System.out.println("1. INGRESAR NÚMEROS");
        System.out.println("2. MOSTRAR NÚMEROS DE DÍGITOS");
        System.out.println("3. MENÚ PRINCIPAL");
        System.out.print("¿Qué opción desea elegir (1-3)? ");//es la opción que se va a elegir  
        b=menu.nextInt();//se crea una variable globla para que ingrse el dato
        System.out.println("");
        switch(b){//se utiliza un switch para que al ingresar un número sea el del menú y se desarrolle
            //lo que desea el usuario hacer
            case 1:
                System.out.println("Ingrese un número: ");  
                a=entrada.nextInt();//es una variable globlal para que al momento de hacer otras opciones ejecute
                break;
            case 2:
                i=0;
                if (a==0){//se va a hacer la condición para que aparezca la cantida de´dígitos cuando es 0
                System.out.println("La cantidad de dígitos del número es: 1");
                }
                while (a>=1){//se va a hacer la condición para que aparezca la cantida de´dígitos cuando mayor que 1
                a=a/10;
                i=i+1;
                }
                System.out.println("La cantidad de dígitos del número es: "+i);//aparecerá el resultado
                break;
            case 3:
               IPC1Tarea3_201700670_ entrad= new IPC1Tarea3_201700670_();//regresa al menú principal de opciones
               entrad.main(args);
                break;
            default:
                System.exit(0);//la condición se cumple siempre y cuando el usuario ingrese de 1-3
                break;
        }
      }   while (b<=3);
    }
}
