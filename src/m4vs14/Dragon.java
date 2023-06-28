package m4vs14;

public class Dragon extends Reptile implements Flying {
    private final String name;

    public Dragon(String name) {
        this.name = name;
    }
    @Override
    public void move() {
        System.out.println("Поползновения дракона: " + name);
    }

    @Override
    public void fly() {
        System.out.println("Полет дракона: " + name);
    }
}

