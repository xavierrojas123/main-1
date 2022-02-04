package personasmayores50años;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class PersonasMayores50Años {
    public static void main(String[] args) {
        try {
            File archivo = new File("Data/PersonasMayores.txt");
            Scanner sc = new Scanner(archivo);
            String[] personas;
            
            ArrayList <String> nombres = new ArrayList();
            ArrayList <Byte> edades = new ArrayList();
            
            while (sc.hasNextLine()) {
                personas = sc.nextLine().split(",");
                if (Byte.parseByte(personas[2]) > 50) {
                    nombres.add(personas[0]);
                    edades.add(Byte.parseByte(personas[2]));
                }
            }
            System.out.println("Listado personas de más de 50 años");
            System.out.println("      Nombre         Edad");
            System.out.println("------------------   -----");
            
            for (int i = 0; i < nombres.size(); i ++) {
                System.out.printf("%-20s %2d%n", nombres.get(i), edades.get(i));
            }
            
        } catch (Exception e) {
            System.err.println(e);
        }


    }
    
}
