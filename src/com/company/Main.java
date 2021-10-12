package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// ciclos while, do-while y for

        //ciclo for
            //código que se repite n veces
      /*      Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa un número");
            int num = sc.nextInt();



            for(int i = 1; i <= 10; i++){
                if(i % 2 == 0){
                    continue; //Pasa a la siguiente iteración sin terminar de ejecutar el
                    //código debajo
                }*/


            //    System.out.println(num + "x" + i + "="  + (num  *  i));
               /* if( i == 8){
                    break; // Detiene el ciclo
                }*/


        //Escribir un programa que genere la sucesión de Fibonancci hasta
        //el número que introduzca el usuario.

       // Scanner sc = new Scanner(System.in);
        /*System.out.println("Ingresa un  número");
        int num = sc.nextInt();
           int x = 0, y = 0, suma = 0;

           for(int i = 2; i < num; ++i){
               suma = x + y;
               System.out.println(suma + "\n");
               x = y;
               y = suma;
           }*/

        /*System.out.println("Ingresa un número");
        int num = sc.nextInt();
        int fiboA = 0, fiboB = 1, suma = 1;
        System.out.println(fiboA);
            for(int i = 0; i < num; i++){
                System.out.println(suma);
                suma = fiboA + fiboB;
                fiboA = fiboB;
                fiboB = suma;
            }*/

            //Ciclo while, mientras la condición se cumpla se va a repetir el ciclo

        /*Scanner sc2 = new Scanner (System.in);
        System.out.println("Aidivina el numero. Ingresa un numero");
        int num = sc2.nextInt();
        int numSecreto = 33;

        while(num 1= numSecreto){


        System.out.println("Siguien adivinando el numero. Ingresa el número");
        num = sc2.nextInt();
    }
        sc2.close();
        System.out.println("Felicidades adivinaste el numero secreto")
*/


        //Ciclo Do- While
        /*Scanner sc = new Scanner(System.in);
        int num = 0;
        int numSecreto = 33;
        do{
            System.out.println("Adivina el numero secreto. Ingresa un numero");
            num = sc.nextInt();
        }while (num  != numSecreto);
        sc.close();
        System.out.println("Felicidades, adivinaste el numero secreto");*/

        // Pedir un numero al usuario y calcular su factorial

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un un número");
        int num = sc.nextInt();
        int  factorial = 1;
        while(  num > 0){
            factorial = factorial * num;
            num--;
        }
        System.out.println(factorial);






    }
}