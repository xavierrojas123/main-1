import java.util.Scanner;
public class SumaDigitos1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n;
         System.out.print("Ingrese una cantidad: ");
         n = sc.nextInt();
         System.out.println("La suma de los dígitos del número es: "+ suma(n));

    }
    public static int suma(int digitos){
        if(digitos == 0){
            return 0;
        } else {
            return digitos % 10 + suma(digitos / 10);
        }
        
    }
  
}