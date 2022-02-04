import java.util.Scanner;
public class PiramideIvertida1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;
        System.out.print("Ingrese un número que determine su tamaño: ");
        altura = sc.nextInt();

        for (int c = 0, num = (altura * 2)-1; num > 0; c++, num -= 2){
            for (int i = 0; i < c; i++){
                System.out.print(" ");
            }
            for (int j = num; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
