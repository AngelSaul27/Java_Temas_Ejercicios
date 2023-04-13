package Ejercicio_2;

import java.util.Scanner;

/*
    *****
    *****
    *****
*/
public class Ejercicio_2 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese un numero entero:");
        int numero = in.nextInt();
        
        for(int i = 1; i <= numero; i++)
        {
            for (int j=1; j<=numero; j++)
                System.out.print("*"); 
            System.out.println();
        }
    }
}
