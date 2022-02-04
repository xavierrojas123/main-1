import java.util.Scanner;
public class TrianguloRectangulo1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       float dim1, dim2, dim3;
       boolean res;
       System.out.println("Validación de un triángulo");
       System.out.println("==========================");
       System.out.println("Ingrese dimensión 1: ");
       dim1 = sc.nextFloat();
       System.out.println("Ingrese dimensión 2: ");
       dim2 = sc.nextFloat();
       System.out.println("Ingrese dimensión 3: ");
       dim3 = sc.nextFloat(); 
       res = sc.nextBoolean();      

       if (dim1 ^ 2 = dim2 ^ 2 + dim3 ^ 2) OR (dim2 ^ 2 = dim1 ^ 2 + dim3 ^ 2); OR (dim3 ^ 2 = dim1 ^ 2 + dim2 ^ 2); {
            res = "SI";
           
       } if {
            res = "NO";

       } else {
               System.out.println("\nLos números " + res + "corresponden a los lados de un triángulo rectángulo");
            }
       

    }
}