package Ejercicio_7;

import java.util.Scanner;

public class Ejercicio_7_1 {
    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        int valor = 0;
        do
        {    
            System.out.print("Ingrese un valor Par: ");
            valor =  in.nextInt();
        }
        while(valor % 2 > 0);
        
        int aux = 0, sumador = 0;
        int idx = (int)(Math.random()*50);
        
        while(aux != valor){
            if(idx % 2 > 0){
             aux++;
             sumador += idx;
             System.out.println("Indice: "+idx);
            }
            idx = (int)(Math.random()*50);
        }
        
        System.out.println("Sumador: " + sumador);
    }
}
