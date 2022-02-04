import java.util.Scanner;
public class DiasMes1 {
	public static void main(String[] args) {
		// Declaración de variables
		Scanner sc = new Scanner(System.in);
		byte mes;
		byte dias;
		// Ingreso de datos

		System.out.print("Escriba el numero del mes del 1 al 12: : ");
		mes = sc.nextByte();
		// Procesos

		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 9 || mes == 10 || mes == 11 || mes == 12) {
			dias = 31;
			System.out.println("El mes " + mes + " tiene " + dias + " días");
		} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			dias = 30;
			System.out.println("El mes " + mes + " tiene " + dias + " días");
		} else if (mes == 2){
			dias = 28;
			System.out.println("El mes " + mes + " tiene " + dias + " días");

		} 
		else {
		System.out.println("Error, el número del mes es incorrect");	

		}



	}
}