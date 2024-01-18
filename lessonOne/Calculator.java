public class Calculator {
    public static void main(String[] args) {
        //1. калькулятор
        int a = 10; 
        int b = 3;
        char sign = '%';
        int result;
        if (b == 0) {
            System.out.println("На ноль делить нельзя");
        } else if (a >= 0 && b >= 0) {
            if (sign == '+') {
                result = a + b;
            } else if (sign == '-') {
                result = a - b;
            } else if (sign == '*') {
                result = a * b;
            } else if (sign == '/') {
                result = a / b;
            } else if (sign == '^') {
                result = 1;
                for (int i = 0; i < b; i++) {
                    result *= a;
                }
            } else if (sign == '%') {
                result = a % b;
            } else {
                System.out.println("Неправильный математический знак");
                return;
            }
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else {
            System.out.println("Оба числа должны быть положительными");
        }
    }
}