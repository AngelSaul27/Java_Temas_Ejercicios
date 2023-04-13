package Ejercicio_9;

import java.util.Scanner;

/*
    +
   +++
  +++++
   +++
    +
*/
public class Ejercicio_9_7 {

    public static void main(String args[]){
        
        int numero = 0,sw = 0;
        Scanner in = new Scanner(System.in);
        
        do{
            System.out.print("Introduce un numero inpar: ");
            numero = in.nextInt();
            System.out.println("");
        }while(numero % 2 == 0);
        
        int mitad = numero/2+1;
        int inicio = mitad, fin = mitad;
        
        int j = 1;
        do
        {
            int i = 1;
            do
            {
                System.out.print(i >= inicio && i <= fin ? "*" : " ");
                i++;
            }while( i <= numero);
            
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
