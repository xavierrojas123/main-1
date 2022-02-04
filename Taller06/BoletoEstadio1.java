import java.util.Scanner;
public class BoletoEstadio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte valor, edad;
        char genero;
        float ninasF, ninosM, mujeres;

        System.out.println("      Boleto del Estadio");
        System.out.println(" ");
        System.out.println("El lugar de Palco tiene precio de 35 dólares");
        System.out.println("El lugar del Tribunal tiene precio de 25 dólares");
        System.out.println("El lugar Preferencial tiene precio de 20 dólares");
        System.out.println("El lugar General tiene precio de 10 dólares");

        System.out.print("\nIngrese el valor que desea pagar según el lugar que desee: ");
        valor = sc.nextByte();
        System.out.print("Ingresa la edad correspondiente: ");
        edad = sc.nextByte();
        System.out.print("Ingresa el género (M o F): ");
        genero = sc.next().charAt(0);

        ninasF = (float)(valor - valor * 0.50);
        ninosM = (float)(valor - valor * 0.40);
        mujeres = (float)(valor - valor * 0.25);

        if ((13 <= edad) && (genero == 'F')){
            System.out.println("El precio del boleto es " + mujeres + "USD");
        }else if((13 > edad) && (genero == 'F')){
            System.out.println("El precio del boleto de la niña es " + ninasF + " USD");
        }else if (13 > edad){
            System.out.println("El precio del boleto del niño es " + ninosM + " USD");
        }else{
            System.out.println("El precio del boleto es " + valor + " USD");
        }
    }
}