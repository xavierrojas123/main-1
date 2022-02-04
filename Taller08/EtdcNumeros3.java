import java.util.Scanner;
public class EtdcNumeros3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a, b;
        int x, suma, media, mayor, menor;

        System.out.println("Ingrese una cantidad de números: ");
        n = sc.nextInt();
        a = 0;
        b = 0;
        suma = 0;
        mayor = 0;
        menor = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese un número: " + i);
            x = sc.nextByte();
            if (x > mayor) {
                mayor = x;
            } 
            if (x < menor){
                menor = x;
            }
            if (x < 0) {
                a += 1;
            }
            if (x > 0) {
                b += 1;
            }
            suma += x;
        }
        media = suma / n;
        System.out.println("La media aritmetica de los números es: " + media );
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        System.out.println("La cantidad de números positivos es: " + b);
        System.out.println("La cantidad de numeros negativos  es: " + a);
     
    }
}