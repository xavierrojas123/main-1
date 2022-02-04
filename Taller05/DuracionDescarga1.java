import java.util.Scanner;
public class DuracionDescarga1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       float descarga_GB;
       float velocidad_Mbps;
       float tiempo_descarga;
       byte horas, minutos, segundos;
       System.out.println("Tiempo de Descarga de un Archivo");
       System.out.println("=================================");
       System.out.println("Ingrese el tamaño del archivo en GB: ");
       descarga_GB = sc.nextFloat();
       System.out.println("Ingrese la velocidad de su internet en Mbps: ");
       velocidad_Mbps = sc.nextFloat();

        tiempo_descarga = (descarga_GB * 1024) / (velocidad_Mbps / 8 );
        horas = (byte)((tiempo_descarga / 60) / 60);
        minutos = (byte)((tiempo_descarga / 60) % 60);
        segundos = (byte)(tiempo_descarga % 60);
          
        System.out.println("\nSu duración en descarga es de " + horas + " horas " + minutos + " minutos " + segundos + " segundos" );
       

    }
}