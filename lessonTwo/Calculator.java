public class Calculator {
    int num1;
    int num2;
    char sign;

    public Calculator() {
    }

    public void mat(int num1, char sign, int num2) {
        int result;
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
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: деление на ноль");
                    return;
                }
                break;
            case '^':
                result = 1;
                for (int i = 0; i < num2; i++) {
                    result *= num1;
                }
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("Введенная мат. операция не поддерживается\n");
                return;
        }
        if (num1 >= 0) {
            System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
        } else {
            System.out.println("Оба числа должны быть положительными");
        }
    }
}
