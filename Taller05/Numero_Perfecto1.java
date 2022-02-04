import java.util.Scanner;
public class Numero_Perfecto1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, x, numeroP;
		System.out.println("Números Perfectos");
		System.out.println("===================");
		System.out.print("\nIngrese un número entero : ");
		n = sc.nextInt();
		x = 2;
		numeroP = 0;
		while (x <= n) {
			if (n % x == 0){
				numeroP += (n / x);
			} 
			x += 1;
		} 
		if (numeroP == n) {
			System.out.print("El número " + n + " es perfecto");
		} else {
			System.out.print("El número " + n + " no es perfecto");
		}
	}
}