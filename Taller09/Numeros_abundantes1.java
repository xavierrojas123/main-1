import java.util.Scanner;
public class Numeros_abundantes1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, suma;
        System.out.print("Ingrese un numero entero ente 0 y 50: ");
        n = sc.nextShort();
        for (byte c = 1; c <= n; c++){
            suma = 0;
            for (int i = 1; i < c; i++){
                if (c % i == 0){
                   suma += i; 
                }   
            }
            if (suma > c) {
                System.out.println(+ c);
            }
        }

 
    }
    
}