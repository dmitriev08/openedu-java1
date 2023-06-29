package m2vs4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 1000;
        long y = 90000000;
        y = x;
        x = (int)y;
        System.out.println(y);
        Human person = new Human();
        Student petrov = new Student();
        person = petrov;
//        petrov = person;
    }
}

class Human {
    String name;
}

class Student extends Human {
    String group;

}