import java.util.Scanner;
public class NumerosRepetidos1{
    
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n, repetidos,a,b,i;

	System.out.print("¿Cuántos números va a ingresar?: ");
        n = sc.nextInt();

        int[] numeros = new int[n];
            for (i=0;i<=n-1;i++){
	        System.out.print("Ingrese el valor "+ i + ": ");
		numeros[i] = sc.nextInt();
	    }
        
	repetidos = 0;
	for (i=0;i<=n-1;i++){
                if (numeros[n-1] == numeros[i] ){
	        repetidos ++;
            }
	    
                
	    
        }
	System.out.print("El último elemento es: "+ numeros[n-1] + " y se repite "+ repetidos + " veces.");
    }
}
  