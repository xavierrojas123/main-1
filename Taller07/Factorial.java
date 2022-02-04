import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, factorial, c;
        System.out.println("Ingrese un numero que desee: ");
        numero = sc.nextInt();
        factorial = 1;
        c = 1;

        while (c <= numero) {
        	factorial = factorial * c;
        	c += 1;

        }
        System.out.println("El factorial de " + numero + " es igual a: " + factorial);

    }
}
