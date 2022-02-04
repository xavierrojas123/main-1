public class ExpresionesEjercicio3 {
	public static void main(String[] args) {
		int resultado1;
		resultado1 = (2 * 8 / 2 / 2 -22 * 4 / 8 -(100 + 25) / 5 ^ 2);

		int resultado2;
		resultado2 = (( 2* 16 / 2 ^ 3 -4 ) + 32 -( 125 / 5 / 5 + 3 ));

		boolean resultado3;
		resultado3 = 12 >= 12 | 8 > 4 & 22 < 21;

		boolean resultado4;
		resultado4 = ( 12 >= 12 | 8 > 4 ) & 22 < 21;

		boolean resultado5;
		resultado5 = true & true;
		int a=100, b=-12, c=4000, d=5, e=0;

		boolean resultado6;
		resultado6 = ( a + b * c + e ) <= e * d * b & ( c / a + e -d) < e + d -c+ b * a;

		boolean resultado7;
		resultado7 = true | false & (true | ! (false | true & true));

		boolean resultado8;
		resultado8 = false | true & ! true;

		System.out.println("Expresión1:");
		System.out.println("2 * 8 / 2 / 2 –22 * 4 / 8 -(100 + 25) / 5 ^ 2 ");
		System.out.println("Resultado: ");
		System.out.println(resultado1);

		System.out.println("Expresión2:");
		System.out.println("( 2* 16 / 2 ^ 3 –4 ) + 32 -( 125 / 5 / 5 + 3 )");
		System.out.println("Resultado: ");
		System.out.println(resultado2);

		System.out.println("Expresión3:");
		System.out.println("12 >= 12 OR 8 > 4 AND 22 < 21");
		System.out.println("Resultado: ");
		System.out.println(resultado3);

		System.out.println("Expresión4: ");
		System.out.println("( 12 >= 12 or 8 > 4 ) and 22 < 21");
		System.out.println("Resultado: ");
		System.out.println(resultado4);

		System.out.println("Expresión5:");
		System.out.println("1 + 8 * ( 12 –3 + 9 / ( 9 –4 ^ 5) + 7 )  > 2.8 * 2 and  3 ^ 4  =  100 –19");
		System.out.println("Resultado");
		System.out.println(resultado5);

		System.out.println("Expresión6: ");
		System.out.println("( a + b * c + e ) <= e * d * b AND ( c / a + e -d) < e + d –c+ b * a donde: a=100 , b=-12 , c=4000 , d=5 , e=0");
		System.out.println("Resultado: ");
		System.out.println(resultado6);

		System.out.println("Expresión7: ");
		System.out.println("V or F and (V or not (F or V and V))");
		System.out.println("Resultado: ");
		System.out.println(resultado7);

		System.out.println("Expresión8: ");
		System.out.println("False OR 1 = (2 ^ 3 / 4) ^ 0 AND NOT (2 ^ -1 < 0)");
		System.out.println("Resultado:");
		System.out.println(resultado8);  


	}
}