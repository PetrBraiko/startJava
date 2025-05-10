package com.startjava.lesson_2_3.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private double height; // Высота робота
    private double weight; // Вес робота
    private int speed;     // Скорость робота
    private int armor;     // Броня робота

    // Пустой конструктор
    public Jaeger() {}

    // Конструктор с параметрами
    public Jaeger(String modelName, String mark, String origin, double height, double weight, int speed, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.armor = armor;
    }

    // Сеттеры
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    // Геттеры
    public String getModelName() {
        return modelName;
    }

    public String getMark() {
        return mark;
    }

    public String getOrigin() {
        return origin;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public int getArmor() {
        return armor;
    }

    // Методы поведения
    public void drift() {
        System.out.println(modelName + " вошел в дрифт!");
    }

    public void move() {
        System.out.println(modelName + " движется со скоростью " + speed + " км/ч.");
    }

    // Вывод информации о роботе
    public void displayInfo() {
        System.out.println("Модель: " + modelName);
        System.out.println("Марка: " + mark);
        System.out.println("Происхождение: " + origin);
        System.out.println("Высота: " + height + " м");
        System.out.println("Вес: " + weight + " т");
        System.out.println("Скорость: " + speed + " км/ч");
        System.out.println("Броня: " + armor);
    }
}