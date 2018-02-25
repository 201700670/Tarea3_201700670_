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
public class IPC1Tarea3_201700670_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner (System.in); //se llama una variable para ser ingresado por el ususario
        int res; //variable entera para ingrsar en el menú
        System.out.println("[IPC1]Tarea3_201700670"); // Este es un menú de opciones que se mostrará al usuario
        System.out.println();
        System.out.println("MENÚ DE OPCIONES");
        System.out.println("1.USUARIOS");
        System.out.println("2. CONTADOR DE DÍGITOS");
        System.out.println("3. TRES NÚMEROS DE MAYOR A MENOR");
        System.out.println("4. CALCULAR PROMEDIO");
        System.out.println("5. SALIR");
        System.out.print("¿Qué opción desea elegir (1-5)? ");
        res=entrada.nextInt(); //se ingresa el número de la opción del menú
        System.out.println("");
        switch(res){
            case 1://es cada opción a realizar y su debido procedimiento de realización
                Usuarios llama= new Usuarios();
                llama.Usuarios(args);//llama a todos los elementos de los usuarios
                break;
            case 2:
                Contadigi llamado= new Contadigi();
                llamado.Contadigi(args);//Llama a todos los elementos de contador de dígitos
                break;
            case 3:
                Mayorme entra= new Mayorme();
                entra.Mayorme(args);//Llama a todos los elementos de mayor y menor de tres números
                break;
            case 4:
                Promedio entrado= new Promedio();
                entrado.Promedio(args);//Llama a todos los elementos de un Promedio
                break;
            case 5:
                System.out.println("GRACIAS POR UTILIZAR EL PROGRAMA");
                System.exit(0); //salir del programa
                break;
            default:
                break;
               
        }
    }
    
}
