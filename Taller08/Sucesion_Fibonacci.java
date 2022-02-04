import java.util.Scanner;
public class Sucesion_Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte n;
		int fib_anterior;
		int fib_nuevo;
		int proximo;
		byte c;

		System.out.print("Ingrese los elementos fibonnaci a mostrar : ");
		n = sc.nextByte();
		fib_anterior = 0;
		System.out.println (fib_anterior);
		fib_nuevo = 1;

		for (c = 2; c <= n; c++) {
			System.out.println (fib_nuevo);
			proximo = fib_anterior + fib_nuevo;
			fib_anterior = fib_nuevo;
			fib_nuevo = proximo;
		}
	}
}