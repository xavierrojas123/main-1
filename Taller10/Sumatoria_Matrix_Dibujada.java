import java.util.Scanner;
public class Sumatoria_Matrix_Dibujada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n, c;
        int x=0;
         
        System.out.print("Ingrese un número para la matriz: ");
        n = sc.nextInt();
        int matrix[][] = new int[n][n];
        System.out.print("\nIngrese los elementos: " ); 
        
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                System.out.print("");
                System.out.print("\nFila " + (i+1) + " Columna " + (j+1) + ": ");
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++){
            for (int j= 0 ; j < n; j++) {
                System.out.printf(" | %1d |",matrix[i][j]);
                if ( i != j && i < j){
                    x += matrix[i][j];
                
                }
            }
            System.out.printf(" %n  ");
            
        }
        System.out.println("\nSumatoria sobre la diagonal principal: " + x);     
    }
    
}