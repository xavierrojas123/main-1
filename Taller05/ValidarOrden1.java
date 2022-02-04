import java.util.Scanner;
public class ValidarOrden1 {
    public static void main(String[] args) {
        // Declaración de objetos y variables
       Scanner sc = new Scanner(System.in);
       int n1, n2, n3;
       // Entrada de datos
       System.out.println("Números ascendentes y descendentes");
       System.out.println("==================================");
       System.out.println("Ingrese el Primer número ");
       n1 = sc.nextInt();
       System.out.println("Ingrese el Segundo número: ");
       n2 = sc.nextInt();
       System.out.println("Ingrese el Tercer número: ");
       n3 = sc.nextInt();

       // Proceso
       if (n1>n2 && n2>n3) {
            System.out.println("\nEstan en orden descendente");    
            
       } else if (n3>n2 && n2>n1) {
            System.out.println("\nEstan en orden ascendente");
       } else {

            System.out.println("\nError, no se ecuentran en ningun orden");
       }

    }
}