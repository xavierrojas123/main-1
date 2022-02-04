import java.util.Scanner;
public class ContarPrimosVector {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean primo = true;
        System.out.print("Ingrese una cantidad que desee: ");
        int n = sc.nextInt();

        int v[] = new int[n];
        int c, x = 0;
    
        for (int i = 0; i < v.length; i++) {
            System.out.print("Ingrese los valores: " + (i + 1 )+": ");
            v[i] = sc.nextInt();
                       
        }

        for (int i = 0; i < v.length; i++) {
            c = 0;
            for (int j = 1; j < v[i]; j++) {
                if ((v[i] % j) == 0) {
                    c++;
                } 
            }
            if (c <= 2) {
                x++;
            }
        }
        System.out.println("De los elementos ingresados " + (x - 1) + " son primos");
    }
    
}
