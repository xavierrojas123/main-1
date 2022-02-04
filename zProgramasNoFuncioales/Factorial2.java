import java.util.Scanner;
public class Factorial2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declaración de variables
        byte n;
        int resultado;
        // Ingreso de datos
        do {
            System.out.print("Ingrese el número entero al cual desea calcular el factorial: ");
            n = sc.nextByte();
            if (n <0) {
                System.out.println("El dato ingresado es incorrecto, por favor ingrese un número no negativo");
            }
        } while (n < 0);
        resultado= 1;
        // Proceso
        for (byte c = 1; c <= n; c++) {
            resultado *= c;
        }
        // Muestra de resultados
        System.out.println("\nEl factorial de "+ n +" es: "+resultado); 
    }
}
