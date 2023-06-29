package m2vs10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        var spaces = 0;
        int i = 0;
        //hello_andrey_dmitriev
        while (i < s.length()) {
            if (s.charAt(i) == ' ' || s.charAt(i) == '_') {
                spaces++;
            }
            i++;
        }

        System.out.println(">> " + spaces);

    }
}