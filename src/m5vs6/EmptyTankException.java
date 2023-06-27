package m5vs6;
public class EmptyTankException extends Throwable {
    public int getMl() {
        return ml;
    }

    private int ml;
    private String status;
    public EmptyTankException(int ml, String status) {
        this.ml = ml;
        this.status = status;
    }
}
