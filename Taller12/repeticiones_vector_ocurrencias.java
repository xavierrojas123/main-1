import java.util.Scanner;
public class repeticiones_vector_ocurrencias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Ingrese la cantidad de elementos: ");
        n = sc.nextInt();
        int vector[] = new int[n];
        for (int i = 0; i <= (n-1);i++){
            System.out.print("Ingrese el valor " + (i+1) + " : ");
            vector[i] = sc.nextInt();
        }
        repetidos(ocurrencias(vector,n));
    }
    public static int[] ocurrencias(int[] vectorNum,int n){
        int cont;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (vectorNum[i] < vectorNum[j]){
                    cont = vectorNum[i];
                    vectorNum[i] = vectorNum[j];
                    vectorNum[j] = cont;
                }
            }
        }
        return vectorNum;
    }
    public static void repetidos(int[] x) {
        int contador;
        contador = 0;
        System.out.print("Valor: \n");
        System.out.print("-----");
        System.out.println("");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i] + " ");
        }
        System.out.println("");
        System.out.print("Ocurrencias: \n");
        System.out.print("-----");
        System.out.println("");
        for (int c = 0; c < 2; c++) {
             for (int j = 0 ; j < 2; j++){
                if(x[c] > x[j]){
                   contador++;
                   System.out.print(x[j] + " ");  
                }
                    
             }
            
        }
        System.out.println("");
    }
}