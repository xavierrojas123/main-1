public class Expresiones1 {
	public static void main(String[] args) {
		byte a = 4;
		byte b = 3;
		byte c = 5;

		boolean resultado;

		resultado = (a > b + 2) && !(c + a == b * c);

		System.out.println("Dado a = 4, b =3, c =5");
		System.out.println("El resultado de la expresión es:");
		System.out.println("(a > b + 2) && !(c + a == b * c)");
		System.out.println("Es:" + resultado);

	}
}