package com.startjava.lesson_2_3.array;

public class Console {

    private Console() {
        // Приватный конструктор для предотвращения создания экземпляров
    }

    public static void printHighlightedWords(String highlightedWords) {
        System.out.println("Выделенные слова: " + highlightedWords);
    }

    public static void printTextWithTypewriterEffect(String text) throws InterruptedException {
        System.out.print("Текст с эффектом пишущей машинки: ");
        for (char c : text.toCharArray()) {
            System.out.print(c);
            Thread.sleep(50); // Задержка между символами
        }
        System.out.println();
    }

    public static void printError(String message) {
        System.err.println(message);
    }
}