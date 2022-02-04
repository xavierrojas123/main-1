import java.util.Scanner;
public class CalculoIMC3 {
	public static void main(String[] args) {
		// Declaración de variables
		Scanner sc = new Scanner(System.in);
		String nombre;
		float pesoKg;
		float estaturaM;
		float IMC; // Indice de masa corporal
		String tablaIMC;

		// Ingreso de datos
		System.out.println("CALCULO DEL IMC");
		System.out.println("===============");
		System.out.println("");
		System.out.println("Ingrese su nombre: ");
		nombre = sc.nextLine();
		System.out.println("Ingrese su peso en Kg: ");
		pesoKg = sc.nextFloat();
		System.out.println("Ingrese su estatura en metros: ");
		estaturaM = sc.nextFloat();
		tablaIMC = sc.nextLine();

		IMC =  pesoKg / (float) ((int)estaturaM ^ 2);

		if (IMC < 0) {
			System.out.println("Su clasificación es de: ");
		} else if (IMC < 18.49) {
			System.out.println("Su valor del IMC está entre: menos de 18.49 y tiene un estado de Infra Peso ");
		} else if (IMC < 24.99) {
			System.out.println("Su valor del IMC está entre: 18.50 a 24.99 y tiene un estado de Peso Normal ");
		} else if (IMC < 29.99) {
			System.out.println("Su valor del IMC está entre: 25 a 29.99 y tiene un estado de Sobre Peso ");
		} else if (IMC < 34.99) {
			System.out.println("Su valor del IMC está entre: 30 a 34.99 y tiene un estado de Obesidad Leve ");
		} else if (IMC < 39.99) {
			System.out.println("Su valor del IMC está entre: 35 a 39.99 y tiene un estado de Peso Normal ");
		} else if (IMC > 40) {
			System.out.println("Su valor del IMC está entre: 40 0 más y tiene un estado de Obesidad Morbida ");
		} else {
			System.out.println("Clasificación de la OMS de acuerdo con el IMC");
		}
	}
}