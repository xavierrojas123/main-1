import java.util.Scanner;
public class ValidarNumeroDivisor1 {
    public static void main(String[] args) {
        // Declaración de objetos y variables
       Scanner sc = new Scanner(System.in);
       int n1, n2;
       // Entrada de datos
       System.out.println("Validar si un número es divisor de otro");
       System.out.println("=======================================");
       System.out.print("Ingrese el primer número: ");
       n1 = sc.nextInt();
       System.out.print("Ingrese el segundo número: ");
       n2 = sc.nextInt();

       // Proceso
       if (n1 % n2 == 0) {
          System.out.println("\nEl número " + n2+ " es divisor de " + n1);
       } else if (n2 % n1 == 0) {
            System.out.println("\nEl número " + n1+ " es divisor de " + n2);
       } else {
            System.out.println("\nLos números nos son divisibles");
       }

    }
}