import java.util.Scanner;
public class Sueldo_Mas_Alto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = new String[5];
        int[] sueldos = new int[5];
        String nombre;
        int sueldoP, i;
        i = 0;
        
        System.out.println("Ingrese los sueldos de los empleados ");                                        
        System.out.print("Nombre del empleado: " + (i + 1) + ": ");
        n[i] = sc.nextLine();
        System.out.print("Sueldo: ");
        sueldos[i] = sc.nextInt();

        sueldoP = sueldos[i];
        nombre = n[i];

        for (i = 1; i < 5; i++) {
            sc.nextLine();
            System.out.print("Nombre del empleado: " + (i + 1) + ": ");
            n[i] = sc.nextLine();
            System.out.print("Sueldo: ");
            sueldos[i] = sc.nextInt();
            if (sueldos[i] >= sueldoP) {
                sueldoP = sueldos[i];
                nombre = n[i];
            }
        }
        System.out.println("El empleado con mayor sueldo es: " + nombre);                                         
        System.out.println("Sueldo: " + sueldoP);
    }
    
}