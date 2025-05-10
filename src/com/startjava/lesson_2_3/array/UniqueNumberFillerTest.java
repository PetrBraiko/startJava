package com.startjava.lesson_2_3.array;

public class UniqueNumberFillerTest {
    public static void main(String[] args) {
        int[][] testCases = {
                {-30, -10, 23},
                {10, 50, 10},
                {-34, -34, 0},
                {-1, 2, -3},
                {5, -8, 2}
        };

        for (int[] testCase : testCases) {
            try {
                int[] result = UniqueNumberFiller.fillWithUniqueNumbers(testCase[0], testCase[1], testCase[2]);
                System.out.println("Массив уникальных чисел:");
                printArray(result, testCase[2]);
                System.out.println();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void printArray(int[] array, int numbersPerLine) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if ((i + 1) % numbersPerLine == 0 || i == array.length - 1) {
                System.out.println();
            }
        }
    }
}