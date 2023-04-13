package Ejercicio_6;
/*
    SUMATORIA DE LAS PRIMERAS X CANTIDADES 
    INPARES DE X NUMEROS GENERADOS EN UN CICLO
*/
import java.util.Scanner;

public class Ejercicio_6_3 {
    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        int valor = 0;
        do
        {    
            System.out.print("Ingrese un valor Par: ");
            valor =  in.nextInt();
        }
        while(valor % 2 > 0);
        
            int count_inpar = 0, valor_inpar = 1, sumador = 0;
            for (; count_inpar != valor; valor_inpar++) {
                if (valor_inpar % 2 > 0) {
                    count_inpar++;
                    sumador += valor_inpar;
                    System.out.println("Valor: " + valor_inpar);
                }
            }
            
        System.out.println("Sumador: " + sumador);
    }
}
