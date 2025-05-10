package com.startjava.lesson_2_3.array;

import java.util.StringTokenizer;

public class TypewriterEffect {

    public static String[] processText(String text) throws InterruptedException {
        if (text == null || text.isBlank()) {
            throw new IllegalArgumentException("Ошибка: текст пуст или содержит только пробелы.");
        }

        // Удаляем знаки препинания для анализа слов
        String cleanedText = text.replaceAll("[^a-zA-Zа-яА-Я0-9\\s]", "");

        // Разбиваем текст на слова
        StringTokenizer tokenizer = new StringTokenizer(cleanedText);
        int wordCount = tokenizer.countTokens();
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            words[i] = tokenizer.nextToken();
        }

        // Находим самое короткое и самое длинное слово
        String shortestWord = findShortestWord(words);
        String longestWord = findLongestWord(words);

        // Выводим слова между найденными (включительно)
        StringBuilder highlightedWords = new StringBuilder();
        boolean inRange = false;
        for (String word : words) {
            if (word.equalsIgnoreCase(shortestWord)) {
                inRange = true;
            }
            if (inRange) {
                highlightedWords.append(word.toUpperCase()).append(" ");
            }
            if (word.equalsIgnoreCase(longestWord)) {
                break;
            }
        }

        return new String[]{highlightedWords.toString().trim(), text};
    }

    private static String findShortestWord(String[] words) {
        String shortest = words[0];
        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
        }
        return shortest;
    }

    private static String findLongestWord(String[] words) {
        String longest = words[0];
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
}
