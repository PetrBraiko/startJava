package exercise;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Задание 1: Удаление дубликатов из списка строк
        List<String> strings = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        System.out.println("1. Удаление дубликатов: " + StringUtils.removeDuplicates(strings));

        // Задание 2: Поиск самой длинной строки
        System.out.println("2. Самая длинная строка: " + StringUtils.findLongestString(strings));

        // Задание 3: Фильтрация по длине
        System.out.println("3. Строки длиннее 5 символов: " + StringUtils.filterByLength(strings, 5));

        // Задание 4: Сортировка пользователей по возрасту
        List<User> users = Arrays.asList(
                new User("Alice", 30),
                new User("Bob", 25),
                new User("Charlie", 35)
        );
        System.out.println("4. Отсортированные пользователи: " + UserUtils.sortUsersByAge(users));

        // Задание 5: Объединение двух списков без дубликатов
        List<String> list1 = Arrays.asList("apple", "banana");
        List<String> list2 = Arrays.asList("banana", "cherry");
        System.out.println("5. Объединение списков без дубликатов: " + StringUtils.mergeLists(list1, list2));

        // Задание 6: Фильтрация пользователей по возрасту и имени
        System.out.println("6. Пользователи старше 18 и имя начинается с 'A': " +
                UserUtils.filterUsersByAgeAndName(users, 18, "A"));

        // Задание 7: Преобразование списка строк в Map
        List<String> keyValuePairs = Arrays.asList("a=1", "b=2", "c=3");
        System.out.println("7. Преобразование в Map: " + StringUtils.convertToMap(keyValuePairs));
    }
}