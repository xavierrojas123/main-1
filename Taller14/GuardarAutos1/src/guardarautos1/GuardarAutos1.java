package guardarautos1;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class GuardarAutos1 {
    public static void main(String[] args) {
      try {
            FileWriter fw = new FileWriter("data/guardarAutos1.txt",true);
            PrintWriter pw = new PrintWriter(fw);
            Scanner sc =  new Scanner(System.in);
            int n;
            String placa, marca, modelo;
            int Anio;
            double litros;
            System.out.print("¿Cuántos autos desea ingresar?: ");
            n = sc.nextInt();
            sc.nextLine();
            
            for(int i = 1; i <= n; i++){
                System.out.println("Ingrese los datos de los Autos " + i + ": ");
                System.out.print("+----- Placa: ");
                sc.nextLine();
                placa = sc.nextLine();
                System.out.print("+----- Marca: ");
                marca = sc.nextLine();
                System.out.print("+----- Modelo: ");
                modelo = sc.nextLine();
                System.out.print("+----- Año: ");
                Anio = sc.nextInt();
                System.out.print("+----- Litros: ");
                litros = sc.nextDouble();
                
                pw.println(placa + ", " + marca + ", "+ modelo + ", " + Anio + ", " + litros);
            }
            pw.close();
            
        } catch(Exception e){
            System.err.println("ERROR: " + e.toString());
        }
    }
    
}
