import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int edad, n, i = 1;
        double prom = 0;

        System.out.println("N personas");
        n = sc.nextInt();

        while (i <= n) {

            System.out.println("Ingrese la edad de la persona "+  i);
            edad = sc.nextInt();

            if (edad >= 0 && edad <= 13) {
                System.out.println("** Es NIÑO **");
            }

            if (edad >= 14 && edad <= 28) {
                System.out.println("** Es JOVEN **");
            }

            if (edad >= 29 && edad <= 64) {
                System.out.println("** Es ADULTO **");
            }

            if (edad >= 65 ) {
                System.out.println("** Es ADULTO MAYOR **");
            }

            i += 1;

            prom = (prom + edad) / n;
            System.out.println("La edad promedio es "+  prom + " años");
        }
    }
}