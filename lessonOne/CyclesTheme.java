public class CyclesTheme {
    public static void main(String[] args) {
        //1. Подсчет суммы четных и нечетных чисел
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int start = -10;
        int end = 21;
        int number = start;
        int evenSum = 0;
        int oddSum = 0;
        do {
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
            number ++;
        } while (number <= end);
        System.out.println("В отрезке [-10, 21] сумма четны чисел = " + evenSum + ", а нечетных = " + oddSum);

        //2. Вывод чисел в порядке убывания
        System.out.println("\n2. Вывод чисел в порядке убывания");
        int num1 = -10;
        int num2 = 5;
        int num3 = -1;
        int maxNum = 0;
        int minNum = 0;
        if (num1 > num2 && num1 > num3) {
            maxNum = num1;
        } else if (num1 < num2 && num1 < num3) {
            minNum = num1;
        }
        if (num2 > num1 && num2 > num3) {
            maxNum = num2;
        } else if (num1 < num2 && num1 < num3) {
            minNum = num2;
        }
        if (num3 > num1 && num3 > num3) {
            maxNum = num3;
        } else if (num3 < num2 && num3 < num3) {
            minNum = num3;
        }
        for (int i = maxNum; i >= minNum; i --){
            System.out.print(i + "; ");
        }

        //3. Вывод реверсивного числа и суммы его цифр
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        number = 1234;
        int i = 0;
        int sum = 0;
        System.out.print("исходное число в обратном порядке: ");
        while (number != 0){
            i = number % 10;
            System.out.print(i);
            number /= 10;
            sum += i;
            i++;
        }
        System.out.println("\nсумма его цифр: " + sum);

        //4. Вывод чисел в несколько строк
        System.out.println("\n4. Вывод чисел в несколько строк");
        num1 = 1;
        num2 = 24;
        int columns = 5;
        int count = 0;
        for ( i = num1; i < num2; i++) {
            if (i % 2 != 0){
                System.out.printf("%2d ", i);
                count++;
                if (count % columns == 0) {
                    System.out.println();
                }
            }
        }
        int remainingNumbers = columns - count % columns;
        if (remainingNumbers < columns) {
            for (i = 0; i < remainingNumbers; i++) {
                System.out.printf("%2d ", 0);
            }
        }

        //5. Проверка количества двоек числа на четность/нечетность
        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность");
        number = 3242592;
        num1 = number;
        count = 0;
        while (num1 != 0) {
            int digit = num1 % 10;
            if (digit == 2) {
                count ++;
            }
            num1 /= 10;
        }
        if (count % 2 == 0) {
            System.out.println("В " + number + " четное кол во двоек: " + count);
        } else {
            System.out.println("В " + number + " нечетное кол во двоек: " + count);
        }

        //6. Отображение геометрических фигур
        System.out.println("\n6. Отображение геометрических фигур");
        System.out.println("Прямоугольник:");
        int width = 10;
        int height = 5;
        for ( i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Прямоугольный треугольник:");
        i = height;
        while (i > 0) {
            int j = 1;
            while (j <= i) {
                System.out.print("# ");
                j++;
            }
            System.out.println();
            i--;
        }
        System.out.println("Второй прямоугольный треугольник:");
        int a = 1;
        do {
            int numStars = a;
            if (a > height - a + 1) {
                numStars = height - a + 1;
            }
            for ( i = 0; i < numStars; i++) {
                System.out.print("$");
            }
            System.out.println();
            a++;
        } while (a < 1 + height);

        //7. Отображение ASCII-символов
        System.out.println("\n7. Отображение ASCII-символов:");
        System.out.printf("%-10s %-10s %-20s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for ( i = 15; i < 128; i++) {
            char ch = (char) i;
            if (i % 2 != 0 && !Character.isDigit(ch)) {
                System.out.printf("%-10d %-10c %-20s%n", i, ch, Character.getName(ch));
            } else if (i >= 97 && i <= 122 && i % 2 == 0) {// ДОЛЖНО БЫТЬ НЕЧЕТНЫМ? ПРОВЕРЬ
                System.out.printf("%-10d %-10c %-20s%n", i, ch, Character.getName(ch));
            }
        }

        // 8. Проверка, является ли число палиндромом
        System.out.println("\n8. Проверка, является ли число палиндромом:");
        number = 1234321;
        int originalNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number = number / 10;
        }
        if (originalNumber == reversedNumber) {
            System.out.println("Число " + originalNumber + " является палиндромом");
        } else {
            System.out.println("Число " + originalNumber + " не является палиндромом");
        }

        //9.Проверка, является ли число счастливым
        System.out.println("\n9. Проверка, является ли число счастливым:");
        number = 123456;
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;
        int firstHalf = number / 1000;
        int secondHalf = number % 1000;
        while (firstHalf > 0) {
            sumFirstHalf += firstHalf % 10;
            firstHalf = firstHalf / 10;
        }
        while (secondHalf > 0) {
            sumSecondHalf += secondHalf % 10;
            secondHalf = secondHalf / 10;
        }
        if (sumFirstHalf == sumSecondHalf) {
            System.out.println("Число " + number + " является счастливым");
        } else {
            System.out.println("Число " + number + " не является счастливым");
        }
        System.out.println("Сумма цифр ABC = " + sumFirstHalf + ", а сумма DEF = " + sumSecondHalf);

        //10 Отображение таблицы умножения Пифагора
        System.out.println("\n10. Отображение таблицы умножения Пифагора:");
        System.out.print("  |");
        for ( i = 1; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println("\n------------------------------");
        for ( i = 1; i <= 9; i++) {
            System.out.print(i + " |");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}