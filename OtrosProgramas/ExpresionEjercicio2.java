public class Expresion2 {
	public static void main(String[] args) {

		int a = 2 * 16;
		double b = Math.pow (2 , 3);
		int c = 4;
		double x = a / b - c;

		int d = 32;
		int e = (125 / 5 /5);
		int f = 3;
		int y = e + f;

		double resultado = x+d-y;

        System.out.println("Donde ( 2 * 16 / 2 ^ 3 – 4 ) + 32 - ( 125 / 5 / 5 + 3 )");
		System.out.println("Es:" + x);
		System.out.println("Es:" + y);
		System.out.println("Es:" + resultado);



	}
}