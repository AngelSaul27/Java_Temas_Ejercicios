package Ejercicio_4;

import java.util.Scanner;

public class Ejercicio_4_2 {
    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese un numero par:");
        int numero = in.nextInt();
        int mitad = numero/2;
            
        int i = 1;
        do
        {
            int j = 1;
            do
            {
                if(j > mitad && i <= mitad)
                {
                    System.out.print("*");
                } else {
                if(j <= mitad && i > mitad)
                {
                    System.out.print("*");
                }else {
                    System.out.print("¨");
                }
            }    
            j++;
            } while( j <= numero);
                
            System.out.println();
            i++;
        }while(i <= numero);
    }
}
