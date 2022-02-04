import java.util.Scanner;
public class DecimalBinarioFuncion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n;
        System.out.print("Ingrese una número que desee convertir a decimal: ");
        n = sc.nextShort();
        System.out.println("\nEl número "+n+" respresentado en binario es: "+ DECbinario(n));
    }
    public static double DECbinario(short n1){
    int i = 0, numero = 0;
    double binario;
    binario = 0;
        
    while (n1 != 0){
        numero = n1 % 2;
        binario = binario + numero * Math.pow(10, i);
        i++;
        n1 /= 2;
    }

     return binario;
    } 
}