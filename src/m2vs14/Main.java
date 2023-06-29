package m2vs14;
public class Main {
    public static void main(String[] args) {
        //1 1 2 3 5 8 13 ...
        int left = 1;
        int right = 1;
        var i = 0;
        System.out.print(left + " " + right + " ");
        while (i < 10) {
            int third = left + right;
            System.out.print(third + " ");
            left = right;
            right = third;
            i++;
        }
    }
}