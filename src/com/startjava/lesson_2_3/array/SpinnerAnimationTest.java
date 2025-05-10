package com.startjava.lesson_2_3.array;

public class SpinnerAnimationTest {
    public static void main(String[] args) {
        try {
            SpinnerAnimation.runSpinner();
        } catch (InterruptedException e) {
            System.out.println("Ошибка: анимация прервана.");
        }
    }
}
