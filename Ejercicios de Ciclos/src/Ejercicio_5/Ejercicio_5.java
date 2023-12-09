package Ejercicio_5;
/*
    1x1=1
    .
    .
    .
    1x10=10
*/
public class Ejercicio_5 {

    public static void main(String args[]){
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                System.out.println(i+" x "+j+" = "+(i*j));
            }
            System.out.println();
        }
    }
    
}
