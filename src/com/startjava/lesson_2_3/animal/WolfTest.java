package com.startjava.lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        // Присвоение значений с использованием сеттеров
        wolf.setGender("Мужской");
        wolf.setName("Серый");
        wolf.setWeight(30.5);
        wolf.setAge(5);
        wolf.setColor("Серый");

        // Отображение значений с использованием геттеров
        System.out.println("Пол: " + wolf.getGender());
        System.out.println("Кличка: " + wolf.getName());
        System.out.println("Вес: " + wolf.getWeight());
        System.out.println("Возраст: " + wolf.getAge());
        System.out.println("Окрас: " + wolf.getColor());

        // Вызов методов объекта
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}