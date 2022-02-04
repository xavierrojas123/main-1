import java.util.Scanner;
public class CompraElectrodomestico1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float precioElec;
        float pesoLibras;
        float distanciaKm;
        float iva;
        float subtotal;
        float total;

        System.out.println("FACTURACIÓN DE UN ELECTRODOMÉSTICO");
        System.out.println("----------------------------------");
        System.out.println("");
        System.out.print("Ingrese el precio del electrodoméstico: ");
        precioElec = sc.nextFloat();
        System.out.print("Ingrese el peso en libras: ");
        pesoLibras = sc.nextFloat();
        System.out.print("Ingrese la distancia al domicilio en Km:");
        distanciaKm = sc.nextFloat();
        iva = precioElec * 12/100;
        subtotal = precioElec + distanciaKm + pesoLibras*1/100;
        total = iva + subtotal;
        System.out.println("\nTotal a pagar con IVA y entrega a domicilio: "+ total +"USD");
    }
}