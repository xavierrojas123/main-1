import java.util.Scanner;
public class MCDMetEuclides {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        System.out.print("Ingrese el primer valor: ");
        n = sc.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        m = sc.nextInt();
        System.out.println("\nEl MCD de "+n+" y "+m+" es: " + MCDeuclides(n,m));
        System.out.println();
    }
    public static int MCDeuclides(int a, int b){    
    while(b > 0){
        if(a > b){
            a = a - b;
        }
        
        else{
            b = b - a;
        }
    }
       return a;
       
    }
    
}