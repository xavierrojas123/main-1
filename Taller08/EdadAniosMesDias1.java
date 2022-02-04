import java.util.Scanner;
public class EdadAniosMesDias1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anioA, mesA,diaA;
        int anioN, mesN,diaN;
        int anio, mes, dia;

        System.out.println("DATOS DE NACIMIENTO");
        System.out.print("Ingrese su dia de nacimiento: ");
        diaN = sc.nextInt();
        System.out.print("Ingrese su mes de nacimiento: ");
        mesN = sc.nextInt();
        System.out.print("Ingrese su año de nacimiento: ");
        anioN = sc.nextInt();
    
        System.out.println("DATOS ACTUALES");
        System.out.print("Ingrese el dia actual: ");
        diaA = sc.nextInt();
        System.out.print("Ingrese el mes actual: ");
        mesA = sc.nextInt();
        System.out.print("Ingrese el año actual: ");
        anioA = sc.nextInt();
        

        if (anioN > anioA) {
           System.out.print("Datos de entrada incorrecto"); 
        } else {
            dia = diaA-diaN;
            mes = mesA-mesN;
            anio = anioA-anioN;
            if (dia < 0) {
                mes = mes - 1;
                dia = dia + 30;
            }
            if (mes<0) {
                anio = anio-1;
                mes = mes + 12;
            }
            System.out.println(" Su edad exacta es "+anio+" años con "+mes+" meses y "+dia+" dias ");
        }
    }
}