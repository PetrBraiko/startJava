package com.startjava.lesson_1.base;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;

public class VariablesTheme {
    public static void main(String[] args) {
        // 1. ВЫВОД ASCII-ГРАФИКИ
        System.out.println("1. ВЫВОД ASCII-ГРАФИКИ\n");

        // Первый способ (конкатенация)
        System.out.println("Первый способ (конкатенация):");
        System.out.println("                     /\\");
        System.out.println("   J    a  v     v  /  \\");
        System.out.println("   J   a a  v   v  /_( )\\");
        System.out.println("J  J  aaaaa  V V  /      \\");
        System.out.println(" JJ  a     a  V  /___/\\___\\\n");

        // Второй способ (текстовый блок)
        System.out.println("Второй способ (текстовый блок):");
        System.out.println("""
                         /\\            
                   J    /  \\  v     v  a
                   J   /_( )\\  v   v  a a
                J  J  /      \\  V V  aaaaa
                 JJ  /___/\\___\\  V  a     a
                """);

        System.out.println();

        // 2. РАСЧЕТ СТОИМОСТИ ТОВАРА
        System.out.println("2. РАСЧЕТ СТОИМОСТИ ТОВАРА\n");

        // Первый способ (float)
        float penPrice = 105.5f;
        float bookPrice = 235.23f;
        float discountPercent = 11.0f;
        float totalWithoutDiscount = penPrice + bookPrice;
        float discountAmount = totalWithoutDiscount * discountPercent / 100;
        float totalWithDiscount = totalWithoutDiscount - discountAmount;

        System.out.println("Первый способ (float):");
        System.out.printf("Общая стоимость товаров без скидки: %.2f руб.\n", totalWithoutDiscount);
        System.out.printf("Сумма скидки: %.2f руб.\n", discountAmount);
        System.out.printf("Стоимость товаров со скидкой: %.2f руб.\n", totalWithDiscount);

        // Второй способ (BigDecimal)
        BigDecimal penPriceBd = new BigDecimal("105.5");
        BigDecimal bookPriceBd = new BigDecimal("235.23");
        BigDecimal discountPercentBd = new BigDecimal("11.0");
        BigDecimal totalWithoutDiscountBd = penPriceBd.add(bookPriceBd);
        BigDecimal discountAmountBd = totalWithoutDiscountBd.multiply(discountPercentBd)
                .divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP);
        BigDecimal totalWithDiscountBd = totalWithoutDiscountBd.subtract(discountAmountBd);

        System.out.println("\nВторой способ (BigDecimal):");
        System.out.println("Общая стоимость товаров без скидки: " + totalWithoutDiscountBd + " руб.");
        System.out.println("Сумма скидки: " + discountAmountBd + " руб.");
        System.out.println("Стоимость товаров со скидкой: " + totalWithDiscountBd + " руб.");

        System.out.println();

        // 3. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ
        System.out.println("3. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ\n");

        int a = 2, b = 5;
        System.out.println("Исходные значения: a = " + a + ", b = " + b);

        // Метод 1: третья переменная
        System.out.println("\nМетод: третья переменная");
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Результат: a = " + a + ", b = " + b);

        // Метод 2: арифметические операции
        a = 2;
        b = 5; // Возвращаем исходные значения
        System.out.println("\nМетод: арифметические операции");
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Результат: a = " + a + ", b = " + b);

        // Метод 3: побитовая операция ^
        a = 2;
        b = 5; // Возвращаем исходные значения
        System.out.println("\nМетод: побитовый");
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("Результат: a = " + a + ", b = " + b);

        System.out.println();

        // 4. ДЕКОДИРОВАНИЕ СООБЩЕНИЯ
        System.out.println("4. ДЕКОДИРОВАНИЕ СООБЩЕНИЯ\n");

