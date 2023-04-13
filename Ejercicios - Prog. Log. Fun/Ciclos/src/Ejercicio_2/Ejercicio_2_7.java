package Ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2_7 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese un numero entero:");
        int numero = in.nextInt();
        
        int i = 1;
        while(i <= numero)
        {
            int j=1;
            do{
                System.out.print("*"); 
                j++;
            }while(j<=numero);
            System.out.println();
            i++;
        }
    }
}
