package m5vs8;
public class Main {
    public static void main(String[] args) {
        try {
            взвеситьПтицу(new Bird("Просто птица", 10));
        } catch (TooBigBird e) {
            System.out.println(e.getMessage());
        }
    }
    private static final int MAX_WEIGHT = 3;
    private static void взвеситьПтицу(Bird bird) throws TooBigBird {
        if (bird.getWeight() > MAX_WEIGHT) {
            throw new TooBigBird(bird.getWeight(), "Слишком эта птица тяжела.");
        }
    }
}