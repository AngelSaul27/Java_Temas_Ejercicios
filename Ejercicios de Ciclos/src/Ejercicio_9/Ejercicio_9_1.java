package Ejercicio_9;

import java.util.Scanner;

/*
    +
   +++
  +++++
   +++
    +
*/
public class Ejercicio_9_1 {

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
        
        int j = 1;
        while(j <= numero)
        {
            for(int i = 1; i<= numero; i++)
            {
                System.out.print(i >= inicio && i <= fin ? "*" : " ");
            }
            
            System.out.println("");
            
            if(j < mitad){
               inicio--;
               fin++;
            }else{
               inicio++;
               fin--;
            }
            j++;
        }
    }    
}
