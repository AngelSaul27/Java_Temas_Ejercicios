package Ejercicio_4;

import java.util.Scanner;

public class Ejercicio_4_6 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese un numero par:");
        int numero = in.nextInt();
        
        if(numero % 2 == 0)
        {
            int mitad = numero/2;
            int i = 1;
            do
            {
                for(int j = 1; j <= numero; j++)
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
                }
                System.out.println();
                i++;
            }while( i <= numero);  
        }
        else
        {
            System.out.println("Su numero no es par.");
        }   
    }  
}
