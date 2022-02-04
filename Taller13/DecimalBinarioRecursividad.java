import java.util.Scanner;
public class DecimalBinarioRecursividad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n;
        System.out.print("Ingrese una número que desee convertir a decimal: ");
        n = sc.nextShort();
        System.out.println("\nEl número "+n+" respresentado en binario es: ");
        DECbinario(n);
        System.out.println();
    }
    public static void DECbinario(int n){
    if (n < 2) {
        System.out.print(n);
        return ;
    } else {
        DECbinario(n / 2);
        System.out.print(n % 2);
        return;
    }

    }
    
}