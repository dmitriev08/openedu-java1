package m2vs9;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int matrix [][] = new int[5][5];
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = random.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            sum += matrix[i][i];
        }
        System.out.println("Sum  = " + sum);
    }
}