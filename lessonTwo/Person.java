public class Person {
    //атрибуты класса
    String gender;
    String name;
    double height;
    double weight;
    int age;

    //инициализация атрибутов класса
    public Person (String gender, String name, double height, double weight, int age) {
        this.gender = gender;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    //методы описывающие поведение
    public void walk() {
        System.out.println(name + " идет.");
    }
    public void sit() {
        System.out.println(name + " сидит.");
    }
    public void run() {
        System.out.println(name + " бежит.");
    }
    public void speak() {
        System.out.println(name + " говорит.");
    }
    public void learnJava() {
        System.out.println(name + " изучает Java.");
    }
}
