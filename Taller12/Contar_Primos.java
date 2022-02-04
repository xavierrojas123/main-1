import java.util.Scanner;
public class Contar_Primos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Ingrese la cantidad de elementos: ");
        n = sc.nextShort();
        int vector[] = new int[n];
        for(int i = 0; i <= (n-1);i++){
            System.out.print("Ingrese el valor " + (i+1) + " : ");
            vector[i] = sc.nextInt();
        }
        System.out.println("De los elementos ingresados " + contprimo(vector, n) + " son primos");
    }
    public static int contprimo(int vectorPrimo[],int m){
        int cont, i, suma = 0;
        boolean primo;
        for (i = 0; i <= m-1; i++){
            primo = false;
            if(vectorPrimo[i] >= 2){
                cont = vectorPrimo[i] - 1;
                while(vectorPrimo[i] % cont != 0){
                    cont = cont - 1;
                }
                if ( cont == 1){
                    primo = true;
                }
            }
            if (primo == true){
                suma = suma + 1;
            }
        }
        return suma;
    
    }
}