import java.util.Scanner;
public class ConvierteMinutosDias1 {
	public static void main(String[] args) {
		// Declaración de variables
		Scanner sc = new Scanner(System.in);
		int minutos;
		int dias;
		int horas;

		// Ingreso de datos
		System.out.println("CALCULO PARA CONVERTIR DIAS, HORAS Y MINUTOS");
		System.out.println("============================================");
		System.out.println("");
		System.out.println("Ingrese los Minutos: ");
		minutos = sc.nextInt();

		// Cálculo de dias, horas y minutos
		dias = minutos / 1440;
		horas = minutos / 60;
		minutos = (minutos % 1440 / 60);
 
		
		// Muestra de resultados
		System.out.println("\nSalida: " + dias + " Dias con " + horas + " Horas y " + minutos + " Minutos");

	}
} 