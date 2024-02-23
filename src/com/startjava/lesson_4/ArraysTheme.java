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

    public static void reverseArrayValues() {
        System.out.println("1. Реверс значений массива");
        int[] array = {1, 7, 4, 5, 2, 6, 3};
        System.out.print("   До реверса: ");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.print("   После реверса: ");
        System.out.println(Arrays.toString(array));
    }

    public static void calculateProduct() {
        System.out.println("\n2. Произведение элементов массива");
        int[] array = new int[10];
        int productOfNumbers = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            productOfNumbers *= array[i];
        }
        System.out.print("   Произведение: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(" * ");
            }
        }
        System.out.println(" = " + productOfNumbers);
    }

    public static void deleteArrayElements() {
        System.out.println("\n3. Удаление элементов массива");
        double[] array = new double[15];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble();
        }
        int middleIndex = array.length / 2;
        double middleValue = array[middleIndex];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > middleValue) {
                array[i] = 0;
                count++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%10.3f", array[i]);
            if ((i + 1) % 8 == 0) {
                System.out.println();
            }
        }
        System.out.println("   Количество обнуленных ячеек: " + count);
    }

    public static void printAlphabetLadder() {
        System.out.println("\n4. Вывод алфавита лесенкой");
        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('Z' - i);
            for (int j = 0; j <= i; j++) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }
    }

    public static void fillUniqueNumbersArray() {
        System.out.println("Заполнение массива уникальными числами");
        int[] array = new int[30];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int num;
            boolean found;
            do {
                found = false;
                num = random.nextInt(40) + 60;
                for (int j = 0; j < i; j++) {
                    if (array[j] == num) {
                        found = true;
                        break;
                    }
                }
            } while (found);
            array[i] = num;
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}