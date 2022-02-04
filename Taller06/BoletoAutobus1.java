import java.util.Scanner;
public class BoletoAutobus1 {
    public static void main(String[] args) {
        // Declaración de objetos y variables
       Scanner sc = new Scanner(System.in);
       short recorrido_Km;
       float precio_base, total, desA ,total_pagar;
       String tipo_dia;
       // Entrada de datos
       System.out.println("       Boleto de Autobús        ");
       System.out.println("================================");
       System.out.println("Ingrese el recorrido en Km: ");
       recorrido_Km = sc.nextShort();
       System.out.println("Seleccione el tipo de dia (L/F): ");
       tipo_dia = sc.next();

       // Proceso
       precio_base = recorrido_Km * (float)0.5; 
       desA = 0;
       if (recorrido_Km > 80){
          desA = desA + 15;
       } if (tipo_dia.equals("L") ) {
          desA = desA + 5; 
       } 
          total = precio_base * desA / 100;
          total_pagar = precio_base - total;
          System.out.println("\nEl precio final del BOLETO es de: " + total_pagar);
       

    }
}