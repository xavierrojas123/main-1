import java.util.Scanner;
public class Bisiesto1 {
    public static void main(String[] args) {
        // Declaración variables
       Scanner sc = new Scanner(System.in);
       short anio;
       System.out.println("Validar si es un año bisiesto o no");
       System.out.println("=================================");
       System.out.println("Ingrese el año deseado a verificar: ");
       anio = sc.nextShort();

       // Proceso
        if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
            System.out.println("\nEl año si es bisiesto");
        } 
        else if (anio != 1){
            System.out.println("\nEl año no es bisiesto");

        } 
       

    }
}