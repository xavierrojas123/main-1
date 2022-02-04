import java.util.Scanner;
public class BusquedaRepetidos1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n, repetidos;

		System.out.print("¿Cuántos números va a ingresar?: ");
		n = sc.nextInt();

		int[] numeros = new int[n];
		for (int i = 1; i <= n; i++){
			System.out.print("Ingrese el valor "+ i + ": ");
			numeros[i] = sc.nextInt();
		}

		repetidos = 0;
		for (int i = 1; i <= n; i++){
			if (numeros[i] == numeros[n]){
				repetidos = repetidos + 1;
			}
		}
		System.out.print("El último elemento es: "+ numeros[n] + " y se repite "+ repetidos + " veces.");
	}
}