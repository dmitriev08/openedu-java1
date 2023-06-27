package m5vs4;

public class Main {
    public static void main(String[] args) {
        try {
            податьКофе(3);
        } catch (IllegalArgumentException e) {
            податьЧай();
        } catch (ArithmeticException e) {
            податьВоду();
        } finally {
            System.out.println("Убрать со стола.");
        }
    }

    private static void податьВоду() {
        System.out.println("Набираем воду и ставим стакан на стол");
    }

    private static void податьЧай() {
        System.out.println("Готовим и подаем чай");
    }

    private static void податьКофе(int option) {
        System.out.println("Готовим и подаем кофе");
        switch (option) {
            case 1: throw new IllegalArgumentException("Что-то пошло не так при подготовке");
            case 2: throw new ArithmeticException("Что-то еще пошло не так с машиной.");
            default:
                System.out.println("Приготовили кофе.");
        }
    }
}