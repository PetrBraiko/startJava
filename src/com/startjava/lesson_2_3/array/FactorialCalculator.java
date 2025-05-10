package com.startjava.lesson_2_3.array;

public class FactorialCalculator {

    public static long[] calculateFactorials(int... numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Ошибка: массив чисел равен null");
        }
        long[] factorials = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                System.out.println("Ошибка: факториал " + numbers[i] + "! не определен");
                factorials[i] = -1; // Отметка ошибки
            } else {
                factorials[i] = factorial(numbers[i]);
            }
        }
        return factorials;
    }

    private static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
