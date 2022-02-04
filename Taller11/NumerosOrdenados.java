import java.util.Scanner;
public class NumerosOrdenados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, limite, n;
	int vector[];
	vector = new int[10];
        for (i=1;i<=10;i++) {
            System.out.print("Ingrese un número "+i+": ");
            vector[i-1] = sc.nextInt();
        }
        for (limite = 10;limite >= 2; limite--) {
            for (i = 1;i <= limite-1; i++) {
                if (vector[i-1] > vector[i]) {
                    n = vector[i-1];
                    vector[i-1] = vector[i];
                    vector[i] = n;
                }
            }
        }
        System.out.println("Los números ordenados son: ");
        for (i=1;i<=10;i++) {
            System.out.println(vector[i-1]);
        }
    
    }
    
}