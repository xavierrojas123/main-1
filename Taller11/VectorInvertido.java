import java.util.Scanner;
public class VectorInvertido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, j, n ,i;
	int vector[];
	System.out.println("Ingrese una cantidad de números que desee: ");
	n = sc.nextInt();
	vector = new int[n];
	for (i = 1;i <= n; i++) {
	    System.out.println("Ingrese el elemento "+ i +": ");
	    vector[i-1] = sc.nextInt();
	}
	i = 1;
	j = n;
	while (i < j) {
            a = vector[i-1];
            vector[i-1] = vector[j-1];
	    vector[j-1] = a;
	    i = i + 1;
	    j = j - 1;
	}
	System.out.println("El vector Invertido es: ");
	for (i = 1;i <= n; i++) {
	    System.out.println(vector[i-1]);
	}
    }
    
}