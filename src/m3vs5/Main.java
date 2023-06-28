package m3vs5;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Fish #" + i);
        }
        var i = 0;
        while (i<10) {
            System.out.println("Chicken #" + i);
            i++;
        }
        i = 0;
        do {
            System.out.println("Beef #" + i);
            i++;
        } while (i < 10);
    }
}