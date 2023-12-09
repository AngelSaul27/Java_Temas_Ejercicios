package Ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2_8 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese un numero entero:");
        int numero = in.nextInt();
        
        int i = 1; 
        do
        {
            int j=1;
            while(j<=numero){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }while(i <= numero);
    }    
}
