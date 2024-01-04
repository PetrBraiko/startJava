public class VariablesTheme {
    public static void main(String[] args) {

        System.out.println("1. Вывод характеристик компьютера");
        //количество ядер
        int numberOfCores = 2;

        //размер оперативной памяти
        long ram = 8192;

        //объем памяти видеокарты
        float gpuRam = 2048.5f;

        //частота процессора
        double cpuSpeed = 2400.0;
        
        //является ли операционная система 32-битной
        boolean isBit = false;

        //класс процессора
        char processorСlass = 'I';

        System.out.println("\n количество ядер: " + numberOfCores
        + "\n частота процессора: " + cpuSpeed
        + "\n размер оперативной памяти: " + ram
        + "\n объем памяти видеокарты: " + gpuRam
        + "\n является ли операционная система 32-битной: " + isBit
        + "\n какая операционная система используется: " + processorСlass );


        //Расчет стоимости товара со скидкой
        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int costPen = 100;
        int costBook = 200;
        int discount = 11;

        System.out.println("\n Общая стоимость товаров без скидки: " + (costPen + costBook) + " руб."
        + "\n сумма скидки: " + ((costPen + costBook) * discount / 100) + " руб."
        + "\n стоимость товаров со скидкой: " + ((costPen + costBook) - ((costPen + costBook) * discount / 100)) + " руб.");


        //Вывод слова JAVA
        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("\n      J    a  v     v  a");
        System.out.println("      J   a a  v   v  a a");
        System.out.println("   J  J  aaaaa  V V  aaaaa");
        System.out.println("    JJ  a     a  V  a     a");


        //Вывод мин и мах значений целых числовых типов
        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte initialByte = 127;
        short initialShort = 32767;
        int initialInt = 2147483647;
        long initialLong = 9223372036854775807L;

        System.out.println("первоначальное значение переменной initialByte = " + initialByte +
        "\nзначение после инкремента переменной initialByte = " + ( ++ initialByte) +
        "\nзначение после декремента переменной initialByte = " + (-- initialByte));

        System.out.println("\nпервоначальное значение переменной initialShort = " + initialShort +
        "\nзначение после инкремента переменной initialShort = " + ( ++ initialShort) +
        "\nзначение после декремента переменной initialShort = " + (-- initialShort));

        System.out.println("\nпервоначальное значение переменной initialInt = " + initialInt +
        "\nзначение после инкремента переменной initialInt = " + ( ++ initialInt) +
        "\nзначение после декремента переменной initialInt = " + (-- initialInt));

        System.out.println("\nпервоначальное значение переменной initialLong = " + initialLong +
        "\nзначение после инкремента переменной initialLong = " + ( ++ initialLong) +
        "\nзначение после декремента переменной initialLong = " + (-- initialLong));


        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        int c = a;
        a = b;
        b = c;

        System.out.println("\nС помощью третьей переменной:\na = " + a + "\nb = " + b );
        a = a - b;
        b = a + b;
        a = b - a;

        System.out.println("\nС помощью арифметических действий:\na = " + a + "\nb = " + b );

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("\nС помощью побитовой операции:\na = " + a + "\nb = " + b );


        // Вывод символов и их кодов
        System.out.println("\n6. Вывод символов и их кодов: ");
        char dollarSign = '$';
        char asterisk = '*';
        char at = '@';
        char verticalBar = '|';
        char tilde = '~';

        System.out.println("\n" + (int) dollarSign + " = " + dollarSign
        + "\n" + (int) asterisk + " = " + asterisk
        + "\n" + (int) at + " = " + at
        + "\n" + (int) verticalBar + " = " + verticalBar
        + "\n" + (int) tilde + " = " + tilde);


        // Вывод в консоль ASCII-арт Дюка
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char virgule = '/';
        char lowLine = '_';
        char reversedVirgule = '\\';
        char leftParentheses = '(';
        char rightParentheses = ')';

        System.out.println("\nТалисман Java"
        + "\n    " + virgule + reversedVirgule
        + "\n   " + virgule + "  " + reversedVirgule
        + "\n  " + virgule + lowLine + leftParentheses + " " + rightParentheses + reversedVirgule
        + "\n " + virgule + "      " + reversedVirgule
        + "\n" + virgule + lowLine + lowLine + lowLine + lowLine + virgule + reversedVirgule + lowLine + lowLine + reversedVirgule);

        // Вывод количества сотен, десятков и единиц числа"
        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа: ");
        int digitA = 123;
        int hundreds, tens, units, sum, productOfNumbers;
        hundreds = digitA / 100;
        tens = digitA / 10;
        units = digitA;
        sum = hundreds + tens + units;
        productOfNumbers = hundreds * tens * units;

        System.out.println("\nЧисло " + digitA + " содержит: "
        + "\nсотен - " + hundreds
        + "\nдесятков - " + tens
        + "\nединиц - " + units
        + "\nСумма его цифр = " + sum
        + "\nПроизведение = " + productOfNumbers);

        // Вывод времени"
        System.out.println("\n8. Вывод времени: ");
        int time = 86399;
        int hour, minute, second;
        hour = time / 3600;
        minute = (time % 3600) / 60;
        second = minute % 60;

        System.out.println("\nВремя в формате ЧЧ:MM:СС " + hour + ":" + minute + ":" + second);
    }
}