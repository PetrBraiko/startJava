package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        // Создание первого робота через сеттеры
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Gipsy Danger");
        jaeger1.setMark("Mark-3");
        jaeger1.setOrigin("USA");
        jaeger1.setHeight(79.25);
        jaeger1.setWeight(1980.0);
        jaeger1.setSpeed(10);
        jaeger1.setArmor(8);

        // Создание второго робота через конструктор
        Jaeger jaeger2 = new Jaeger(
                "Striker Eureka",
                "Mark-5",
                "Australia",
                76.2,
                1850.0,
                12,
                6
        );

        // Вывод информации о роботах
        System.out.println("Информация о первом роботе:");
        jaeger1.displayInfo();
        jaeger1.drift();
        jaeger1.move();

        System.out.println("\n----------\n");

        System.out.println("Информация о втором роботе:");
        jaeger2.displayInfo();
        jaeger2.drift();
        jaeger2.move();
    }
}

