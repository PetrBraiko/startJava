package com.startjava.lesson_2_3.guess;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int secretNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        secretNumber = generateSecretNumber();
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        Player currentPlayer = player1; // Начинает первый игрок

        while (true) {
            System.out.print(currentPlayer.getName() + ", ваша очередь. Введите число от 1 до 100: ");
            int guess = scanner.nextInt();

            // Проверка на корректность ввода
            if (guess < 1 || guess > 100) {
                System.out.println("Ошибка: введите число в диапазоне [1, 100].");
                continue; // Переходим к следующей итерации цикла
            }

            // Проверка угаданного числа
            if (guess < secretNumber) {
                System.out.println("Число " + guess + " меньше того, что загадал компьютер.");
            } else if (guess > secretNumber) {
                System.out.println("Число " + guess + " больше того, что загадал компьютер.");
            } else {
                System.out.println("Поздравляем, " + currentPlayer.getName() + "! Вы победили! Число " + guess + " угадано!");
                break;
            }

            // Передача хода другому игроку
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
    }

    private int generateSecretNumber() {
        return (int) (Math.random() * 100 + 1); // Генерация числа в диапазоне [1, 100]
    }
}