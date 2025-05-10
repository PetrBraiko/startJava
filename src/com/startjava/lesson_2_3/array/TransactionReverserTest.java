package com.startjava.lesson_2_3.array;

public class TransactionReverserTest {
    public static void main(String[] args) {
        int[][] testCases = {
                {}, // Массив нулевой длины
                null, // Null
                {5}, // Одно значение
                {6, 8, 9, 1}, // Несколько значений
                {13, 8, 5, 3, 2, 1, 1} // Больше значений
        };

        for (int[] testCase : testCases) {
            try {
                System.out.print("Исходные транзакции: ");
                printArray(testCase);
                int[] reversed = TransactionReverser.reverseTransactions(testCase);
                System.out.print(" В обратном порядке: ");
                printArray(reversed);
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
}
