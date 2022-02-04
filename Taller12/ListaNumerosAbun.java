import java.util.Scanner;
public class ListaNumerosAbun {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       int n;
       boolean aux = false;
       System.out.print("Ingrese un número para verificar si es abundante: ");
       n = sc.nextInt();
       if ( aux == false ) {
           System.out.println("Es un numero abundante: " + numAbundantes(n));
       } 
       System.out.println();
    }
       public static boolean numAbundantes(int n){
       int m;
       boolean numAbun = false;
       for (int c = 0; c <= n; c++){
           numAbun = false;
           m = 0;
           for (int i = 1; i < c; i++){
               if (c % i == 0){
                   m = m + i;
               }
           }
           if (m > c){
               numAbun = true;
           }
       }
       return numAbun;
   }
    
}