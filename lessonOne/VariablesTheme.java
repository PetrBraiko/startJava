public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        int numberOfSsd = 2;
        byte numberOfCores = 2;
        short ram = 8192;
        long storageSizeTB = 1;
        float gpuRam = 2048.5f;
        double cpuSpeed = 2400.0;
        boolean is32Bit = false;
        char cpu = 'I';
        System.out.println("количество ядер: " + numberOfCores + "\n" +
                "частота процессора: " + cpuSpeed + "\n" +
                "размер оперативной памяти: " + ram + "\n" +
                "объем памяти видеокарты: " + gpuRam + "\n" +
                "является ли операционная система 32-битной: " +  is32Bit + "\n" +
                "класс процессора: " + cpu + "\n" + "количество ssd дисков: " + numberOfSsd + "\n" + 
                "объем хранилища в терабайтах: " + storageSizeTB);

        //Расчет стоимости товара со скидкой
        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int costPen = 100;
        int costBook = 200;
        int discount = 11;
        int sum = costPen + costBook;
        int discountAmount = sum * discount / 100;
        System.out.println("Общая стоимость товаров без скидки: " + sum + " руб." + "\n" +
                "сумма скидки: " + discountAmount + " руб." + "\n" +
                "стоимость товаров со скидкой: " + (sum - discountAmount + " руб." + "\n");

        //Вывод слова JAVA
        System.out.println("3. Вывод слова JAVA\n");
        System.out.println("      J    a  v     v  a");
        System.out.println("      J   a a  v   v  a a");
        System.out.println("   J  J  aaaaa  V V  aaaaa");
        System.out.println("    JJ  a     a  V  a     a");

        //Вывод мин и мах значений целых числовых типов
        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807L;
        System.out.println("первоначальное значение переменной initialByte = " + maxByte + "\n" +
                "значение после инкремента переменной maxByte = " + (++maxByte) + "\n" +
                "значение после декремента переменной maxByte = " + (--maxByte) + "\n");
        System.out.println("первоначальное значение переменной maxShort = " + maxShort + "\n" +
                "значение после инкремента переменной maxShort = " + (++maxShort) + "\n" +
                "значение после декремента переменной maxShort = " + (--maxShort) + "\n");
        System.out.println("первоначальное значение переменной maxInt = " + maxInt + "\n" +
                "значение после инкремента переменной maxInt = " + (++maxInt) + "\n" +
                "значение после декремента переменной maxInt = " + (--maxInt) + "\n");
        System.out.println("первоначальное значение переменной maxLong = " + maxLong + "\n" +
                "значение после инкремента переменной maxLong = " + (++maxLong) + "\n" +
                "значение после декремента переменной maxLong = " + (--maxLong));

        // Перестановка значений переменных
        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        System.out.println("C  помощью третьей переменной: ");
        int c = a;
        a = b;
        b = c;
        System.out.print("a = " + a + "\nb = " + b);
        System.out.println("\nС помощью арифметических действий: ");
        a -= b;
        b += a;
        a = b - a;
        System.out.print("a = " + a + "\nb = " + b);
        System.out.println("\nС помощью побитовой операции: ");
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("a = " + a + "\nb = " + b);

        // Вывод символов и их кодов
        System.out.println("\n6. Вывод символов и их кодов: ");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.println((int) dollar + " = " + dollar);
        System.out.println((int) asterisk + " = " + asterisk);
        System.out.println((int) atSign + " = " + atSign);
        System.out.println((int) verticalBar + " = " + verticalBar);
        System.out.println((int) tilde + " = " + tilde);

        // Вывод в консоль ASCII-арт Дюка
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char lowLine = '_';
        char backSlash = '\\';
        char leftParentheses = '(';
        char rightParentheses = ')';
        System.out.println("Талисман Java");
        System.out.println("    " + slash + backSlash);
        System.out.println("   " + slash + "  " + backSlash);
        System.out.println("  " + slash + lowLine + leftParentheses +
                " " + rightParentheses + backSlash);
        System.out.println(" " + slash + "      " + backSlash);
        System.out.println("" + slash + lowLine + lowLine + lowLine +
                lowLine + slash + backSlash + lowLine + lowLine + backSlash);

        // Вывод количества сотен, десятков и единиц числа"
        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа: ");
        int srcNumber = 123;
        int hundreds = srcNumber / 100;
        int tens = srcNumber / 10;
        int ones = srcNumber;
        sum = hundreds + tens + ones;
        int product = hundreds * tens * ones;
        System.out.println("Число " + srcNumber + " содержит: " + "\n" +
                "сотен - " + hundreds + "\n" +
                "десятков - " + tens + "\n" +
                "единиц - " + one + "\n" +
                "Сумма его цифр = " + sum2 + "\n" +
                "Произведение = " + product);

        // Вывод времени"
        System.out.println("\n9. Вывод времени: ");
        int time = 86399;
        int hour = time / 3600;
        int minute = (time % 3600) / 60;
        int second = minute % 60;
        System.out.println("Время в формате ЧЧ:MM:СС " + hour + ":" + minute + ":" + second);
    }
}