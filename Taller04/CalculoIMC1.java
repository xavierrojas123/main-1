import java.util.Scanner;
public class CalculoIMC1 {
	public static void main(String[] args) {
		// Declaración de variables
		Scanner sc = new Scanner(System.in);
		String nombre;
		float pesoKg;
		float estaturaM;
		float IMC; // Indice de masa corporal

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

		// Cálculo de IMC
		IMC =  pesoKg / (float) ((int)estaturaM ^ 2);

		// Muestra de resultados
		System.out.println("El IMC de " + nombre + " es igual a: " + IMC);

		System.out.println("____________________________________");
		System.out.println("|          TABLA IMC               |");
		System.out.println("====================================");
		System.out.println("|  Valor del IMC  |     Estado     |");
		System.out.println("____________________________________");
		System.out.println("| Menos de 18.49  |    Infra Peso  |");
		System.out.println("------------------------------------");
		System.out.println("| 18.50 a 24.99   |   Peso Normal  |");
		System.out.println("------------------------------------");
		System.out.println("| 25 a 29.99      |    Sobre Peso  |");
		System.out.println("------------------------------------");
		System.out.println("| 30 a 34.99      |  Obesidad Leve |");
		System.out.println("------------------------------------");
		System.out.println("| 35 a 39.99      | Obesidad Media |");
		System.out.println("------------------------------------");
		System.out.println("| 40 o más        |Obesidad Mórbida|");
		System.out.println("____________________________________");
		System.out.println("");
		System.out.println("Clasificación de la OMS de acuerdo con el IMC");
	}
}