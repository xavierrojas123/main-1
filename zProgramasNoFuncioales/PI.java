import java.util.Scanner;
public class  PI{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double pi;
        
        System.out.println("Ingrese un número: ");
        n = sc.nextInt();
        pi = 0.0;
        
        for (int i = 0; i<n; i++){
            pi += ((2  *i) / (2 * i - 1)) * ((2*i)/(2*i+1));
            
        }
        System.out.print("El valor aproximado de pi es: " + pi);
    }
    
}