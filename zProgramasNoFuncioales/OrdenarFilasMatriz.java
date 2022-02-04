import java.util.Scanner;
public class OrdenarFilasMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int m;
        System.out.print("Ingrese el tamaño de la fila: ");
        n = sc.nextInt();
        System.out.print("Ingrese el tamaño de la columna: ");
        m = sc.nextInt();
        int matriz[][] = new int[n][m];
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = sc.nextInt();
            }
            System.out.print(" " + " \n");
        }

        System.out.print("Matriz que ud ingreso es: " + " \n");
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print(" " + " \n");
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                for (int x = 0; x < m -j -1; x++) {
                    if (matriz[i][x] < matriz[i][x+1]){
                        int t = matriz[i][x];
                        matriz[i][x] = matriz[i][x+1];
                        matriz[i][x+1] = t;
                    }
                }
            }
        }
        System.out.print("Matriz con sus filas ordenadas de mayor a menor es: " );
        for (int i = 0 ; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }   System.out.print(" ");
    }
    
}