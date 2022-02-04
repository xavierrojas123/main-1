import java.util.Scanner;
public class EstaNumeros1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte num, suma, cn;
        System.out.println("Ingrese números positivos y negativos (para terminar digite 0):  ");
        num = 1;
        suma = 0;
        cn = 0;

        for (int i = 0 ; i < 100; i++) {
            num = sc.nextByte();
            if (num < 0) {
                cn += 1;
            }
            suma += num;
        }
        System.out.println("En total usted ingreso " + cn + " números negativos");
        System.out.println("La suma de los números ingresados es " + suma);
    }
}