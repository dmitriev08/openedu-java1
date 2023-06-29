package m2vs12;
public class Main {
    final static MutableInt MAX_SPEED = new MutableInt();

    public static void main(String[] args) {
        System.out.println(MAX_SPEED.getValue());
        MAX_SPEED.setValue(100);
        MAX_SPEED.setValue(1000);
        System.out.println(MAX_SPEED.getValue());
    }
}