package Ejercicio_13;
/*
  ***** *****
  *  * * *  *
  * * *** * *
  ** ***** **
  * ******* *
   *********
  * ******* *
  ** ***** **
  * * *** * *
  *  * * *  *
  ***** *****
*/
public class Ejercicio_13 {

    public static void main(String args[]){    
        int numero = 0;
        
        do{
            System.out.println("Introduce un numero inpar:");
            numero = new java.util.Scanner(System.in).nextInt();
        }while(numero % 2 == 0);

        int mitad = numero/2+1;
        int inicio = mitad, fin = mitad;

        for(int j = 1; j<= numero; j++)
        {
            for(int i = 1; i<= numero; i++)
            {
                //Control del Rombo Interno
                if(i >= inicio+1 && i <= fin-1)
                    System.out.print("*");
                    //Esquinas
                else if(i <= inicio-2 || i >= fin+2)
                {
                    //Vaciado de Esquinas
                    if(i == inicio-2 || i == fin+2 || j == 1 || j == numero || i == 1 || i == numero)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                else System.out.print(" ");
            }

            System.out.println("");

            if(j < mitad){
                inicio--; fin++;
            }else{
                inicio++; fin--;
            }
        }         
    }  
}
