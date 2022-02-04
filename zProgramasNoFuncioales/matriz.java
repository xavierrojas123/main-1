/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "SIN_TITULO.java."

import java.io.*;

public class matriz {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int i;
		int j;
		int matriz[][];
		int suma;
		matriz = new int[4][4];
		suma = 0;
		System.out.println("Suma de diagonal secundaria: ");
		System.out.println(" ");
		for (i=1;i<=4;i++) {
			for (j=1;j<=4;j++) {
				System.out.println("Escriba el valor ["+i+","+j+"]:");
				matriz[i-1][j-1] = Integer.parseInt(bufEntrada.readLine());
			}
		}
		for (i=1;i<=4;i++) {
			for (j=1;j<=4;j++) {
				System.out.print(matriz[i-1][j-1]+" ");
			}
			System.out.println(" ");
		}
		j = 4;
		for (i=1;i<=4;i++) {
			suma = suma+matriz[i-1][j-1];
			j = j-1;
		}
		System.out.println("la suma de la diagonal es: "+suma);
	}


}

