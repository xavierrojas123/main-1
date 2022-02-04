import java.util.Scanner;
public class EEstadNumeros2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte num, n ,cn, cp, suma, sumap;
        float prom, prom2;
        System.out.println("Ingrese los numero positivos y negativos (Para terminar digite 0): ");
        num = 1;
        n = 0;
        suma = 0;
        sumap = 0;
        cn = 0;
        cp = 0;
        while (num != 0) {
            num = sc.nextByte();
            if (num < 0) {
                cn +=  1;
            } else if (num > 0 & num != 0){
                cp += 1;
                sumap += num;
            }
            if (num != 0) {
                n += 1;
            }
            suma += num;
        }
        prom = suma / n;
        prom2 = sumap / cp;
        System.out.println("Ingresó " + n + " números");
        System.out.println("En total usted ingresó " + cp + " números positivos");
        System.out.println("En total usted ingresó " + cn + " números negativos");
        System.out.println("El promedio de los números ingresados es: " + prom);
        System.out.println("El promedio de los números positivos es: " + prom2);
     
    }
}