import java.util.Scanner;
public class Pi_Wallis {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n;
        double pi = 0;
        System.out.println("Ingrese un número: ");
        n = sc.nextByte();
        for (float i = 1; i <= n; i++){
            if (i % 2 == 0){
                pi = (float)(pi - (4 / ((i*2)-1)));
            } else {
                pi = (float)(pi + (4 / ((i*2)-1)));
            }
        }
        System.out.println("El valor de Pi es: " + pi);
    }
    
}