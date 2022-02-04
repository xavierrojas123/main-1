import java.util.Scanner;
 
public class RangoCuadrado {
   
    Scanner teclado = new Scanner(System.in);
   
    int inicio, fin, cuadrado;
   
    public void entradatos() {
        System.out.print("Por favor ingrese el inicio del rango: ");
        inicio = teclado.nextInt();
        System.out.print("Por favor ingrese el fin del rango: ");
        fin = teclado.nextInt();
    }
   
    public void proceso() {
        for (int i = inicio; i <= fin; i++) {
            System.out.println(Math.pow(i, 2));
        }
    }
 
    public static void main(String[] args) {
        RangoCuadrado fc = new RangoCuadrado();
        fc.entradatos();
        fc.proceso();
    }
}