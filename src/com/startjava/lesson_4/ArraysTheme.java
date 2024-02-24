package com.startjava.lesson_4;

import java.util.Arrays;
import java.util.Random;

public class ArraysTheme {
    public static void main(String[] args) {
        reverseArrayValues();
        calculateProduct();
        deleteArrayElements();
        printAlphabetLadder();
        fillUniqueNumbersArray();
    }

    private static void reverseArrayValues() {
        System.out.println("1. Реверс значений массива");
        int[] numbers = {1, 7, 4, 5, 2, 6, 3};
        System.out.print("   До реверса: ");
        System.out.println(Arrays.toString(numbers));
        int len = numbers.length;
        for (int i = 0; i < len / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[len - 1 - i];
            numbers[len - 1 - i] = temp;
        }
        System.out.print("   После реверса: ");
        System.out.println(Arrays.toString(numbers));
    }

    private static void calculateProduct() {
        System.out.println("\n2. Произведение элементов массива");
        int[] numbers = new int[10];
        int productOfNumbers = 1;
        int len = numbers.length;
        for (int i = 0; i < len; i++) {
            numbers[i] = i + 1;
            productOfNumbers *= numbers[i];
        }
        System.out.print("   Произведение: ");
        for (int i = 0; i < len; i++) {
            System.out.print(numbers[i]);
            if (i < len - 1) {
                System.out.print(" * ");
            }
        }
        System.out.println(" = " + productOfNumbers);
    }

    private static void deleteArrayElements() {
        System.out.println("\n3. Удаление элементов массива");
        double[] values = new double[15];
        Random random = new Random();
        int len = values.length;
        for (int i = 0; i < len; i++) {
            values[i] = random.nextDouble();
        }
        int middleIndex = len / 2;
        double middleValue = values[middleIndex];
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (values[i] > middleValue) {
                values[i] = 0;
                count++;
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.printf("%10.3f", values[i]);
            if ((i + 1) % 8 == 0) {
                System.out.println();
            }
        }
        System.out.println("   Количество обнуленных ячеек: " + count);
    }

    private static void printAlphabetLadder() {
        System.out.println("\n4. Вывод алфавита лесенкой");
        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }
    }

    private static void fillUniqueNumbersArray() {
        System.out.println("Заполнение массива уникальными числами");
        int[] uniqueNumbers = new int[30];
        Random random = new Random();
        int len = uniqueNumbers.length;
        for (int i = 0; i < len; i++) {
            int num;
            boolean found;
            do {
                found = false;
                num = random.nextInt(40) + 60;
                for (int j = 0; j < i; j++) {
                    if (uniqueNumbers[j] == num) {
                        found = true;
                        break;
                    }
                }
            } while (found);
            uniqueNumbers[i] = num;
        }
        Arrays.sort(uniqueNumbers);
        for (int i = 0; i < len; i++) {
            System.out.print(uniqueNumbers[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}