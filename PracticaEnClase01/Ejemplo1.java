public class Ejemplo1 {
    public static void main(String[] args) {
        byte x = 0;
        while (x<=4) {
            System.out.println(x);
            x = (byte) (x + 4);
        }
        System.out.println(x);
    }  
}