package m2vs6;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Human person = new Human();
        Student petrov = new Student();
        person.name = "Andrey";
        petrov.name = "Petrov Petr";
        petrov.group = "517";

        System.out.println("Person = " + person);
        System.out.println("Petrov = " + petrov);

        petrov.name = "Petrov Ivan";
        petrov.group = "519";

        System.out.println("Person = " + person);
        System.out.println("Petrov = " + petrov);

    }
}

class Human {
    String name;

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Human {
    String group;

    @Override
    public String toString() {
        return "Student{" +
                "group='" + group + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}