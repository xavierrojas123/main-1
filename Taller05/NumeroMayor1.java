import java.util.Scanner;
public class NumeroMayor1 {
    public static void main(String[] args) {
        // Declaración de objetos y variables
       Scanner sc = new Scanner(System.in);
       int n1, n2, n3;
       // Entrada de datos
       System.out.println("Ingrese tres numeros a continuación");
       System.out.println("============================== ");
       System.out.println("Ingrese el Primer número ");
       n1 = sc.nextInt();
       System.out.println("Ingrese el Segundo número: ");
       n2 = sc.nextInt();
       System.out.println("Ingrese el Tercer número: ");
       n3 = sc.nextInt();

       // Proceso
       if (n1>n2 && n1>n3) {
          System.out.println("El número mayor es: " + n1); 
       } else if (n2>n1 && n2>n3) {
          System.out.println("El número mayor es: " + n2); 
       } else if (n3>n1 && n3>n2); {
          System.out.println("El número mayor es: " + n3);
  
       } 

       
    }
}