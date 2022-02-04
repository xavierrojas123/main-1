import java.util.Scanner;
public class VentaFactura5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String produ1, produ2, produ3;
        double precio1, precio2, precio3, subtotal, iva, total;
        int cantidad1, cantidad2, cantidad3, n;
        
        System.out.println("Ingrese el primer Producto");
        System.out.print("Nombre del Producto: ");
        produ1 = sc.nextLine();
        System.out.print("Ingrese la cantidad: ");
        cantidad1 = sc.nextInt();
        System.out.print("Precio Unit.: ");
        precio1 = sc.nextDouble();
        System.out.println("");
        System.out.println("Ingrese el segundo Producto");
        System.out.print("Nombre del producto: ");
        sc.nextLine();
        produ2 = sc.nextLine();
        System.out.print("Ingrese la cantidad: ");
        cantidad2 = sc.nextInt();
        System.out.print("Precio Unit.: ");
        precio2 = sc.nextDouble();
        System.out.println("");
        System.out.println("Ingrese el tercer Producto");
        System.out.print("Nombre del producto: ");
        sc.nextLine();
        produ3 = sc.nextLine();
        System.out.print("Ingrese la cantidad: ");
        cantidad3 = sc.nextInt();
        System.out.print("Precio Unit.: ");
        precio3 = sc.nextDouble();
        
        subtotal = (cantidad1 * precio1 + cantidad2 * precio2 + cantidad3 * precio3 );
        iva = subtotal * 0.12;
        total = subtotal + iva; 
          
          
        System.out.println("+----------+------------------------------------+-----------------+-------------+");
        System.out.println("| Cantidad | Item                               |Precio Unitario  | Precio Total|");
        System.out.println("+----------+------------------------------------+-----------------+-------------+");
        System.out.printf("| %4d | %-39s | %,12.2f | %,12.2f |%n",cantidad1,produ1, precio1, cantidad1*precio1);
        System.out.printf("| %4d | %-39s | %,12.2f | %,12.2f |%n",cantidad2,produ2, precio2, cantidad2*precio2);
        System.out.printf("| %4d | %-39s | %,12.2f | %,12.2f |%n",cantidad3,produ3, precio3, cantidad3*precio3);   
        System.out.println("+----------+------------------------------------+-----------------+-------------+");
        System.out.printf("| %46s | %12S | %,12.2f |%n", "", "Subtotal", subtotal);
        System.out.printf("| %46s | %12S | %,12.2f |%n", "", "IVA (12%)", iva);
        System.out.printf("| %46s | %12S | %,12.2f |%n", "", "Total Pagar", total);
        System.out.println("+----------+------------------------------------+-----------------+-------------+");
    }
    
}
