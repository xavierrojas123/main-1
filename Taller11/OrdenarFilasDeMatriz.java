import java.util.Scanner;
public class OrdenarFilasDeMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, suma = 0;
        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        n = sc.nextInt();
        int[][] matriz = new int[n][n];
        System.out.println("\nIngrese valores de la matriz [fila,columna]");
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                System.out.print("Elemento [" + (i + 1) + "," + (j + 1) + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i <= n - 2; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                suma = suma + matriz[i][j];
            }
        }
        
        System.out.println("\nLa matriz que usted ingresó es la siguiente:");
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                System.out.print("+-----");
            }
            System.out.println("+");
            for (int j = 0; j <= n - 1; j++) {
                System.out.printf("| %3d ",matriz[i][j]);
            }
            System.out.println("|");
        }
        for (int j = 0; j <= n - 1; j++) {
            System.out.print("+-----");
        }
        System.out.println("+");
        
        System.out.println("Matriz de mayor a menor es");
        for (int i=0; i < n; i++){ 
             for (int j=0; j < n; j++){ 
                 System.out.print("|"+matriz[i][j]+"|"); 
        }
        System.out.println(); 
    }
    }
    
}