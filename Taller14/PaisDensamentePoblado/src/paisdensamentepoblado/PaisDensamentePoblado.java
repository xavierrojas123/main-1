package paisdensamentepoblado;
import java.io.File;
import java.util.Scanner;
public class PaisDensamentePoblado {
    public static void main(String[] args) {
        try {
            File archivo = new File("data/paisesPoblados.txt");
            Scanner sc = new Scanner(archivo);
            String[] pais;
            String nombre = "", codigo = "";
            float densidad = 0;
            while (sc.hasNextLine()) {
                pais = sc.nextLine().split(":");
                if (!pais[0].equals("Nombre País")) {
                    if ((Integer.parseInt(pais[2]) 
                        / Float.parseFloat(pais[3])) > densidad) {
                        nombre = pais[0];
                        codigo = pais[1];
                        densidad = (float) Integer.parseInt(pais[2])
                            / Float.parseFloat(pais[3]);
                    }
                }
            }
            System.out.println("El pais con la población más densa es: ");
            System.out.println();
            System.out.println(nombre + " " + codigo + " tiene una densidad poblacional de "
                + densidad + " habitantes por km/2");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
}
