public class VariablesTheme{
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        //количество ядер
        int numberOfCores = 2;

        //размер оперативной памяти
        long ram = 8192;

        //объем памяти видеокарты
        float gpuRam = 2048.5f;

        //частоту процессора
       double cpuSpeed = 2400.0;
        
        //является ли операционная система 32-битной
       boolean isBit = false;

       //какая операционная система используется
       char os = 'W';

       System.out.println("\n количество ядер: " + numberOfCores
        + "\n частота процессора: " + cpuSpeed
        + "\n размер оперативной памяти: " + ram
        + "\n объем памяти видеокарты: " + gpuRam
        + "\n является ли операционная система 32-битной: " + isBit
        + "\n какая операционная система используется: " + os );

        //Расчет стоимости товара со скидкой
        //Так же как решение возможно создание переменное для размера скидки, но тогда решение будет менее универсальным
        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int costPen = 100;
        int costBook = 200;
        int discount = 11;
        System.out.println("\n Общая стоимость товаров без скидки: " + (costPen+costBook) + " руб."
        + "\n сумма скидки: " + ((costPen + costBook)*discount/100) + " руб."
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
            "\nзначение после декремента переменной initialByte = " + (--initialByte));

        System.out.println("\nпервоначальное значение переменной initialShort = " + initialShort +
            "\nзначение после инкремента переменной initialShort = " + ( ++ initialShort) +
            "\nзначение после декремента переменной initialShort = " + (--initialShort));

        System.out.println("\nпервоначальное значение переменной initialInt = " + initialInt +
            "\nзначение после инкремента переменной initialInt = " + ( ++ initialInt) +
            "\nзначение после декремента переменной initialInt = " + (--initialInt));

        System.out.println("\nпервоначальное значение переменной initialLong = " + initialLong +
            "\nзначение после инкремента переменной initialLong = " + ( ++ initialLong) +
            "\nзначение после декремента переменной initialLong = " + (--initialLong));


        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        int c = a;
        a = b;
        b = c;

        System.out.println("\nС помощью третьей переменной:\na = " + a + "\nb = " + b );//a=5 b=2
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
        char symbol_1 = '$';
        char symbol_2 = '*';
        char symbol_3 = '@';
        char symbol_4 = '|';
        char symbol_5 = '~';
        System.out.println("\n" + (int)symbol_1 + " = " + symbol_1
        + "\n" + (int)symbol_2 + " = " + symbol_2
        + "\n" + (int)symbol_3 + " = " + symbol_3
        + "\n" + (int)symbol_4 + " = " + symbol_4
        + "\n" + (int)symbol_5 + " = " + symbol_5);

        //"Вывод в консоль ASCII-арт Дюка"
        System.out.println("\n"Вывод в консоль ASCII-арт Дюка);
        char symbol_1 = '/';
        char symbol_2 = '_';
        char symbol_3 = '\';
        char symbol_4 = '(';
        char symbol_5 = ')';
        System.out.println("\nТалисман Java"
        + 
        +
        +
        +
        +symbol_1 + " " + symbol_2 + symbol_2 + symbol_2 + symbol_2 + symbol_1 + symbol_3 + symbol_2 + symbol_2 + symbol_3);

    }
}



 System.out.println("\nВывод в консоль ASCII-арт Дюка");
        char symbol_1 = '/';
        char symbol_2 = '_';
        char symbol_3 = '\u00F7';
        char symbol_4 = '(';
        char symbol_5 = ')';
        System.out.println("\nТалисман Java"
                //+
                //+
               // +
                //+
                +symbol_1 + " " + symbol_2 + symbol_2 + symbol_2 + symbol_2 + symbol_1 + symbol_3 + symbol_2 + symbol_2 + symbol_3);

    }
}






