import java.util.Scanner;
public class PiVieteRecursivo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Pi Método Viéte");
    System.out.print("Ingrese un número que usted desee: ");
        int n = sc.nextInt();
        
    System.out.println("La aproximación a PI es: "+PiViete(n));
        System.out.println();
    }
    public static double PiViete(int n){
        double i, j,aux,c,num, piv;
        piv = Math.sqrt(2);
    c = Math.sqrt(piv + 2);
    aux = 2;
    j = 2;
    num = 1;
        
    for (i = 1; i <= n; i++) {
            aux = aux * num;
            if (i==1) {
                num = aux/piv;
            } else {
        if ((n >= 3)) {
        c = Math.sqrt(piv+2);
                num = j / c;
        piv = c;
                }
            }
    }
        return aux;
    }
    
}