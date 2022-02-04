import java.util.Scanner;
public class TipoPersona1 {
	public static void main(String[] args) {
		// Declaración de objetos y variables
		Scanner sc = new Scanner(System.in);
		byte edad;
		// Entrada de datos
		System.out.println("Ingrese su edad: ");
		edad = sc.nextByte();

		if (edad < 0) {
			System.out.println("\nUsted es de tipo de: ");
		} else if (edad < 13) {
			System.out.println("\nUsted se considera infante");
		} else if (edad < 17) {
			System.out.println("\nUsted se considera adolescente");
		} else if (edad < 23) {
			System.out.println("\nUsted se considera adolescente");
		} else if (edad < 65) {
			System.out.println("\nUsted se considera adulto");
		} else if (edad > 65) {
			System.out.println("\nUsted se considera adulto mayor");
		} else {
			System.out.println("\n");
		} 


	}
}