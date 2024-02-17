package com.startjava.lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        //1. Подсчет суммы четных и нечетных чисел
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int start = -10;
        int end = 21;
        int counter = start;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= end);
        System.out.println("В отрезке [" + start + ", " + end +
                "] сумма четны чисел = " + sumEven + ", а нечетных = " + sumOdd);

        //2. Вывод чисел в порядке убывания
        System.out.println("\n2. Вывод чисел в порядке убывания");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int maxNumber = number1;
        int minNumber = number1;
        if (number2 > maxNumber) {
            maxNumber = number2;
        } else if (number2 < minNumber) {
            minNumber = number2;
        }
        if (number3 > maxNumber) {
            maxNumber = number3;
        } else if (number3 < minNumber) {
            minNumber = number3;
        }
        for (int i = maxNumber - 1; i > minNumber; i--) {
            System.out.print(i + " ");
        }

        //3. Вывод реверсивного числа и суммы его цифр
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int sum = 0;
        System.out.print("исходное число в обратном порядке: ");
        while (number > 0) {
            int remainder = number % 10;
            System.out.print(remainder);
            number /= 10;
            sum += remainder;
        }
        System.out.println("\nсумма его цифр: " + sum);

        //4. Вывод чисел в несколько строк
        System.out.println("\n4. Вывод чисел в несколько строк");
        start = 1;
        end = 24;
        int columns = 5;
        int count = 0;
        for (int i = start; i < end; i++) {
            if (i % 2 != 0) {
                System.out.printf("%2d ", i);
                count++;
                if (count % columns == 0) {
                    System.out.println();
                }
            }
        }
        int remainingNumbers = columns - count % columns;
        if (remainingNumbers < columns) {
            for (int i = 0; i < remainingNumbers; i++) {
                System.out.printf("%2d ", 0);
            }
        }

        //5. Проверка количества двоек числа на четность/нечетность
        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        number = 3242592;
        int copyNumber = number;
        int countTwos = 0;
        while (copyNumber != 0) {
            if (copyNumber % 10 == 2) {
                countTwos++;
            }
            copyNumber /= 10;
        }
        if (countTwos % 2 == 0) {
            System.out.println("В " + number + " четное кол во двоек: " + countTwos);
        } else {
            System.out.println("В " + number + " нечетное кол во двоек: " + countTwos);
        }

        //6. Отображение геометрических фигур
        System.out.println("\n6. Отображение геометрических фигур");
        System.out.println("Прямоугольник:" + "\n");
        int width = 10;
        int height = 5;
        for ( int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\nПрямоугольный треугольник:" +"\n");
        counter = height;
        while (counter > 0) {
            width = 1;
            while (width <= counter) {
                System.out.print("#");
                width++;
            }
            System.out.println();
            counter--;
        }
        System.out.println("\nВторой прямоугольный треугольник:" + "\n");
        height = 1;
        width = 1;
        do {
            counter = 1;
            do {
                System.out.print("$");
                counter++;
                if(width > 3){
                    height--;
                }
            } while (counter <= height);
            System.out.println();
            width++;
            if(height >= 3) {
                continue;
            }
            height++;
        } while (width <= 5);

        //7. Отображение ASCII-символов
        System.out.printf("%-10s  %-10s  %-30s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (int i = 15; i < 1000; i++) {
            char ch = (char) i;
            if (i < 48 && i % 2 != 0) {
                System.out.printf("%5d  %10c            %-30s%n", i, ch, Character.getName(i));
            } else if (i >= 97 && i <= 122 && i % 2 == 0) {
                System.out.printf("%5d  %10c            %-30s%n", i, ch, Character.getName(i));
            }
        }

        // 8. Проверка, является ли число палиндромом
        System.out.println("\n8. Проверка, является ли число палиндромом:");
        number = 1234321;
        copyNumber = number;
        int reversedNumber = 0;
        while (number > 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }
        if (copyNumber == reversedNumber) {
            System.out.println("Число " + copyNumber + " является палиндромом");
        } else {
            System.out.println("Число " + copyNumber + " не является палиндромом");
        }

        //9.Проверка, является ли число счастливым
        System.out.println("\n9. Проверка, является ли число счастливым:");
        number = 123456;
        int originalNumber = number; // сохраняем оригинальное значение числа
        int sumLeftHalf = 0;
        int sumRightHalf = 0;
        for (int i = 0; i < 6; i++) {
            int digit = number % 10;
            if (i < 3) {
                sumRightHalf += digit;
            } else {
                sumLeftHalf += digit;
            }
            number /= 10;
        }
        if (sumLeftHalf == sumRightHalf) {
            System.out.println("Число " + originalNumber + " является счастливым");
        } else {
            System.out.println("Число " + originalNumber + " не является счастливым");
        }
        System.out.println("Сумма цифр ABC = " + sumLeftHalf + ", а сумма DEF = " + sumRightHalf);

        //10 Отображение таблицы умножения Пифагора
        System.out.println("\n10. Отображение таблицы умножения Пифагора:");
        System.out.print("  |");
        for ( int i = 1; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println("\n------------------------------");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " |");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}