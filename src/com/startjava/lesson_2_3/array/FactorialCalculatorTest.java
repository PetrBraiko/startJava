package com.startjava.lesson_2_3.array;

public class FactorialCalculatorTest {
    public static void main(String[] args) {
        int[][] testCases = {
                {}, // Массив нулевой длины
                null, // Null
                {8, 0, 9}, // Позитивные значения
                {-3, 1, 7, 13}, // Смешанные значения
                {-22, -0} // Отрицательные и ноль
        };

        for (int[] testCase : testCases) {
            try {
                System.out.print("Исходные числа: ");
                printArray(testCase);
                long[] factorials = FactorialCalculator.calculateFactorials(testCase);
                System.out.print(" Факториалы: ");
                printArray(factorials);
                System.out.println();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void printArray(int[] array) {
        if (array == null) {
            System.out.print("null");
        } else {
            System.out.print("[");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                if (i < array.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
        }
    }

    private static void printArray(long[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
