package com.startjava.lesson_1.base;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        // 1. ПЕРЕВОД ПСЕВДОКОДА НА ЯЗЫК JAVA
        System.out.println("1. ПЕРЕВОД ПСЕВДОКОДА НА ЯЗЫК JAVA\n");

        boolean isMale = false;
        int age = 20;
        double height = 1.75;

        if (!isMale) {
            System.out.println("Пол: женский");
        } else {
            System.out.println("Пол: мужской");
        }

        if (age > 18) {
            System.out.println("Возраст: совершеннолетний");
        } else {
            System.out.println("Возраст: несовершеннолетний");
        }

        if (height < 1.8) {
            System.out.println("Рост: ниже 1.8 метра");
        } else {
            System.out.println("Рост: выше или равен 1.8 метра");
        }

        System.out.println();

        // 2. ПОИСК БОЛЬШЕГО ЧИСЛА ШАГОВ
        System.out.println("2. ПОИСК БОЛЬШЕГО ЧИСЛА ШАГОВ\n");

        int stepsYesterday = 5000;
        int stepsToday = 6000;

        System.out.println("Шаги вчера: " + stepsYesterday);
        System.out.println("Шаги сегодня: " + stepsToday);

        if (stepsYesterday > stepsToday) {
            System.out.println("Больше шагов сделано вчера");
        } else if (stepsYesterday < stepsToday) {
            System.out.println("Больше шагов сделано сегодня");
        } else {
            System.out.println("Шагов сделано поровну");
        }

        double averageSteps = (stepsYesterday + stepsToday) / 2.0;
        System.out.printf("Среднее количество шагов: %.1f\n", averageSteps);

        System.out.println();

        // 3. ПРОВЕРКА КОЛИЧЕСТВА ГОСТЕЙ
        System.out.println("3. ПРОВЕРКА КОЛИЧЕСТВА ГОСТЕЙ\n");

        int guests = 11;

        if (guests == 0) {
            System.out.println("Пока никто не записался на мероприятие!");
        } else if (guests > 0) {
            if (guests % 2 == 0) {
                System.out.println("Записалось " + guests + " гостей. Можно формировать пары для конкурсов.");
            } else {
                System.out.println("Записалось " + guests + " гостей. Нужны индивидуальные задания.");
            }
        } else {
            System.out.println("Ошибка: количество гостей не может быть отрицательным!");
        }

        System.out.println();

        // 4. ОПРЕДЕЛЕНИЕ ПЕРВОГО СИМВОЛА НИКНЕЙМА
        System.out.println("4. ОПРЕДЕЛЕНИЕ ПЕРВОГО СИМВОЛА НИКНЕЙМА\n");

        String nickname = "Anna";
        char firstChar = nickname.charAt(0);

        System.out.println("Первый символ никнейма: " + firstChar);

        // Первый способ (диапазоны символов)
        if (firstChar >= 'a' && firstChar <= 'z') {
            System.out.println("Имя " + nickname + " начинается с маленькой буквы '" + firstChar + "'");
        } else if (firstChar >= 'A' && firstChar <= 'Z') {
            System.out.println("Имя " + nickname + " начинается с большой буквы '" + firstChar + "'");
        } else if (firstChar >= '0' && firstChar <= '9') {
            System.out.println("Имя " + nickname + " начинается с цифры '" + firstChar + "'");
        } else {
            System.out.println("Имя " + nickname + " начинается с символа '" + firstChar + "'");
        }

        // Второй способ (методы Character)
        if (Character.isLowerCase(firstChar)) {
            System.out.println("Имя " + nickname + " начинается с маленькой буквы '" + firstChar + "'");
        } else if (Character.isUpperCase(firstChar)) {
            System.out.println("Имя " + nickname + " начинается с большой буквы '" + firstChar + "'");
        } else if (Character.isDigit(firstChar)) {
            System.out.println("Имя " + nickname + " начинается с цифры '" + firstChar + "'");
        } else {
            System.out.println("Имя " + nickname + " начинается с символа '" + firstChar + "'");
        }

        System.out.println();

        // 5. ИНВЕНТАРИЗАЦИЯ
        System.out.println("5. ИНВЕНТАРИЗАЦИЯ\n");

        int dbSerialNumber = 567;
        int officeSerialNumber = 567;

        if (dbSerialNumber == officeSerialNumber) {
            System.out.println("[№" + dbSerialNumber + "]: компьютер на 3-м этаже в кабинете 2");
        } else {
            int hundredsMatch = (dbSerialNumber / 100 == officeSerialNumber / 100) ? 1 : 0;
            int tensMatch = ((dbSerialNumber / 10) % 10 == (officeSerialNumber / 10) % 10) ? 1 : 0;
            int onesMatch = (dbSerialNumber % 10 == officeSerialNumber % 10) ? 1 : 0;

            if (hundredsMatch + tensMatch + onesMatch > 0) {
                System.out.println("Нет полного совпадения:");
                System.out.println("База данных: [№" + dbSerialNumber + "]");
                System.out.println("Фактический: [№" + officeSerialNumber + "]");
            } else {
                System.out.println("[№" + dbSerialNumber + "]: оборудование не идентифицировано");
            }
        }

        System.out.println();

        // 6. ПОДСЧЕТ НАЧИСЛЕННЫХ БАНКОМ %
        System.out.println("6. ПОДСЧЕТ НАЧИСЛЕННЫХ БАНКОМ %\n");

        // Первый способ (float)
        float deposit = 321123.79f;
        float interestRate;

        if (deposit < 100_000) {
            interestRate = 5;
        } else if (deposit <= 300_000) {
            interestRate = 7;
        } else {
            interestRate = 10;
        }

        float interestAmount = deposit * interestRate / 100;
        float totalAmount = deposit + interestAmount;

        System.out.println("Первый способ (float):");
        System.out.printf("Сумма вклада: %.2f руб.\n", deposit);
        System.out.printf("Начисленные %%: %.2f руб.\n", interestAmount);
        System.out.printf("Итоговая сумма: %.2f руб.\n", totalAmount);

        // Второй способ (BigDecimal)
        BigDecimal depositBd = new BigDecimal("321123.79");
        BigDecimal interestRateBd;

        if (depositBd.compareTo(new BigDecimal("100000")) < 0) {
            interestRateBd = new BigDecimal("5");
        } else if (depositBd.compareTo(new BigDecimal("300000")) <= 0) {
            interestRateBd = new BigDecimal("7");
        } else {
            interestRateBd = new BigDecimal("10");
        }

        BigDecimal interestAmountBd = depositBd.multiply(interestRateBd).divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP);
        BigDecimal totalAmountBd = depositBd.add(interestAmountBd);

        System.out.println("\nВторой способ (BigDecimal):");
        System.out.println("Сумма вклада: " + depositBd + " руб.");
        System.out.println("Начисленные %: " + interestAmountBd + " руб.");
        System.out.println("Итоговая сумма: " + totalAmountBd + " руб.");

        System.out.println();

        // 7. ОПРЕДЕЛЕНИЕ ОЦЕНКИ ПО ПРЕДМЕТАМ
        System.out.println("7. ОПРЕДЕЛЕНИЕ ОЦЕНКИ ПО ПРЕДМЕТАМ\n");

        int historyPercent = 59;
        int programmingPercent = 92;

        int historyGrade = historyPercent <= 60 ? 2 : (historyPercent <= 73 ? 3 : (historyPercent <= 91 ? 4 : 5));
        int programmingGrade = programmingPercent <= 60 ? 2 : (programmingPercent <= 73 ? 3 : (programmingPercent <= 91 ? 4 : 5));

        double averageGrade = (historyGrade + programmingGrade) / 2.0;
        double averagePercent = (historyPercent + programmingPercent) / 2.0;

        System.out.println("История: " + historyGrade);
        System.out.println("Программирование: " + programmingGrade);
        System.out.printf("Средний балл: %.1f\n", averageGrade);
        System.out.printf("Средний %%: %.1f\n", averagePercent);

        System.out.println();

        // 8. РАСЧЕТ ГОДОВОЙ ПРИБЫЛИ
        System.out.println("8. РАСЧЕТ ГОДОВОЙ ПРИБЫЛИ\n");

        BigDecimal monthlySales = new BigDecimal("13025.233");
        BigDecimal monthlyRent = new BigDecimal("5123.018");
        BigDecimal monthlyCost = new BigDecimal("9001.729");

        BigDecimal yearlyProfit = monthlySales.subtract(monthlyRent).subtract(monthlyCost).multiply(new BigDecimal("12"))
                .setScale(2, RoundingMode.HALF_UP);

        if (yearlyProfit.compareTo(BigDecimal.ZERO) > 0) {
            System.out.println("Прибыль за год: +" + yearlyProfit + " руб.");
        } else if (yearlyProfit.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Прибыль за год: " + yearlyProfit + " руб.");
        } else {
            System.out.println("Прибыль за год: 0 руб.");
        }
    }
}