import java.util.Scanner;
public class Temperatura1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temperatura = 0;
        double mayor = -0, menor = + 100, suma = 0, T;
        double[] vector;
        System.out.print("Ingrese la cantidad de dias que va a registar de 1 a 7: ");
        int n =sc.nextInt();
        vector = new double[n];
        for (int i=0; i < n; i++) {
            System.out.print("Ingrese la temperatura " + (i + 1) + " : ");
            T = sc.nextDouble();
            vector[i] = T;
        }
        for (int i = 0; i < n; i++) {
            suma = suma + vector[i];
            if (vector[i] > mayor) {
                mayor = vector[i];
            }
            if (vector[i] < mayor) {
                menor = vector [i];
            }
            if (vector[i] < 2) {
                temperatura = temperatura + 1;
            }
        }
        System.out.println();
        System.out.print("\nLa temperatura media de cada dia es: "+ (suma / n));
        System.out.print("\nLos dias en que se registro la temperatura mas baja " + menor );
        System.out.print("\nLos dias en que se registro la temperatura mas alta " + mayor );
        System.out.print("\nlos dias en que la temperatura media rondo +- 2°C una temperatura ingresada por teclado es el dia: " + temperatura );
        System.out.println();
       
    }
    
}