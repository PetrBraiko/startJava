package com.startjava.lesson_2_3.array;

public class Main {

    private Main() {
        // Приватный конструктор для предотвращения создания экземпляров
    }

    public static void main(String[] args) {
        String[] testCases = {
                "Java - это C++, из которого убрали все пистолеты, ножи и дубинки.\n- James Gosling",
                "Чтобы написать чистый код, мы сначала пишем грязный код, затем рефакторим его.\n- Robert Martin",
                null,
                ""
        };

        for (String testCase : testCases) {
            try {
                runTypewriterEffect(testCase);
            } catch (InterruptedException e) {
                Console.printError("Ошибка: выполнение прервано.");
            } catch (IllegalArgumentException e) {
                Console.printError(e.getMessage());
            }
            System.out.println();
        }
    }

    private static void runTypewriterEffect(String text) throws InterruptedException {
        String[] result = TypewriterEffect.processText(text);
        Console.printHighlightedWords(result[0]);
        Console.printTextWithTypewriterEffect(result[1]);
    }
}