        int code1 = 1055, code2 = 1088, code3 = 1080, code4 = 1074, code5 = 1077, code6 = 1090;
        System.out.println("ASCII-коды:");
        System.out.printf("%6d %6d %6d %6d %6d %6d\n", code1, code2, code3, code4, code5, code6);
        System.out.println("Символы:");
        System.out.printf("%6c %6c %6c %6c %6c %6c\n", code1, code2, code3, code4, code5, code6);

        System.out.println();

        // 5. АНАЛИЗ КОДА ТОВАРА
        System.out.println("5. АНАЛИЗ КОДА ТОВАРА\n");

        int productCode = 123;
        int category = productCode / 100;
        int subcategory = (productCode / 10) % 10;
        int packageType = productCode % 10;
        int sum = category + subcategory + packageType;
        int productCodeCheck = category * subcategory * packageType;

        System.out.println("Код товара: " + productCode);
        System.out.println("  категория товара - " + category);
        System.out.println("  подкатегория - " + subcategory);
        System.out.println("  тип упаковки - " + packageType);
        System.out.println("Контрольная сумма = " + sum);
        System.out.println("Проверочный код = " + productCodeCheck);

        System.out.println();

        // 6. ТЕСТИРОВАНИЕ ДАТЧИКОВ ПЕРЕД ЗАПУСКОМ РАКЕТЫ
        System.out.println("6. ТЕСТИРОВАНИЕ ДАТЧИКОВ ПЕРЕД ЗАПУСКОМ РАКЕТЫ\n");

        byte temperature = Byte.MAX_VALUE;
        short pressure = Short.MAX_VALUE;
        char status = Character.MAX_VALUE;
        int distance = Integer.MAX_VALUE;
        long time = Long.MAX_VALUE;

        System.out.println("""
                [Температура, °C]:
                  Исходное: """ + temperature + """
                +1: """ + (byte) (temperature + 1) + """
                -1: """ + (byte) (temperature - 1));

        System.out.println("""
                [Давление, Па]:
                  Исходное: """ + pressure + """
                +1: """ + (short) (pressure + 1) + """
                -1: """ + (short) (pressure - 1));

        System.out.println("""
                [Код состояния системы]:
                  Исходное: """ + (int) status + """
                +1: """ + (char) (status + 1) + """
                -1: """ + (char) (status - 1));

        System.out.println("""
                [Пройденное расстояние, м]:
                  Исходное: """ + distance + """
                +1: """ + (distance + 1L) + """
                -1: """ + (distance - 1L));

        System.out.println("""
                [Время с момента старта, нс]:
                  Исходное: """ + time + """
                +1: """ + (time + 1L) + """
                -1: """ + (time - 1L));

        System.out.println();

        // 7. ВЫВОД ПАРАМЕТРОВ JVM И ОС
        System.out.println("7. ВЫВОД ПАРАМЕТРОВ JVM И ОС\n");

        Runtime runtime = Runtime.getRuntime();
        long availableProcessors = runtime.availableProcessors();
        long allocatedMemoryMB = runtime.totalMemory() / 1_048_576;
        long freeMemoryMB = runtime.freeMemory() / 1_048_576;
        long usedMemoryMB = allocatedMemoryMB - freeMemoryMB;
        long maxMemoryMB = runtime.maxMemory() / 1_048_576;

        String osDrive = System.getProperty("user.home");
        String osVersion = System.getProperty("os.version");
        String javaVersion = System.getProperty("java.version");
        String fileSeparator = System.getProperty("file.separator");

        System.out.println("""
                Характеристики JVM:
                  Доступное число ядер: """ + availableProcessors + """
                  Выделенная память: %d МБ
                  Свободная память: %d МБ
                  Используемая память: %d МБ
                  Максимально доступная память: %d МБ
                """.formatted(allocatedMemoryMB, freeMemoryMB, usedMemoryMB, maxMemoryMB));

        System.out.println("""
                Параметры ОС:
                  Системный диск: """ + osDrive + """
                Версия ОС: """ + osVersion + """
                Версия Java: """ + javaVersion + """
                Символ разделения пути: """ + fileSeparator);
    }
}