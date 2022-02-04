import java.util.Scanner;
public class MayorMenorEdad1 {
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
		if (edad >= 18) {
			System.out.println("\nUsted es MAYOR DE EDAD");
		} else {
			System.out.println("\nUsted es MENOR DE EDAD");
		}


	}
}