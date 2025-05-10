package com.startjava.lesson_2_3.array;
import java.util.HashSet;
import java.util.Set;

public class UniqueNumberFiller {

    public static int[] fillWithUniqueNumbers(int start, int end, int numbersPerLine) {
        if (start > end) {
            throw new IllegalArgumentException("Ошибка: левая граница (" + start + ") > правой (" + end + ")");
        }
        if (numbersPerLine < 1) {
            throw new IllegalArgumentException("Ошибка: количество чисел в строке не должно быть < 1 (" + numbersPerLine + ")");
        }

        int length = (int) ((end - start + 1) * 0.75);
        if (length <= 0) {
            throw new IllegalArgumentException("Ошибка: длина массива должна быть > 0 (" + length + ")");
        }

        Set<Integer> uniqueNumbers = new HashSet<>();
        while (uniqueNumbers.size() < length) {
            uniqueNumbers.add((int) (Math.random() * (end - start + 1)) + start);
        }

        int[] result = uniqueNumbers.stream().mapToInt(Integer::intValue).sorted().toArray();
        return result;
    }
}
