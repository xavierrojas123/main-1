import java.util.Scanner;
public class EstadMatriz1 {
    public static void main(String[] args) {
        // Declaracion de variables
        int n, m, sumP = 0,sumaI = 0, sumCol= 0, c = 0; 
        float promP, promI, promT;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas de su matriz: ");
        n = sc.nextShort();
        System.out.println("Ingrese el numero de columnas de su matriz: ");
        m = sc.nextShort();
        
        int[][] matriz = new int[n][m];
        for (byte i = 0; i < m; i++) {
            for (byte j = 0; j < m; j++) {
                System.out.println("Elementos [" + (i + 1) + "," + (j + 1 + "]: "));
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] % 2==0){
                    sumP += (matriz[i][j]);
                    c++;
                } else {
                    sumaI += (matriz[i][j]);
                    
                }
                if (j == m-1) {
                    sumCol += matriz[i][j];
                    
                }
            } 
        }
        promP = (float)sumP /c;
        promI = (float) sumaI / ((n*m)-c);
        promT = ((float) sumP + sumaI)/(n*m);
        System.out.println("El promedio de los numeros pares es :" + promP);
        System.out.println("El promedio de los numeros impares es: " + promI);
        System.out.println("El promedio total es: " + promT);
        System.out.println("La sumatoria de la ultima columna es: " + sumCol);
    }
    
}
