import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator cal = new Calculator();
        String playAgain;
        do {
            System.out.print("Введите первое число: ");
            cal.setNum1(scanner.nextInt());
            System.out.print("Введите символ мат. операции: ");
            cal.setSign(scanner.next().charAt(0));
            System.out.print("Введите второе число: ");
            cal.setNum2(scanner.nextInt());
            cal.calculations(cal.getNum1(), cal.getSign(), cal.getNum2());
            System.out.println("Хотите продолжить игру: yes/no  ?");
            playAgain = scanner.next();
        } while (playAgain.equals("yes"));
        System.out.println("Игра завершена!");
    }
}




