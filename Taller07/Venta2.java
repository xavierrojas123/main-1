import java.util.Scanner;
public class Venta2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float precio;
		float total;
		float subtotal;
		float iva;

		System.out.println("Compra de Articulos");
		System.out.println("===================");
		System.out.println("");
		System.out.print("\nIngrese el precio del artículo en $ : ");
		precio = sc.nextFloat();
		iva = (float)0.12;

		while (precio >= 10000) {
			if (precio <= 10000){
				
			} 
			precio += 1;
		} 
		subtotal = (float)precio * iva;
		total = (float)(subtotal + precio);
		System.out.print("El total a pagar incluido el IVA es: USD " + total);	
	}
}