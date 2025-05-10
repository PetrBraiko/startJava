package com.startjava.lesson_2_3.method;

public class MethodNameHelper {

    /**
     * Возвращает имя метода, из которого был вызван этот метод.
     * @return Имя вызывающего метода.
     */
    public static String getCurrentMethodName() {
        return Thread.currentThread().getStackTrace()[3].getMethodName();
    }
}
