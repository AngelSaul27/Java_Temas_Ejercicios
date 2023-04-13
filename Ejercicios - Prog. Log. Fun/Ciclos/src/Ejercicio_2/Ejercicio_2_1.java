package Ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2_1 {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese un numero entero:");
        int numero = in.nextInt();
        
        int j = 1;
        while(j < numero){
            int i = 1;
            while(i < numero){
                System.out.print("*");
            i++;
            }
            System.out.println();
            j++;
        }
    }   
}
