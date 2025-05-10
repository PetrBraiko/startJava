package com.startjava.lesson_2_3.array;

public class ArrayCleanerTest {
    public static void main(String[] args) {
        double[] array = new double[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        int[] testIndices = {-1, 15, 0, 14};

        for (int index : testIndices) {
            try {
                System.out.println("Исходный массив:");
                printArray(array, 8);
                double[] cleaned = ArrayCleaner.cleanArray(array.clone(), index);
                System.out.println("Измененный массив:");
                printArray(cleaned, 7);
                System.out.println();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void printArray(double[] array, int lineLength) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%6.3f ", array[i]);
            if ((i + 1) % lineLength == 0 || i == array.length - 1) {
                System.out.println();
            }
        }
    }
}
