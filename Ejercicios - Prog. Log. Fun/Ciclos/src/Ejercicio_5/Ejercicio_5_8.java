package Ejercicio_5;

public class Ejercicio_5_8 {
    public static void main(String args[]){
        int i = 1;
        do
        {
            int j = 1;
            while(j <= 10)
            {
                System.out.println(i+" x "+j+" = "+(i*j));
                j++;
            }
            System.out.println();
            i++;
        }while(i <= 10);
    }
}
