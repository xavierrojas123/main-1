import java.util.Scanner;
public class Edades1 {
	public static void main(String[] args) {
		// Declaración de objetos y variables
		Scanner sc = new Scanner(System.in);
		byte edad;
		byte n, c;
		float total_promedio;
		// Entrada de datos
		System.out.println("Ingrese su edad: ");
		System.out.println("==================");
		System.out.println("¿Cuántas edades desea ingresar?: ");
		n = sc.nextByte();
		edad = 1;
		c = 1;
		total_promedio = 0;
		while (c <= n) {
		 	System.out.println("Ingrese la edad de la persona " + c);
			edad = sc.nextByte();
			c += 1;
			if (edad >= 0 && edad <= 13) {
			System.out.println("\nEs NIÑO ");
		} 
		else if (edad >= 14 && edad <= 28) {
			System.out.println("\nEs JOVEN");
		} 
		else if (edad >= 29 && edad <= 65) {
			System.out.println("\nEs ADULTO");
		} 
		else if (edad >= 65) {
			System.out.println("\nEs ADULTO MAYOR");
		}  
		
		}
		
		total_promedio = (total_promedio + edad) / n;
        System.out.println("La edad promedio es "+  total_promedio + " años");

	}
}