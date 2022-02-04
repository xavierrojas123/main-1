import java.util.Scanner;
public class Binario1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, decimal;
        double binario;
        System.out.print("Ingrese un numero decimal : ");
        n = sc.nextInt();
        i = 0;
        binario = 0;

        while (n != 0) {
            decimal = n % 2;            
            binario = binario + decimal * Math.pow(10, i);   
            i++;
            n = n / 2;
        }
        System.out.println("El numero traducido a binario es: " + binario);
    
    }
}