import java.util.Scanner;
public class MatrizMultiplicacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        System.out.print("Ingrese el número de filas: ");
        n = sc.nextInt();
        System.out.print("Ingrese un número que multiplique: ");
        m = sc.nextInt();
        int vector[][] = new int[n][n];
        int multipl[][] = new int[n][n];
        for(int i = 0; i <= (n-1); i++){
            for(int j = 0; j <= (n-1); j++){
                System.out.print("Ingrese el valor ["+(i+1)+ ","+(j+1)+"]: ");
                vector[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i <= (n-1); i++){
            for(int j = 0; j <= (n-1); j++){
                multipl[i][j] = vector[i][j] * m;
            }
        }
        matrizMultiplicacion(vector, multipl, n);
    }
    public static void matrizMultiplicacion(int vectorM[][], int vectorMult[][], int cont){
        int a, b;
        String es = "", espacio = "";
        System.out.println(es);
        for (a = 0; a < cont; a++) {
            for (b = 0; b < cont; b++) {
                System.out.print("  "+ vectorM[a][b]+"  ");
            }
            System.out.println();
            if (a <= cont - 2){
                System.out.println(espacio);
            }
        }
        System.out.println("  ");
        System.out.println(es);
        for (a = 0; a < cont; a++) {
            for (b = 0; b < cont; b++) {
                System.out.print("  "+ vectorMult[a][b]+"  ");
            }
            System.out.println();
            if (a <= cont - 2){
                System.out.println(espacio);
            }
        }
    }
    
}