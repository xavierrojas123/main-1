import java.util.Scanner;
public class OrdenarVectorRecursivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos valores desea ingresar?: ");
        int n = sc.nextInt();
        int vector [] = new int [n];
        for(int i = 0; i < n; i++){
            System.out.print("Ingrese el valor Nº"+(i+1)+ ": ");
            vector[i] = sc.nextInt();
        }
        vectorRecur(vector, n);
        System.out.println();
    }
    public static int [] vectorRecur(int vector[], int n){
        int c;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (vector[i] > vector[j]) {
                    c = vector[i];
                    vector[i] = vector[j];
                    vector[j] = c;
                }
            }
        }
        System.out.println();
        System.out.println("El vector ordenado es:");
        for (int i = 0 ; i < n; i++) {
            System.out.println(vector[i]);
        }
    return vector;
    }
    
}
