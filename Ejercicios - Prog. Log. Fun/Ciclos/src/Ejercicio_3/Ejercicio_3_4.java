package Ejercicio_3;

import java.util.Scanner;

public class Ejercicio_3_4 {
    public static void main(String args[])
    {  
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese un numero entero:");
        int numero = in.nextInt();
        
        int i = 1;
        while(i <= numero)
        {
            for (int j=1; j<=numero; j++)
            {
                if(i == 1 || j == numero || j == 1 || i == numero)
                {
                    System.out.print("*"); 
                }
                else
                {
                    System.out.print(" "); 
                }
            }
            System.out.println();
            i++;
        }
    }
}
