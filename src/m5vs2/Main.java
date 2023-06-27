package m5vs2;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        try {
            System.out.println(x / y);
            System.out.println("After division.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Corrected result = " + x);
        }
        System.out.println("After execution");
    }
}