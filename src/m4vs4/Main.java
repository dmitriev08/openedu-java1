package m4vs4;

public class Main {
    public static void main(String[] args) {
        Dragon myLovelyDragon = new Dragon();
        myLovelyDragon.name = "Кеша";
        myLovelyDragon.sayName();
        int x = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("i > " + i);
        }
        System.out.println(x);
//        System.out.println(i);
    }
    public void newMethod() {
//        System.out.println(x);
    }
}