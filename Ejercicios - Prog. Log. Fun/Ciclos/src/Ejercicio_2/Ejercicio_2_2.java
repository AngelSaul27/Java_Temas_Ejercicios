package Ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2_2 {

    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese un numero entero:");
        int numero = in.nextInt();
        
        int j = 1;
        do
        {
            int i = 1;
            do
            {
                System.out.print("*");
            i++;
            }while(i < numero);
            
            System.out.println();
            j++;
        }while(j < numero);
        
    }
    
}
