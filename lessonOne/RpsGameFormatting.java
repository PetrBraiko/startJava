import java.util.Random;
public class javaTask {
    public static void main(String[] args) throws InterruptedException {
        String rock = "\u270A";
        String scissors = "\u270C";
        String paper = "\u270B";

        // Ход первого игрока
        String name1 = "HEL";
        System.out.println("Ход " + name1 + ": ");
        Random r = new Random();
        int position1 = r.nextInt(100);
        String sign1;
        if (position1 > 66) {
            sign1 = paper;
        } else if (position1 > 33) {
            sign1 = scissors;
        } else {
            sign1 = rock;
        }

        // Визуализация выбора первого игрока
        for (int i = 0; i < 5; i++) {
            System.out.print(rock + "\r");
            Thread.sleep(100);
            System.out.print(scissors + "\r");
            Thread.sleep(100);
            System.out.print(paper + "\r");
            Thread.sleep(100);
        }
        System.out.println(sign1);

        // Ход второго игрока
        String name2 = "WALLE";
        System.out.println("Ход " + name2 + ": ");
        int position2 = r.nextInt(100);
        String sign2;
        if (position2 > 66) {
            sign2 = paper;
        } else if (position2 > 33) {
            sign2 = scissors;
        } else {
            sign2 = rock;
        }

        // Визуализация выбора второго игрока
        for (int i = 0; i < 5; i++) {
            System.out.print(rock + "\r");
            Thread.sleep(100);
            System.out.print(scissors + "\r");
            Thread.sleep(100);
            System.out.print(paper + "\r");
            Thread.sleep(100);
        }
        System.out.println(sign2);

        // Определение победителя
        if (sign1.equals(sign2)) {
            System.out.println("Победила дружба!");
        } else {
            if ((sign1.equals(rock) && sign2.equals(scissors)) ||
                    (sign1.equals(scissors) && sign2.equals(paper)) ||
                    (sign1.equals(paper) && sign2.equals(rock))) {
                System.out.println("\nПобедил - " + name1);
            } else {
                System.out.println("\nПобедил - " + name2);
            }
        }
    }
}