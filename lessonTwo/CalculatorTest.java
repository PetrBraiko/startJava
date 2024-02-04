import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator cal = new Calculator();
        String playAgain = "";
        do {
            System.out.print("Введите первое число: ");
            cal.num1 = scanner.nextInt();
            System.out.print("Введите символ мат. операции: ");
            cal.sign = scanner.next().charAt(0);
            System.out.print("Введите второе число: ");
            cal.num2 = scanner.nextInt();
            //scanner.nextLine();
            cal.calculations(cal.num1, cal.sign, cal.num2);
            System.out.println("Хотите продолжить игру: yes/no  ?");
            playAgain = scanner.next();
        } while (playAgain.equals("yes"));
        System.out.println("Игра завершена!");
    }
}