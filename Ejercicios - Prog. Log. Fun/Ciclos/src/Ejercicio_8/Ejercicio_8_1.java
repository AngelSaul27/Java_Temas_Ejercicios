package Ejercicio_8;
/*
  ***** *****
  ****   ****
  ***     ***
  **       **
  *         *

  *         *
  **       **
  ***     ***
  ****   ****
  ***** *****
*/
import java.util.Scanner;

public class Ejercicio_8_1 {
    public static void main(String args[]){
        
        int numero = 0;
        Scanner in = new Scanner(System.in);
        do{
            System.out.print("Introduce un numero inpar: ");
            numero = in.nextInt();
            System.out.println("");
        }while(numero % 2 == 0);
        
        int mitad = numero/2+1;
        int inicio = mitad;
        int fin = mitad;
        int sw = 0;
        
        for(int j = 1; j<= numero; j++)
        {
            int i = 1;
            while(i <= numero)
            {
                System.out.print(i >= inicio && i <= fin ? " " : "*");
                i++;
            }
            
            System.out.println("");
            
            if(sw == 0)
            {
                inicio--;
                fin++;
                sw = inicio == 1 ? 1 : 0; 
            }else{
                inicio++;
                fin--;
            }
        }
    }
}
