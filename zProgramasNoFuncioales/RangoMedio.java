import java.util.Scanner;
public class RangoMedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n, arriba = 0, abajo = 0; 
        float rango, rangoM;  
        System.out.print("Ingrese la cantidad de elementos que desee: ");
        n = sc.nextInt(); 
        float vector[] = new float [n]; 
        for (int i = 0; i <= n - 1; i++){
            System.out.print("Ingrese los valores:" + (i + 1) + ": ");
            vector[i] = sc.nextFloat(); 
        }
        rango = rangomayor(vector) - rangomenor(vector);  
        rangoM = (rangomayor(vector) + rangomenor(vector))/2; 
        
         for (int i = 0; i<= vector.length - 1; i++){
            if (vector[i] < rangoM){ 
                abajo += 1; 
            }else{
                arriba += 1; 
            }
        }
        System.out.println("RESULTADOS");
        System.out.println("==========");
        System.out.printf("%29s %8.2f %n", "Rango: ", rango);
        System.out.printf("%29s %8.2f%n", "Rango medio (RM): ", rangoM);
        System.out.printf("%29s %5d %n", "Elemento por arriba del RM: ", arriba);
        System.out.printf("%29s %5d %n", "Elemento inferiores del RM: ",abajo );
    }
    public static float rangomenor(float[] x){
        float c = x[0]; 
        for (int i = 0; i <= x.length -1 ; i++){
            if (c > x[i]){
                c = x[i]; 
            }
        }
        return c; 
    }
    public static float rangomayor(float[] x){
        float r = x[0]; 
        for (int i = 0; i <= x.length - 1; i++){
            if (r < x[i]){
                r = x[i]; 
            }
        }
        return r; 
    }
}