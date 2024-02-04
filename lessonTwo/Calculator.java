public class Calculator {
    private int num1;
    private int num2;
    private char sign;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public char getSign() {
        return sign;
    }

    public void calculate() {
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
                if (num2 == 0) {
                    System.out.println("Ошибка: деление на ноль");
                    return;
                }
                result = num1 / num2;
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