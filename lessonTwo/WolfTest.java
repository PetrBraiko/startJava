public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        // Присвоение значений полям объекта
        wolf.gender = "Мужской";
        wolf.name = "Серый";
        wolf.weight = 30.5;
        wolf.age = 5;
        wolf.color = "Серый";

        // Отображение значений в консоли
        System.out.println("Пол: " + wolf.gender);
        System.out.println("Кличка: " + wolf.name);
        System.out.println("Вес: " + wolf.weight);
        System.out.println("Возраст: " + wolf.age);
        System.out.println("Окрас: " + wolf.color);

        // Вызов методов объекта
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}