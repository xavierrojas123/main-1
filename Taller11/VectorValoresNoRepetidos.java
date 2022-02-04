import java.util.Scanner;
public class VectorValoresNoRepetidos {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);  
       int i, j, lista[], n;
       String repetido;
       System.out.println("Ingrese el tamaño de números que desee: ");
       n = sc.nextInt();
       lista = new int[n];
       for (i = 1;i <= n; i++) {
       repetido = "S";
            while (repetido.equals("S")) {
                System.out.println("Ingrese el elemento: "+i+":");
                lista[i-1] = sc.nextInt();
                repetido = "N";
                for (j = 1;j <= i-1;  j++) {
                    if (lista[j-1] == lista[i-1]) {
                    repetido = "S";
                    }
                    if (repetido.equals("S")) {
	            System.out.println("El numero que ingreso ya existe INGRESE OTRO: ");
                    }
                }
            }
       }
       System.out.println("La serie ingresada es: ");
       for (i = 1;i <= n; i++) {
            System.out.println(lista[i-1]);
       }
    }
}