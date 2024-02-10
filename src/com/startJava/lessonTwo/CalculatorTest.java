import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator cal = new Calculator();
        String continuation;
        do {
            System.out.print("Введите первое число: ");
            cal.setNum1(scanner.nextInt());
            System.out.print("Введите символ мат. операции: ");
            cal.setSign(scanner.next().charAt(0));
            System.out.print("Введите второе число: ");
            cal.setNum2(scanner.nextInt());
            cal.calculate();
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                continuation = scanner.next();
            } while (!continuation.equals("yes") && !continuation.equals("no"));
        } while (continuation.equals("yes"));
        System.out.println("Игра завершена!");
    }
}