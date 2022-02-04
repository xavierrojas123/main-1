import java.util.Scanner;
public class ValoresUnicos1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dim, i, x, ocurrencias;
		int vector[];
		System.out.println("Ingrese la dimensión del vector: ");
		dim = sc.nextInt();
		vector = new int[dim];
		for (x=1;x<=dim;x++) {
            System.out.println("Ingrese valor "+x+": ");
            vector[x-1] = sc.nextInt();
		}
		System.out.println("Los elementos únicos son: ");
		for (x=1;x<=dim;x++) {
            ocurrencias = 0;
            for (i=1;i<=dim;i++) {
                if (vector[x-1]==vector[i-1]) {
                   	ocurrencias = ocurrencias+1;
				}
            }
            if (ocurrencias<2) {
			System.out.println(vector[x-1]);
            }
		}
    }
    
}