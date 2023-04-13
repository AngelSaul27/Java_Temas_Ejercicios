package Ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2_4 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese un numero entero:");
        int numero = in.nextInt();
        
        int i = 1;
        while(i <= numero)
        {
            for (int j=1; j<=numero; j++)
                System.out.print("*"); 
            System.out.println();
            i++;
        }
    }
}
