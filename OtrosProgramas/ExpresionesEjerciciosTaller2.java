public class ExpresionesEjerciciosTaller1 {
	public static void main(String[] args) {
		String expresion1 = "2 * 8 / 2 / 2 – 22 * 4 / 8 - (100 + 25) / 5 ^ 2";
		int a = 2 * 8 / 2;
		int b = 2;
		int x = a / b ;
		
		int c = - 22 * 4;
		int d = 8;
		int y = c / d;

		int e = - (100 + 25);
		double f = Math.pow (5 , 2);
		double g = f;
		
		double z = e / f;

		double resultado = x+y+z;


		System.out.println("Donde 2 * 8 / 2 / 2 – 22 * 4 / 8 - (100 + 25) / 5 ^ 2");
		System.out.println("Encontrar el resultado mediante sum, res, mul, div, poten");
		System.out.println("Es:" + x);
		System.out.println("Es:" + y);
		System.out.println("Es:" + g);
		System.out.println("El resultado de la expresion 1 es:" + resultado);

		{
			String Expresion2 ;
			int a = 2 * 8 / 2;
			int b = 2;
			int x = a / b ;

			System.out.println("Es:" + x);


		}
	}


}
		
	
