package m5vs8;
public class TooBigBird extends Exception {
    private int weight;
    private String status;

    public TooBigBird(int weight, String status) {
        this.weight = weight;
        this.status = status;
    }
    @Override
    public String getMessage() {
        return status;
    }
}

