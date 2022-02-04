import java.util.Scanner;
public class ENesimoFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
         System.out.print("Ingrese una número: ");
         n = sc.nextInt();
         System.out.println("La salida es: "+ fibonacci(n));
    }
    public static int fibonacci(int num){
    int a = 1;
    int b = -1;
    int count;
    if(num == 1){
        return 1;
    }
    while (num >= 0) {
        count = a;
        a = a + b;
        b = count;
        num-=1;
    }
    return b;
    }
}