import java.util.Random;

public class RpsGameFormatting {
    public static void main(String[] args) throws InterruptedException {
        String rock = "\u270A";
        String scissors = "\u270C";
        String paper = "\u270B";

        // Ход первого игрока
        String name1 = "HEL";
        Random r = new Random();
        int position1 = r.nextInt(100);
        String sign1 = rock;

        if (position1 > 66) {
            sign1 = paper;
        } else if (position1 > 33) {
            sign1 = scissors;
        }

        // Визуализация выбора первого игрока
        System.out.println("Ход " + name1 + ": ");
        for (int i = 0; i < 5; i++) {
            System.out.print(sign1 + "\r");
            Thread.sleep(100);
        }
        System.out.println(sign1);

        // Ход второго игрока
        String name2 = "WALLE";
        int position2 = r.nextInt(100);
        String sign2 = rock;

        if (position2 > 66) {
            sign2 = paper;
        } else if (position2 > 33) {
            sign2 = scissors;
        }

        // Визуализация выбора второго игрока
        System.out.println("Ход " + name2 + ": ");
        for (int i = 0; i < 5; i++) {
            System.out.print(sign2 + "\r");
            Thread.sleep(100);
        }
        System.out.println(sign2);

        // Определение победителя
        if (sign1.equals(sign2)) {
            System.out.println("Победила дружба!");
        } else {
            boolean isName1Equal = (sign1.equals(rock) && sign2.equals(scissors)) ||
                    (sign1.equals(scissors) && sign2.equals(paper)) ||
                    (sign1.equals(paper) && sign2.equals(rock));

            if (isName1Equal) {
                System.out.println("\nПобедил - " + name1);
            } else {
                System.out.println("\nПобедил - " + name2);
            }
        }
    }
}