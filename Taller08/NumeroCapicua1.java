import java.util.Scanner;
public class NumeroCapicua1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int x, i, c;

        System.out.print("Introduce un número de 0 a 50: ");                                                 
        n = sc.nextInt();
        i = 0;
    
        x = n;
        while (x != 0){
            c = x % 10;
            i = i * 10 + c;
            x = x / 10;
        }
    
        if (n == i) {
            System.out.println("Es capicúa");
        }else{
            System.out.println("No es capicúa");
        }
    }
}