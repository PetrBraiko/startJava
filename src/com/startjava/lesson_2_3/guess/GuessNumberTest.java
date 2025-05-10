package com.startjava.lesson_2_3.guess;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод имен игроков
        System.out.print("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();
        Player player1 = new Player(name1);

        System.out.print("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();
        Player player2 = new Player(name2);

        String playAgain;
        do {
            System.out.println("\nНовая игра начинается!");
            GuessNumber game = new GuessNumber(player1, player2);
            game.play();

            // Запрос на продолжение игры
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                playAgain = scanner.nextLine().toLowerCase();
                if (!playAgain.equals("yes") && !playAgain.equals("no")) {
                    System.out.println("Пожалуйста, введите 'yes' или 'no'.");
                }
            } while (!playAgain.equals("yes") && !playAgain.equals("no"));

        } while (playAgain.equals("yes"));

        System.out.println("Игра завершена.");
        scanner.close(); // Закрытие Scanner
    }
}