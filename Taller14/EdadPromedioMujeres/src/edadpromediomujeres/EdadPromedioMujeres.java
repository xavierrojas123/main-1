package edadpromediomujeres;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class EdadPromedioMujeres {
    public static void main(String[] args) {
        try {
            File archivo = new File("data/EdadPpersonas.txt");
            Scanner f = new Scanner(archivo);
            String[] persona;
            ArrayList<String> nombres = new ArrayList();
            ArrayList<String> generos = new ArrayList();
            ArrayList<Integer> edades = new ArrayList();
            while (f.hasNextLine()) {
                persona = f.nextLine().split(",");
                nombres.add(persona[0]);
                generos.add(persona[1]);
                edades.add(Integer.parseInt(persona[2]));
            }
            f.close();
            for(int i = 0; i <= edades.size() - 1; i++){
                if (edades.get(i) < 0){
                    throw new Exception("Número no positivo");
                }
            }
            int suma = 0, cf = 0;
            for (int i = 0; i <= edades.size() - 1; i++) {
                if (generos.get(i).equals("F")) {
                    suma += edades.get(i);
                    cf++;
                }
            }
            double media = (double) suma / cf;
            System.out.println("Promedio: " + media);
            
        } catch (FileNotFoundException e) {
            System.out.println("\nERROR! Archivo no encontrado");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("\nERROR! Datos Incompletos");
        } catch (NumberFormatException e){
            System.out.println("\nERROR! Formato de datos incorrecto");
        }catch (Exception e) {
            System.out.println("\nERROR! " + e.toString());
        }finally {
            System.out.println("\nGRACIAS POR USAR EL PROGRAMA");
        } 
    }
    
}
