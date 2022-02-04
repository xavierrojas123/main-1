import java.util.Scanner;
public class ParImpar1 {
	public static void main(String[] args) {
		// Declaración de objetos y variables
		Scanner sc = new Scanner(System.in);
		int numero;
		String mensaje;

		// Entrada de Datos
		System.out.println("Ingrese un número entero: ");
		numero = sc.nextInt();

		// Proceso
		if (numero % 2 == 0) {
			mensaje = "PAR";
		} else {
			mensaje = "IMPAR";
		}

		// Muestra de datos
		System.out.println("\nEl número " + numero + " es " + mensaje);

	}
}