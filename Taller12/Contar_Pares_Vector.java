import java.util.Scanner;
public class Contar_Pares_Vector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n;
        System.out.print("Cuantos elementos tendrá su vector: ");
        n = sc.nextShort();
        int vector[] = new int[n];
        for (int i = 0; i <= (n-1);i++){
            System.out.print("Ingrese el valor " + (i+1) + " : ");
            vector[i] = sc.nextInt();
        }
        System.out.println(contpares(vector, n) +" Elementos del vector son números pares");
    }
    public static int contpares(int contvector[],int m){
        int numpares = 0;
        for(int i = 0; i <= (m-1); i++){
            if(contvector[i] % 2 == 0){
                numpares = numpares + 1;
            }
        }
        return numpares;
    
    }
    
}