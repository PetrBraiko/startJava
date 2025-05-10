package com.startjava.lesson_2_3.array;

public class ArrayCleaner {

    public static double[] cleanArray(double[] array, int index) {
        if (array == null) {
            throw new IllegalArgumentException("Ошибка: массив равен null");
        }
        if (index < 0 || index >= array.length) {
            throw new IllegalArgumentException("Ошибка: индекс " + index + " выходит за границы массива");
        }

        double threshold = array[index];
        int zeroCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > threshold) {
                array[i] = 0;
                zeroCount++;
            }
        }

        System.out.println("Значение из ячейки по индексу " + index + ": " + threshold);
        System.out.println("Количество обнуленных ячеек: " + zeroCount);
        return array;
    }
}
