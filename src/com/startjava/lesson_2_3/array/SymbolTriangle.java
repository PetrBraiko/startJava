package com.startjava.lesson_2_3.array;

public class SymbolTriangle {

    public static void printTriangle(char start, char end, boolean ascending) {
        if (start > end) {
            System.out.println("Ошибка: левая граница (" + (int) start + ") > правой (" + (int) end + ")");
            return;
        }

        StringBuilder triangle = new StringBuilder();
        char[] symbols = getSortedSymbols(start, end, ascending);

        for (int i = 0; i < symbols.length; i++) {
            int spaces = symbols.length - i - 1;
            triangle.append(" ".repeat(spaces));
            triangle.append(String.valueOf(symbols[i]).repeat(2 * i + 1));
            triangle.append("\n");
        }

        System.out.println(triangle);
    }

    private static char[] getSortedSymbols(char start, char end, boolean ascending) {
        char[] symbols = new char[end - start + 1];
        for (int i = 0; i < symbols.length; i++) {
            symbols[i] = (char) (ascending ? start + i : end - i);
        }
        return symbols;
    }
}
