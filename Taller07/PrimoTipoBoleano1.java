import java.util.Scanner;
public class PrimoTipoBoleano1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, c;
        boolean esPrimo;
        System.out.print("Ingrese un número entero: ");
        n = sc.nextInt();
        esPrimo = true;
        c = n - 1;

        while (c >= 2) {
            if (n % c == 0) {
                esPrimo = false;
                c -= 1;
            } 
            else {
                c -= 1;
            }
        }
        if (esPrimo == true){
          System.out.println("El número " + n + " es primo.");  
        } 
        else {
          System.out.println("El número " + n + " no es primo.");
        }
    }
}
