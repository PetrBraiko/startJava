package com.startjava.lesson_2_3.calculator;

public class Calculator {
    private int num1;
    private int num2;
    private char sign;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void calculate() {
        double result = 0; // Используем double для деления
        boolean isValid = true;

        switch (sign) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено");
                    isValid = false;
                } else {
                    result = (double) num1 / num2; // Корректное деление
                }
                break;
            case '^':
                result = Math.pow(num1, num2); // Корректное возведение в степень
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("Ошибка: операция '" + sign + "' не поддерживается");
                isValid = false;
        }

        if (isValid) {
            System.out.printf("%d %c %d = %.2f%n", num1, sign, num2, result);
        }
    }
}