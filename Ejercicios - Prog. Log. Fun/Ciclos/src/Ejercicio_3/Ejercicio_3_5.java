package Ejercicio_3;

import java.util.Scanner;

public class Ejercicio_3_5 {
    public static void main(String args[])
    {  
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese un numero entero:");
        int numero = in.nextInt();
        
        for(int i = 1; i <= numero; i++)
        {
            int j=1;
            do 
            {
                if(i == 1 || j == numero || j == 1 || i == numero)
                {
                    System.out.print("*"); 
                }
                else
                {
                    System.out.print(" "); 
                }
                j++;
            }while(j<=numero);
            System.out.println();
        }
    }
}
