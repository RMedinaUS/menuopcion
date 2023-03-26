package menu;

import java.util.Scanner;

public class menu {
    public static void  main (String[] args) {
        int opcion=0; // variable la iniciamos en 0
        Scanner e = new Scanner(System.in);

        do{System.out.println("Escoge un color RGB de tu gusto"); // iniciamos siclo y emepzamos con la primera instruccion impresa
           System.out.println("1.-Rojo");
           System.out.println("2.-Azul");
           System.out.println("3.-Verde");
           System.out.println("4.-Salir");   
           opcion = e.nextInt(); 
              
           switch(opcion){
           case 1:
           System.out.println("Escogiste el color Rojo");
           break;
           case 2:
           System.out.println("Escogiste el color Azul");
           break;
           case 3:
           System.out.println("Escogiste el color Verde");
           break;
           case 4:
           System.out.println("Te has salido de la seleccion de colores");
           break;
           default: 
           System.out.println("Opcion no valida");



           }

        }while(opcion !=4);
        System.out.println("Nos vemos pronto");
    }
}