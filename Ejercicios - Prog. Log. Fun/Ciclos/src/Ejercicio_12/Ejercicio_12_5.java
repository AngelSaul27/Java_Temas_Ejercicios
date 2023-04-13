package Ejercicio_12;

import java.util.Scanner;

/*
   +
  ++
 +++
+++++++
   +++
   ++
   +
*/
public class Ejercicio_12_5 {
    public static void main(String args[]){
        int numero = 0;
        Scanner in = new Scanner(System.in);
        
        do{
            System.out.print("Introduce un numero inpar: ");
            numero = in.nextInt();
            System.out.println("");
        }while(numero % 2 == 0);
        
        int mitad = numero/2+1;
        int inicio = mitad, fin = mitad;
        
        for(int j = 1; j <= numero; j++)
        {
            int i = 1;
            do
            {
                if((i >= inicio && j <= mitad && i <= mitad) || (i <= fin && j >= mitad && i >= mitad))
                    System.out.print("*");
                else
                    System.out.print(" ");
                i++;
            } while(i <= numero);
            
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
