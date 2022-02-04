import java.util.Scanner;
public class OrdenarMatrizFuncion {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la fila: ");
       int n = sc.nextInt();
       System.out.print("Ingrese el tamaño de la columna: ");
       int m = sc.nextInt();
       
       System.out.println("Ingrese los valores de la matriz:");
       int matriz[][] = new int[n][m];
       MATRIZOrdenada(matriz, n, m);
   }
   public static int[][] MATRIZOrdenada(int matriz[][], int n, int m) {
       Scanner sc = new Scanner(System.in);
       for (int i = 0; i < n; i++) {
           for (int j = 0; j < m; j++) {
               matriz[i][j] = sc.nextInt();
           }

       }
       for (int i = 0; i < n; i++) {
           for (int j = 0; j < m; j++) {
               for (int a = 0; a < n; a++) {
                   for (int b = 0; b < m; b++) {
                       if (matriz[i][j] < matriz[a][b]) {
                           
                           int c = matriz[i][j];
                           
                           matriz[i][j] = matriz[a][b];
                           matriz[a][b] = c;
                       }
                   }
               }
           }
       }
       System.out.println("La matriz ordenada es:");
       
       for (int i = 0; i < n; i++) {
           for (int j = 0; j < m; j++) {
               System.out.print(matriz[i][j] + " ");
               
           }
           System.out.print(" " + "\n");
       }
       return matriz;
   }
    
    
}