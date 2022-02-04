import java.util.Scanner;
public class Primo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, c;
        String esPrimo;
        System.out.println("Ingrese un número entero: ");
        n = sc.nextInt();
        esPrimo = "S";
        c = n - 1;

        while (c >= 2) {
            if (n % c == 0) {
                esPrimo = (String)"S";
                c = 1;
            } 
            else {
                c -= 1;
            }
        }
        if (esPrimo.equals("N") ){
          System.out.println("El número " + n + " es primo.");  
        } 
        else {
            System.out.println("El número " + n + " no es primo.");
        }
    }
}