package exercise;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class UserUtils {

    // Задание 4: Сортировка пользователей по возрасту
    public static List<User> sortUsersByAge(List<User> users) {
        return users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toList());
    }

    // Задание 6: Фильтрация пользователей по возрасту и имени
    public static List<User> filterUsersByAgeAndName(List<User> users, int minAge, String namePrefix) {
        return users.stream()
                .filter(user -> user.getAge() > minAge && user.getName().startsWith(namePrefix))
                .collect(Collectors.toList());
    }
}
