package Ejercicio_13;
/*
  ***** *****
  **** * ****
  *** *** ***
  ** ***** **
  * ******* *
   *********
  * ******* *
  ** ***** **
  *** *** ***
  **** * ****
  ***** *****
*/
import java.util.Scanner;

public class Fallo {
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
        
        for(int j = 1; j<= numero; j++)
        {
            for(int i = 1; i<= numero; i++)
            {
                if((i >= inicio && i <= fin) && !(i >= inicio+1 && i <= fin-1)){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            
            System.out.println("");
            
            if(j < mitad){
               inicio--;
               fin++;
            }else{
               inicio++;
               fin--;
            }
        }
    }
}
