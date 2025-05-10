package com.startjava.lesson_1.final_;

public class GuessNumberGame {
    public static void main(String[] args) {
        // Компьютер загадывает число в диапазоне [1, 100]
        int secretNumber = 30; // Загаданное число
        int low = 1; // Нижняя граница диапазона
        int high = 100; // Верхняя граница диапазона

        System.out.println("Компьютер загадал число в диапазоне от " + low + " до " + high);

        // Цикл продолжается, пока число не будет угадано
        while (true) {
            // Игрок выбирает число как середину текущего диапазона
            int playerGuess = (low + high) / 2;

            // Проверяем, угадал ли игрок
            if (playerGuess == secretNumber) {
                System.out.println(playerGuess + " — это правильное число!");
                System.out.println("Вы победили!");
                break;
            }

            // Если не угадал, выводим подсказку
            if (playerGuess < secretNumber) {
                System.out.println(playerGuess + " меньше того, что загадал компьютер");
                low = playerGuess + 1; // Сужаем диапазон: увеличиваем нижнюю границу
            } else {
                System.out.println(playerGuess + " больше того, что загадал компьютер");
                high = playerGuess - 1; // Сужаем диапазон: уменьшаем верхнюю границу
            }
        }
    }
}