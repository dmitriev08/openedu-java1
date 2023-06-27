package m5vs6;
public class Main {
    private static int mlInTank = 100;
    public static void main(String[] args) {
        try {
            приготовьКофе(50);
        } catch (EmptyTankException e) {
            System.out.println("Мало воды, нужно долить:" + (e.getMl() - mlInTank));
        }
    }

    private static void приготовьКофе(int ml) throws EmptyTankException {
        System.out.println("Будем готовить кофе.");
        if (ml > mlInTank) {
            throw new EmptyTankException(ml, "Недостаточно воды в резервуаре");
        }
        mlInTank -= ml;
        System.out.println("Наслаждайтесь кофе");
    }
}