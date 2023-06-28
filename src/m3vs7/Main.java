package m3vs7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите ваше имя.");
        Scanner s = new Scanner(System.in);
        String t = s.nextLine();
        switch (t) {
            case "Andrey" :
                System.out.println("Hello mister Andrey"); break;
            case "Nataly" :
                System.out.println("Morning miss"); break;
            default:
                System.out.println("Welcome " + t); break;
        }
    }
}
