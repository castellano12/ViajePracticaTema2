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
                if (viajero1 == mediaViajeros && viajero1!=0) {
                    System.out.println("El viajero 1 no debe nada");


                    if (viajero1 > mediaViajeros) {
                        precio1 = mediaViajeros - viajero1;
                        System.out.println("El viajero 1 ha pagado de más " + precio1);
                    } else {
                        precio1 = mediaViajeros - viajero1;
                        System.out.println("El viajero 1 debe " + precio1);
                    }
                }

                if (viajero2 == mediaViajeros && viajero2!=0) {
                    System.out.println("El viajero 2 no debe nada");


                    if (viajero2 > mediaViajeros) {
                        precio2 = mediaViajeros - viajero2;
                        System.out.println("El viajero 2 ha pagado de más " + precio2);
                    } else {
                        precio2 = mediaViajeros - viajero2;
                        System.out.println("El viajero 2 debe " + precio2);
                    }
                }

                if (viajero3 == mediaViajeros && viajero3!=0) {
                    System.out.println("El viajero 3 no debe nada");


                    if (viajero3 > mediaViajeros) {
                        precio3 = mediaViajeros - viajero3;
                        System.out.println("El viajero 3 ha pagado de más " + precio3);
                    } else {
                        precio3 = mediaViajeros - viajero3;
                        System.out.println("El viajero 3 debe " + precio3);
                    }
                }

                if (viajero4 == mediaViajeros && viajero4!=0) {
                    System.out.println("El viajero 4 no debe nada");


                    if (viajero4 > mediaViajeros) {
                        precio4 = mediaViajeros - viajero4;
                        System.out.println("El viajero 4 ha pagado de más " + precio4);
                    } else {
                        precio4 = mediaViajeros - viajero4;
                        System.out.println("El viajero 4 debe " + precio4);
                    }
                }

                if (viajero5 == mediaViajeros && viajero5!=0) {
                    System.out.println("El viajero 5 no debe nada");

                    if (viajero5 > mediaViajeros) {
                        precio5 = mediaViajeros - viajero5;
                        System.out.println("El viajero 5 ha pagado de más " + precio5);
                    } else {
                        precio5 = mediaViajeros - viajero5;
                        System.out.println("El viajero 5 debe " + precio5);
                    }
                }

            }
        }while (opcion!=4);
    }
}
