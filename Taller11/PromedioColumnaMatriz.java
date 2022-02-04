import java.util.Scanner;
public class PromedioColumnaMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma, promedioMatriz;
        int n, m, mayor, menor;
        mayor = 0;
        System.out.print("Ingrese el número de filas: ");
        n = sc.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        m = sc.nextShort();
        int matriz[][] = new int [n][m];
        for (int i = 0; i <= (n-1); i++){
            for(int j = 0; j <= (m-1); j++){
                System.out.print("Ingrese los valores " +(i + 1)+","+(j+1)+": ");
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] >= mayor) {
                    mayor = matriz[i][j];
                }
            }
        }
        for(int j = 0; j <= (m-1); j++){
            suma = 0;
            menor = mayor;
            for (int i = 0; i <= (n-1); i++){
                suma = suma + matriz[i][j];
                if (matriz[i][j] <= menor){
                    menor = matriz[i][j];
                }
            }
            promedioMatriz = (suma / n);
            System.out.println("El promedio de la columna " + (j + 1) + " es " + promedioMatriz + " El valor menor es " + menor);  
        }   
        
    }  
}