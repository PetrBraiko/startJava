package com.startjava.lesson_2_3.array;

public class TransactionReverser {

    public static int[] reverseTransactions(int[] transactions) {
        if (transactions == null) {
            throw new IllegalArgumentException("Ошибка: массив транзакций равен null");
        }
        int[] reversed = new int[transactions.length];
        for (int i = 0; i < transactions.length; i++) {
            reversed[i] = transactions[transactions.length - 1 - i];
        }
        return reversed;
    }
}
