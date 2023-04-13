package Examen;

/*
     +
    +++
     +
     +
 +   +   + 
+++++++++++
 +   +   +
     +
     +
    +++
     +
 */
public class Examen {
    public static void main(String args[]){
        
        int numero;
        do{
            System.out.print("Ingrese un valor: ");
            numero = new java.util.Scanner(System.in).nextInt();
        }while(numero % 2 == 0);
        
        int mitad = numero/2+1;
        for(int j = 1; j <= numero; j++){
            
            int i = 1;
            while(i <= numero){
                
                if(i == mitad || j == mitad)
                    System.out.print("+");
                else if((i == mitad-1 || i == mitad+1) && (j == 2 || j == numero-1))
                    System.out.print("+");
                else if((j == mitad-1 || j == mitad+1) && (i == 2 || i == numero -1))
                    System.out.print("+");
                else
                    System.out.print(" ");
                
                i++;
            }
            System.out.println();
        }
    }
}
1