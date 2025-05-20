package exercise;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringUtils {

    // Задание 1: Удаление дубликатов из списка строк
    public static List<String> removeDuplicates(List<String> strings) {
        return strings.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    // Задание 2: Поиск самой длинной строки
    public static Optional<String> findLongestString(List<String> strings) {
        return strings.stream()
                .max(Comparator.comparingInt(String::length));
    }

    // Задание 3: Фильтрация по длине
    public static List<String> filterByLength(List<String> strings, int minLength) {
        return strings.stream()
                .filter(s -> s.length() > minLength)
                .collect(Collectors.toList());
    }

    // Задание 5: Объединение двух списков без дубликатов
    public static List<String> mergeLists(List<String> list1, List<String> list2) {
        return Stream.concat(list1.stream(), list2.stream())
                .distinct()
                .collect(Collectors.toList());
    }

    // Задание 7: Преобразование списка строк в Map
    public static Map<String, Integer> convertToMap(List<String> keyValuePairs) {
        return keyValuePairs.stream()
                .map(s -> s.split("="))
                .collect(Collectors.toMap(
                        parts -> parts[0],
                        parts -> Integer.parseInt(parts[1])
                ));
    }
}