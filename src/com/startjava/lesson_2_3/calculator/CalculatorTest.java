package com.startjava.lesson_2_3.calculator;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String continuation;

        do {
            // Ввод данных
            System.out.print("Введите первое число: ");
            calculator.setNum1(scanner.nextInt());

            System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
            calculator.setSign(scanner.next().charAt(0));

            System.out.print("Введите второе число: ");
            calculator.setNum2(scanner.nextInt());

            // Вычисление и вывод результата
            calculator.calculate();

            // Запрос на продолжение
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                continuation = scanner.next().toLowerCase();
                if (!continuation.equals("yes") && !continuation.equals("no")) {
                    System.out.println("Пожалуйста, введите 'yes' или 'no'.");
                }
            } while (!continuation.equals("yes") && !continuation.equals("no"));

        } while (continuation.equals("yes"));

        System.out.println("Программа завершена.");
        scanner.close();
    }
}