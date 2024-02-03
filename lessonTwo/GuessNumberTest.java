import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();
        Player player1 = new Player(name1);

        System.out.print("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();
        Player player2 = new Player(name2);

        GuessNumber game = new GuessNumber(player1, player2);
        game.play();

        while (true) {
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                game = new GuessNumber(player1, player2);
                game.play();
            } else if (answer.equalsIgnoreCase("no")) {
                break;
            }
        }
    }
}