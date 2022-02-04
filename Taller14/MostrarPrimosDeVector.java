import java.util.Scanner;
public class MostrarPrimosDeVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Ingrese el tamaño del vector vector: ");
        n = sc.nextInt();
        int vector[] = new int[n];
        for(int i = 0; i <= n-1; i++){
            System.out.print("Ingrese los valores" + (i+1) + ": ");
            vector[i] = sc.nextInt();
        }
        System.out.print("\nLos numeros primos encontrados en el vector son: ");
        
        for(int i = 0; i <= n - 1; i++){
            if(esPrimo(vector[i])){
                System.out.print(vector[i] + ", ");
            }
        }
    }
    public static boolean esPrimo(int num) {
        boolean primo = false;    
        int c;
        if (num >= 2){
            c = num - 1;
            while(num % c != 0){
                c = c -1;
            }
            if (c == 1){
                primo = true;
            }
        }
        return primo;
    }  
}