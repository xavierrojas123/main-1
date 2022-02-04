import java.util.Scanner;
public class CuotaFija1 {
	public static void main(String[] args) {
		// Declaración de variables
		Scanner sc = new Scanner(System.in);
		short plazo; // Plazo meses
		float monto, interes_anual, interes_mensual;
		float cuota_parcial, seguro_des, cuota_final;
		// Ingreso de datos del prestámo
		System.out.print("Ingrese monto total del prestamo: ");
		monto = sc.nextFloat();
		System.out.print("Ingrese plazo para pago de prestamo (en meses): ");
		plazo = sc.nextShort();
		System.out.print("Ingrese el % de la tasa de interese anual: ");
		interes_anual = sc.nextFloat();
		// Validar plazo mínimo
		if (plazo <3) {
			System.out.println("Error, el plazo no puede ser inferior a 3"); 
		} else if (plazo > 36 && monto < 20000) {
			// Validar plazo máximo
			System.out.println("Error, el plazo no puede ser mayor a 36 en prestamos inferiores a USD 20000");
		} else {
			// Calculo de la cuota
			interes_mensual = interes_anual / 12 / 100;
			cuota_parcial = cuota_parcial = monto * ((interes_mensual * (float) Math.pow(1 + interes_mensual,plazo)) / ((float) (Math.pow(1 + interes_mensual,plazo)) - 1));
			seguro_des = cuota_parcial * (float) 0.05 / 100;
			cuota_final = cuota_parcial + seguro_des;
			System.out.println("La cuota mensual a pagar ascienda a: " + cuota_final); 
		}
		// Fin_proc



	}
}