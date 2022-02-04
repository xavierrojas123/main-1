import java.util.Scanner;
public class CompraElectrodomestico1 {
	public static void main(String[] args) {
			// Declaración de variables
		Scanner sc = new Scanner(System.in);
		float precio;
		float iva;
		float subtotal;
		float distanciaKm;
		float pesolibras;
		float total;

		// Ingreso de datos
		System.out.println("CALCULO COMPRA DE UN ELECTRODOMÉSTICO");
		System.out.println("=====================================");
		System.out.println("");
		System.out.println("Ingrese el precio del Electrodoméstico: ");
		precio = sc.nextFloat();
		System.out.println("Ingrese peso en libras: ");
		pesolibras = sc.nextFloat();
		System.out.println("Ingrese la distancia al domicilio en Km: ");
		distanciaKm = sc.nextFloat();

		// Cálculo de CompraElectrodomestico1
		iva = precio * 12/100;
		subtotal = precio + distanciaKm + pesolibras*1/100;
		total = iva + subtotal;

		// Muestra de resultados
		System.out.println("\nTotal a pagar con IVA y entrega a domicilio: "+ total +"USD");

	}
} 
	