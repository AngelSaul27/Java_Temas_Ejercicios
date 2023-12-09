package Ejercicio_10;

import java.util.Scanner;

/*
    +
   ++
  +++
 ++++
  +++
   ++
    +   
*/
public class Ejercicio_10_4 {
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
        
        int j = 1;
        do
        {
            for(int i = 1; i <= numero; i++)
                System.out.print(i >= inicio && i <= mitad  ? "*" : " ");
            
            System.out.println("");
            
            if(j < mitad){
               inicio--;
            }else{
               inicio++;
            }
            j++;
        }while( j <= numero);
    }
}
