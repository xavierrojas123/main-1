import java.util.Scanner;
public class ListaNumPrimos1 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       byte ele_mostrar;
       byte encontrados;
       int num, c;
       String esPrimo;
       System.out.print("Ingrese la cantidad de primos a mostrar: ");
       ele_mostrar = sc.nextByte();
       encontrados = 0;
       num = 2;
       while (encontrados < ele_mostrar) {
       		esPrimo = "S";
       		c = num - 1;
       		while (c >= 2) {
       			if (num % c == 0) {
       				esPrimo = "N";
       			}
       			c -= 1;

       		}
       		if (esPrimo.equals("S")) {
       			System.out.println(num);
       			encontrados += 1;
       		}
       		num += 1;
        }
        
       
    }
    
}
