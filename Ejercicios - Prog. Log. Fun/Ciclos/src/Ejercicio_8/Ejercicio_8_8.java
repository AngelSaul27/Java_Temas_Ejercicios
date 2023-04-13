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

public class Ejercicio_8_8 {
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
        
        int j = 1;
        do
        {
            for(int i = 1; i<= numero; i++)
            {
                System.out.print(i >= inicio && i <= fin ? " " : "*");
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
            j++;
        }while(j <= numero);
        
    }
}
