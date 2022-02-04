import java.util.Scanner;
public class NumeroBinario1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, exp, digito;
        double binario;

        do{  
            System.out.print("Introduce un numero entero >= 0: ");
            numero = sc.nextInt();
        }while(numero<0);

        exp=0;
        binario=0;
        while(numero!=0){
            digito = numero % 2;            
            binario = binario + digito * Math.pow(10, exp);   
            exp++;
            numero = numero/2;
        }
        System.out.println("Binario: %.0f %n: " + binario);
       
    }
}