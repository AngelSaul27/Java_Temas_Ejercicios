package Ejercicio_5;

public class Ejercicio_5_4 {
    public static void main(String args[]){
        int i = 1;
        while( i <= 10){
            for(int j = 1; j <= 10; j++){
                System.out.println(i+" x "+j+" = "+(i*j));
            }
            System.out.println();
            i++;
        }
    }
}
