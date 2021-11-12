package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

	    Scanner s = new Scanner(System.in);
        int i=1;
        float mediaViajeros=0;
        int opcion =0;
        float viajero1=0;
        float viajero2=0;
        float viajero3=0;
        float viajero4=0;
        float viajero5=0;
        float precio1=0;
        float precio2=0;
        float precio3=0;
        float precio4=0;
        float precio5=0;
        int media=0;
        float total=0;
        boolean primero=false;
        boolean segundo=false;
        do {
            System.out.println("----------------------------------------------");
            System.out.println("| Repartir el coste de los viajes            |");
            System.out.println("|  1. Introducir gastos de viajeros          |");
            System.out.println("|  2. Calcular reparto de los gastos         |");
            System.out.println("|  3. Repartir el gasto entre los viajeros   |");
            System.out.println("|  4. Salir                                  |");
            System.out.println("----------------------------------------------");

            opcion = s.nextInt();
            if(opcion<1 || opcion>4)System.out.println("Escoja una opción correcta");
            else if(opcion==1){
                primero=false;
                segundo=false;
                System.out.println("introduce los gastos del viajero 1");
                viajero1 = s.nextFloat();
                if(viajero1!= -1){
                    media=media+1;
                    total=total+viajero1;
                }else viajero1=0;

                System.out.println("introduce los gastos del viajero 2");
                viajero2 = s.nextFloat();
                if(viajero2!= -1){
                    media=media+1;
                    total=total+viajero2;
                }else viajero2=0;

                System.out.println("introduce los gastos del viajero 3");
                viajero3 = s.nextFloat();
                if(viajero3!= -1){
                    media=media+1;
                    total=total+viajero3;
                }else viajero3=0;

                System.out.println("introduce los gastos del viajero 4");
                viajero4 = s.nextFloat();
                if(viajero4!= -1){
                    media=media+1;
                    total=total+viajero4;
                }else viajero4=0;

                System.out.println("introduce los gastos del viajero 5");
                viajero5 = s.nextFloat();
                if(viajero5!= -1){
                    media=media+1;
                    total=total+viajero1;
                }else viajero5=0;
                primero=true;
            } //segunda opción
            if (opcion==2 && primero==true) {
                mediaViajeros = total / media;
                System.out.println("Cada viajero debe pagar " + mediaViajeros + "€");
                segundo=true;
            }
            if (opcion==3 && primero==true && segundo==true) {
                if (viajero1==0) System.out.println("el viajero 1 no va de viaje");
                else if(viajero1 > mediaViajeros) {
                    precio1 = viajero1 - mediaViajeros;
                    System.out.println("Al viajero 1 se le debe " + precio1);
                }else if(viajero1< mediaViajeros){
                    precio1 = mediaViajeros - viajero1 ;
                    System.out.println("El viajero 1 tiene que poner " + precio1);
                }else if(viajero1 == mediaViajeros)System.out.println("El viajero 1 no debe nada");

                if (viajero2==0) System.out.println("el viajero 2 no va de viaje");
                else if(viajero2 > mediaViajeros) {
                    precio2 = viajero2 - mediaViajeros;
                    System.out.println("Al viajero 2 se le debe " + precio2);
                }else if(viajero2< mediaViajeros){
                    precio2 = mediaViajeros - viajero1 ;
                    System.out.println("El viajero 2 tiene que poner " + precio2);
                }else if(viajero2 == mediaViajeros)System.out.println("El viajero 2 no debe nada");

                if (viajero3==0) System.out.println("el viajero 3 no va de viaje");
                else if(viajero3 > mediaViajeros) {
                    precio3 = viajero3 - mediaViajeros;
                    System.out.println("Al viajero 3 se le debe " + precio3);
                }else if(viajero3< mediaViajeros){
                    precio3 = mediaViajeros - viajero3 ;
                    System.out.println("El viajero 3 tiene que poner " + precio3);
                }else if(viajero3 == mediaViajeros)System.out.println("El viajero 3 no debe nada");

                if (viajero4==0) System.out.println("el viajero 4 no va de viaje");
                else if(viajero4 > mediaViajeros) {
                    precio4 = viajero4 - mediaViajeros;
                    System.out.println("Al viajero 4 se le debe " + precio4);
                }else if(viajero4< mediaViajeros){
                    precio4 = mediaViajeros - viajero4 ;
                    System.out.println("El viajero 4 tiene que poner " + precio4);
                }else if(viajero4 == mediaViajeros)System.out.println("El viajero 4 no debe nada");

                if (viajero5==0) System.out.println("el viajero 5 no va de viaje");
                else if(viajero5 > mediaViajeros) {
                    precio5 = viajero5 - mediaViajeros;
                    System.out.println("Al viajero 5 se le debe " + precio5);
                }else if(viajero5< mediaViajeros){
                    precio5 = mediaViajeros - viajero5 ;
                    System.out.println("El viajero 5 tiene que poner " + precio5);
                }else if(viajero5 == mediaViajeros)System.out.println("El viajero 5 no debe nada");

            }
        }while (opcion!=4);
    }
}
