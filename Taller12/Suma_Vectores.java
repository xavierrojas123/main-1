import java.util.Scanner;
public class Suma_Vectores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Ingrese el tamaño del vector: ");
        n = sc.nextInt();
        
        int sumVector[] = new int[n];
        int sumVector1[] = new int[n];
        
        System.out.println("A: ");
        for(int i = 0; i <= (n-1);i++){
            System.out.print("Ingrese valor " + (i+1) + " del vector A: ");
            sumVector[i] = sc.nextInt();
        }
        System.out.println("B: ");
        for(int i = 0; i <= (n-1);i++){
            System.out.print("Ingrese valor " + (i+1) + " del vector B: ");
            sumVector1[i] = sc.nextInt();
        }
        System.out.print(" ");
        sumavector(suma(sumVector, sumVector1, n));
    }
    public static int[] suma (int[] v1, int[] v2, int s){
        int suma[] = new int[s];
        for(int i = 0; i <= (s - 1);i++){
            suma[i] = v1[i] + v2[i];
        }
        return suma;
    }
    public static void sumavector(int[] x){
        System.out.print("");
        System.out.print("[");
        for(int i = 0; i <= (x.length-1);i++){
            System.out.print(x[i] + ", ");
        }
        System.out.print("]");
    }
    
}