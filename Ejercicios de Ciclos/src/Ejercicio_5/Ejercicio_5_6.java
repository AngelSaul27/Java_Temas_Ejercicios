package Ejercicio_5;

public class Ejercicio_5_6 {
    public static void main(String args[]){
        int i = 1;
        do{
            for(int j = 1; j <= 10; j++){
                System.out.println(i+" x "+j+" = "+(i*j));
            }
            System.out.println();
             i++;
        }while( i <= 10);
    }
}
