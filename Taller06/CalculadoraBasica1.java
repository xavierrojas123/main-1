import java.util.Scanner;
public class CalculadoraBasica1 {
    public static void main(String[] args) {
        // Declaración variables
       Scanner sc = new Scanner(System.in);
       int num1, num2;
       String signo;
       int resultado;
       System.out.println("        CALCULADORA BASICA      ");
       System.out.println("================================");
       System.out.print("Ingrese el primer número: ");
       num1 = sc.nextInt();
       System.out.print("Ingrese el segundo número: ");
       num2 = sc.nextInt();
       System.out.print("Introduzca un signo (+, -, *, /, %): ");
       signo = sc.next();

       // Proceso
        switch (signo) {
            case "+":
                resultado = num1 + num2;
                System.out.println("El total de la suma es: " + resultado);
                
            break; 

            case "-": 
                if (num1 > num2) {
                    resultado = num1 - num2;
                } else {
                    resultado = num2 - num1;
                    System.out.println("El total de la resta es: " + resultado);
                }
            break;

            case "*": resultado = num1 * num2;
            System.out.println("El total de la multiplicación es: " + resultado);
            break;

            case "/": 
                if (num1 > num2) {
                resultado = num1 / num2;
            } else{
                resultado = num2 / num1;
                System.out.println("El total de la división es: " + resultado);
            }
            break;

            case "%": 
                if (num1 > num2) {
                    resultado = num1 % num2;
                    System.out.println("\nEl total del resto es: " + resultado);
                } else{
                    resultado = num2 % num1;
                    System.out.println("\nEl total del resto es: " + resultado);
                }
      
        } 

    }
}