package Ejercicio_4;

import java.util.Scanner;

public class Ejercicio_4_5 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese un numero par:");
        int numero = in.nextInt();
        
        if(numero % 2 == 0)
        {
            int mitad = numero/2;
            for(int i = 1; i <= numero; i++)
            {
                int j = 1;
                do
                {
                    if(j > mitad && i <= mitad)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        if(j <= mitad && i > mitad)
                        {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print("¨");
                        }
                    }
                    j++;
                }while( j <= numero);
                System.out.println();
            }  
        }
        else
        {
            System.out.println("Su numero no es par.");
        }   
    }
}
