import java.util.Scanner;
public class ListarCuadradosPerfectos1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, c; 
        System.out.print("Ingrese el inicio de la serie: "); 
        n = sc.nextInt(); 
        System.out.print("Ingrese el final de la serie: "); 
        c = sc.nextInt();
        
        System.out.print("La serie de " + n + " y "+ c + " son: ");
        for (int i = n; i <= c; i++){
            for (int x= 1; x <= i; x++){
                if (x * x == i){
                    System.out.print(i + ","); 
                }
                    
            }
        }   
    }
    
}