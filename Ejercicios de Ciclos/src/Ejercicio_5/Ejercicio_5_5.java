package Ejercicio_5;

public class Ejercicio_5_5 {
    public static void main(String args[]){
        for(int i = 1; i <= 10; i++){
            int j = 1;
            do{
                System.out.println(i+" x "+j+" = "+(i*j));
                j++;
            }while(j <= 10);
            System.out.println();
        }
    }
}
