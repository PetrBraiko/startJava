public class GuessNumber {
    public static void main(String[] args) {
        int secretNumber = 45;
        int low = 1;
        int high = 100;
        int playerNumber;
        do {
            playerNumber = (low + high) / 2;
            if (playerNumber < secretNumber) {
                System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
                low = playerNumber + 1;
            } else if (playerNumber > secretNumber) {
                System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
                high = playerNumber - 1;
            }
        } while (playerNumber != secretNumber);
        System.out.println("Вы победили! Число " + playerNumber + " угадано!");
    }
}