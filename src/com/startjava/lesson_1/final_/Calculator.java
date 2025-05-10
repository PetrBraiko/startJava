package com.startjava.lesson_1.final_;

public class Calculator {
    public static void main(String[] args) {
        // Задаем значения и операцию
        int num1 = 2;
        int num2 = 10;
        char operation = '^'; // Выбираем одну из операций: +, -, *, /, ^, %

        // Переменная для хранения результата
        double result = 0;

        // Выполняем операцию
        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            result = (double) num1 / num2;
        } else if (operation == '^') {
            result = 1;
            for (int i = 0; i < num2; i++) {
                result *= num1;
            }
        } else if (operation == '%') {
            result = num1 % num2;
        } else {
            System.out.println("Неизвестная операция");
            return;
        }

        // Выводим результат
        System.out.printf("%d %c %d = %.0f\n", num1, operation, num2, result);
    }
}