//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int initialScore = 200;
        int replenishment = 1_500;
        int bonus;
        boolean isSum = replenishment > 1_000;

        if (isSum) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Итоговый счет: " + (initialScore + replenishment + bonus));
        System.out.println("Бонусные рубли: " + bonus);
    }
}