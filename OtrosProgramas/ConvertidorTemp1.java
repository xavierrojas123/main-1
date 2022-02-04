import java.util.Scanner;
public class ConvertidorTemp1 {
    public static void main(String[] args) {
        // Declaración de objetos y variables
       Scanner sc = new Scanner(System.in);
       short temperatura;
       float resultado;
       String unidad_medida;
       // Entrada de datos
       System.out.println("Conversor de Temperatura");
       System.out.println("========================");
       System.out.println("Ingrese la Temperatura: ");
       temperatura = sc.nextShort();
       System.out.println("Ingrese la unidad de medida Celsius o Fahrenheit (C/F): ");
       unidad_medida = sc.next();

       // Proceso
       if (unidad_medida.equals("C")) {
            resultado = (float) (temperatura * 1.8) + 32;
            System.out.println("\n" + temperatura + " Grado Celsius equivale a: " + resultado + " grado Fahrenheit");    
            
       } else if (unidad_medida.equals("F")) {
            resultado = (float) (temperatura - 32) * 5/9  ;
            System.out.println("\n" + temperatura + " Grado Fahrenheit equivale a: " + resultado + " grado Celsius");
       } else {

            System.out.println("\nError, debe ingresar C o F");
       }

    }
}