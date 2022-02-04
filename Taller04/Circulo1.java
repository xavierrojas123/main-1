import java.util.Scanner;
public class Circulo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float diametro, perimetro, area, circunferencia; 
		float pi;

		System.out.println("Cálculo de la circuferencia: ");
		System.out.println("============================");
		System.out.println("");
		System.out.print("Ingrese el valor del diámetro en cm: ");
		diametro = sc.nextFloat();
		perimetro = (float)(diametro * 3.14);
		System.out.println("El valor de la circuferencia es: " + perimetro + "cm");
		
		System.out.println("\nCalculo del área: ");
		System.out.println("================");
		System.out.println("");
		System.out.print("Ingrese el valor del diámetro en cm: ");
		diametro = sc.nextFloat();
		area = (float) (diametro / 2 * Math.pow(3.14,2));
		System.out.println("El valor de área es: " + area + "cm^2");



	}
}