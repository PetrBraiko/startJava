package com.startjava.lesson_1.base;
import java.util.Random;

public class CyclesTheme {
    public static void main(String[] args) {
        // 1. ВЫВОД ASCII-СИМВОЛОВ
        System.out.println("1. ВЫВОД ASCII-СИМВОЛОВ\n");
        System.out.printf("%-10s %-10s %-25s\n", "DECIMAL", "CHARACTER", "DESCRIPTION");

        for (int i = 33; i < 48; i += 2) {
            char symbol = (char) i;
            System.out.printf("%-10d %-10c %-25s\n", i, symbol, Character.getName(i));
        }

        for (int i = 97; i <= 122; i += 2) {
            char symbol = (char) i;
            System.out.printf("%-10d %-10c %-25s\n", i, symbol, Character.getName(i));
        }

        System.out.println();

        // 2. ВЫВОД ГЕОМЕТРИЧЕСКИХ ФИГУР
        System.out.println("2. ВЫВОД ГЕОМЕТРИЧЕСКИХ ФИГУР\n");

        for (int i = 5; i >= 1; i--) {
            String line = "-".repeat(10) + " ".repeat(5 - i) + "*".repeat(i) + " ".repeat(5 - i) + "^".repeat(2 * (5 - i) + 1);
            System.out.println(line);
        }

        System.out.println();

        // 3. ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ
        System.out.println("3. ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ\n");

        System.out.print("  |");
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n--+--------------------------------");

        for (int i = 2; i <= 9; i++) {
            System.out.printf("%d |", i);
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }

        System.out.println();

        // 4. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК
        System.out.println("4. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК\n");

        int count = 0;
        for (int i = 1; i < 24; i += 2) {
            System.out.printf("%4d", i);
            count++;
            if (count % 5 == 0 || i == 23) {
                int zeros = 5 - (count % 5 == 0 ? 5 : count % 5);
                for (int j = 0; j < zeros; j++) {
                    System.out.printf("%4d", 0);
                }
                System.out.println();
                count = 0;
            }
        }

        System.out.println();

        // 5. ВЫВОД ЧИСЕЛ МЕЖДУ MIN И MAX
        System.out.println("5. ВЫВОД ЧИСЕЛ МЕЖДУ MIN И MAX\n");

        int num1 = 10, num2 = 5, num3 = -1;
        int max = num1, min = num1;

        if (num2 > max) max = num2;
        if (num3 > max) max = num3;
        if (num2 < min) min = num2;
        if (num3 < min) min = num3;

        for (int i = min + 1; i < max; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        // 6. РАЗНЫЕ ОПЕРАЦИИ НАД ЧИСЛОМ
        System.out.println("6. РАЗНЫЕ ОПЕРАЦИИ НАД ЧИСЛОМ\n");

        int originalNumber = 2234321;
        int reversedNumber = 0;
        int temp = originalNumber;
        int digitCount = 0;

        while (temp > 0) {
            int digit = temp % 10;
            reversedNumber = reversedNumber * 10 + digit;
            if (digit == 2) digitCount++;
            temp /= 10;
        }

        boolean isPalindrome = originalNumber == reversedNumber;
        String palindromeStatus = isPalindrome ? "палиндром" : "не палиндром";
        String evenOdd = (digitCount % 2 == 0) ? "четным" : "нечетным";

        System.out.printf("%d - %s с %s (%d) количеством двоек\n", originalNumber, palindromeStatus, evenOdd, digitCount);

        System.out.println();

        // 7. ПРОВЕРКА СЧАСТЛИВОГО ЧИСЛА
        System.out.println("7. ПРОВЕРКА СЧАСТЛИВОГО ЧИСЛА\n");

        int luckyNumber = 101002;
        int firstHalfSum = 0, secondHalfSum = 0;
        temp = luckyNumber;

        for (int i = 0; i < 3; i++) {
            firstHalfSum += temp % 10;
            temp /= 10;
        }

        for (int i = 0; i < 3; i++) {
            secondHalfSum += temp % 10;
            temp /= 10;
        }

        boolean isLucky = firstHalfSum == secondHalfSum;
        System.out.printf("%06d - %s число\n", luckyNumber, isLucky ? "счастливое" : "несчастливое");
        System.out.printf("Сумма цифр %03d = %d\n", luckyNumber % 1000, firstHalfSum);
        System.out.printf("Сумма цифр %03d = %d\n", luckyNumber / 1000, secondHalfSum);

        System.out.println();

        // 8. ГЕНЕРАТОР ПАРОЛЯ
        System.out.println("8. ГЕНЕРАТОР ПАРОЛЯ\n");

        Random random = new Random();
        StringBuilder password = new StringBuilder();
        boolean hasLower = false, hasUpper = false, hasDigit = false, hasSpecial = false;

        while (password.length() < 8) {
            int code = random.nextInt(33, 127);
            char symbol = (char) code;
            password.append(symbol);

            if (Character.isLowerCase(symbol)) hasLower = true;
            if (Character.isUpperCase(symbol)) hasUpper = true;
            if (Character.isDigit(symbol)) hasDigit = true;
            if (!Character.isLetterOrDigit(symbol)) hasSpecial = true;
        }

        String strength;
        if (password.length() >= 8 && hasLower && hasUpper && hasSpecial) {
            strength = "Надежный";
        } else if (password.length() >= 8 && (hasUpper || hasDigit)) {
            strength = "Средний";
        } else {
            strength = "Слабый";
        }

        System.out.println("Пароль: " + password);
        System.out.println("Надежность: " + strength);
    }
}