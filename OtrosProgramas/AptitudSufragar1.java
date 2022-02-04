import java.util.Scanner;
public class AptitudSufragar1 {
	public static void main(String[] args) {
		// Declaración de objetos y variables
		Scanner sc = new Scanner(System.in);
		short anioA, anioN;
		byte edad;
		// Entrada de datos
		System.out.println("Ingrese año de nacimiento: ");
		anioN = sc.nextShort();
		System.out.println("Ingrese año el año actual: ");
		anioA = sc.nextShort();
		// Proceso
		edad = (byte)(anioA - anioN);
		if (edad < 0) {
			System.out.println("\nError, el año actual no puede ser menor que el año de nacimiento");
		} else if (edad < 16) {
			System.out.println("\nUsted NO PUEDE VOTAR");
		} else if (edad < 18) {
			System.out.println("\nUsted puede VOTAR OPCIONALMENTE");
		} else if (edad < 65) {
			System.out.println("\nUsted puede posee el VOTO OBLIGATORIO");
		} else {
			System.out.println("\nUsted puede posee el VOTO FACULTATIVO U OBLIGATORIO");
		} 


	}
}