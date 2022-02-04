import java.util.Scanner;
public class SeriePrimosDiferencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int esPrimo;
	int n;
	System.out.print("Ingrese la cantidad de n números que desea saber de la serie: ");
	n = sc.nextInt();
	System.out.println("\nLa diferencia de n primos son: ");
	esPrimo = primo(n);
    }
    public static int primo(double n) {
	int c,dif = 1,num = 0,x;
	int diferencia = 0;
	while (n > 0) {
            num = num+1;
            x = 1;
            c = 0;
            while (x<=num) {
		if (num%x==0) {
                    c = c+1;
		}
                x = x+1;
            }
            if (c==2) {
		dif = num - dif;
		System.out.println(dif);
		dif = num;
		n = n-1;
            }
	}
	return diferencia;
        
    }
}