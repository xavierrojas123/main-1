import java.util.Scanner;
public class Estadisticas_Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, aMedia = 0, dMedia = 0;
        System.out.print("Ingrese la cantidad de estudiantes: ");
        n = sc.nextInt();
        float calif[] = new float[n];
        for(int i = 0; i <= (n-1);i++){
            System.out.print("Ingrese el valor " + (i+1) + " : ");
            calif[i] = sc.nextFloat();
        }
        System.out.println(" ");
        System.out.printf("%s %,.3f %n","Promedio: ",promEstud(calif, n));
        
        for(int i = 0; i <= (n-1);i++){
            if(calif[i] < promEstud(calif, n)){
                dMedia = dMedia + 1;
            } else {
                aMedia = aMedia + 1;
            }
        }
        System.out.println("Estudiantes por arriba de la media: " + aMedia);
        System.out.println("Estudiantes por debajo de la media: " + dMedia);
    }
    public static double promEstud(float vector[], int m){
        float suma = 0, promedioM;
        for(int i = 0; i <= (m-1); i++){
            suma = (float)(suma + vector[i]);
        }
        promedioM = (float)(suma / m);
        return promedioM;
    
    }
    
}