import java.util.Scanner;
public class EstadViaje1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       float recorridoKm;
       float galones;
       float duracion, rendimiento, velocidad;
       System.out.println("        Estadísticas de viaje           ");
       System.out.println("========================================");
       System.out.println("Ingrese el recorrido en Km: ");
       recorridoKm = sc.nextFloat();
       System.out.println("Ingrese la duración del viaje en horas: ");
       duracion = sc.nextFloat();
       System.out.println("Ingrese los galones consumidos: ");
       galones = sc.nextFloat();

       rendimiento = galones * (float)3.785;
       velocidad = (byte)(recorridoKm*(1000/1)*(duracion/3600));

       System.out.println("\nEl rendimiento del auto en Km/lt fue de: " + rendimiento);
       System.out.println("\nLa velocidad media del viaje fue de: " + velocidad + " m/s");
    }
}

