import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int secretNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.secretNumber = generateSecretNumber();
    }

    public void play() {
        Player currentPlayer = player1;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(currentPlayer.getName() + ", введите ваше предположение: ");
            int guess = scanner.nextInt();
            if (guess < secretNumber) {
                System.out.println("Число " + guess + " меньше того, что загадал компьютер");
            } else if (guess > secretNumber) {
                System.out.println("Число " + guess + " больше того, что загадал компьютер");
            } else {
                System.out.println("Поздравляем, " + currentPlayer.getName() + ", вы победили! Число "
                        + guess + " угадано!");
                break;
            }
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
    }

    private int generateSecretNumber() {
        return (int) (Math.random() * 100 + 1);
    }
}