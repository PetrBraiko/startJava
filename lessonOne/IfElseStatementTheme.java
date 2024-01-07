public class IfElseStatementTheme {
    public static void main(String[] args) {
        //1. Перевод псевдокода на язык Java
        System.out.println("\n1. Перевод псевдокода на язык Java");
        boolean male = true;
            if (!male) {
                System.out.println("Привет");
            }else {
                System.out.println("Здравствуйте");
            }

        int age = 17;
            if  (age > 18) {
                System.out.println("Доступ закрыт, вам больше 18");
            } else {
                System.out.println("Доступ открыт, вам меньше 18");
            }

        double height = 1.7;
            if  (height < 1.8) {
                System.out.println("да");
            } else {
                System.out.println("нет");
            }

        String name = "Mir";
        char firstLetterOfName = name.charAt(0);
            if (firstLetterOfName == 'M') {
                System.out.println("да");
            } else if (firstLetterOfName == 'i'){
                System.out.println("нет");
            } else {
                System.out.println("не подходит");
            }

        //2. Поиск большего числа
        System.out.println("\n2. Поиск большего числа");
        int a = 10;
        int b = - 10;
            if (a > b) {
                System.out.println("Число " + a + " больше числа " + b);
            } else if (a < b){
                System.out.println("Число " + b + " больше числа " + a);
            } else {
                System.out.println("Число " + a + " равно числу " + b);
            }

        //3. Проверка числа
        System.out.println("\n3. Проверка числа");
        int number = 10;
            if (number == 0) {
                System.out.println("Число является нулем");
            } else {
                    if (number < 0) {
                        if (number % 2 == 0) {
                            System.out.println(number + " является отрицательным и четным");
                        } else {
                            System.out.println(number + " является отрицательным и нечетным");
                        }
                    } else {
                        if (number % 2 == 0) {
                            System.out.println(number + " является положительным и четным");
                        } else {
                            System.out.println(number + " является положительным и нечетным");
                        }
                }
            }

        //4. Поиск одинаковых цифр в числах
        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int number1 = 123;
        int number2 = 223;
        int digit1_1 = number1 / 100;
        int digit1_2 = (number1 / 10) % 10;
        int digit1_3 = number1 % 10;
        int digit2_1 = number2 / 100;
        int digit2_2 = (number2 / 10) % 10;
        int digit2_3 = number2 % 10;
            if (digit1_1 == digit2_1) {
                System.out.println("Исходные числа: " + number1 + " и " + number2);
                System.out.println("Одинаковая цифра: " + digit1_1);
                System.out.println("Номер разряда: 1");
            }
            if (digit1_2 == digit2_2) {
                System.out.println("Исходные числа: " + number1 + " и " + number2);
                System.out.println("Одинаковая цифра: " + digit1_2);
                System.out.println("Номер разряда: 2");
            }
            if (digit1_3 == digit2_3) {
                System.out.println("Исходные числа: " + number1 + " и " + number2);
                System.out.println("Одинаковая цифра: " + digit1_3);
                System.out.println("Номер разряда: 3");
            }
            if (digit1_1 != digit2_1 && digit1_2 != digit2_2 && digit1_3 != digit2_3) {
                System.out.println("Отсутствуют одинаковые цифры в одинаковых разрядах");
            }

        //5.определеннее символа по его коду
        System.out.println("\n5. Определеннее символа по его коду");
        char code = '\u0057';
            if ((code >= 'A' && code <= 'Z')){
                System.out.println("Символ " + code + " является большой буквой");
            }else if (code >= 'a' && code <= 'z') {
                System.out.println("Символ " + code + " является маленькой буквой");
            } else if (code >= '0' && code <= '9') {
                System.out.println("Символ " + code + " является цифрой");
            } else {
                System.out.println("Символ " + code + " не является буквой и не цифрой");
            }

        //6. подсчет суммы вклада и начисленных банком %
        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 301000;
        int percent;
            if (deposit<100000) {
                percent = 5;
            }else if (deposit>=300000){
                percent = 10;
            } else  {
                percent = 7;
            }
        double interest = deposit * percent / 100;
        double sum = deposit + interest;
        System.out.println("Сумма вклада: " + deposit + " руб.");
        System.out.println("Сумма начисленных процентов: " + interest + " руб.");
        System.out.println("Итоговая сумма с процентами: " + sum + " руб.");

        //7.Определение оценки по предметам
        System.out.println("\n7. Определение оценки по предметам");
        int historyPercentage = 59;
        int programmingPercentage = 92;
        int historyGrade;
        int programmingGrade;
            if (historyPercentage <= 60) {
                historyGrade = 2;
            } else if (historyPercentage <= 73) {
                historyGrade = 3;
            } else if (historyPercentage <= 91) {
                historyGrade = 4;
            } else {
                historyGrade = 5;
            }
            if (programmingPercentage <= 60) {
                programmingGrade = 2;
            } else if (programmingPercentage <= 73) {
                programmingGrade = 3;
            } else if (programmingPercentage <= 91) {
                programmingGrade = 4;
            } else {
                programmingGrade = 5;
            }
        System.out.println("Оценка по истории: " + historyGrade);
        System.out.println("Оценка по программированию: " + programmingGrade);
        double averageGrade = (historyGrade + programmingGrade) / 2.0;
        System.out.println("Средний балл по предметам: " + averageGrade);
        double averagePercentage = (historyPercentage + programmingPercentage) / 2.0;
        System.out.println("Средний % по предметам: " + averagePercentage + "%");

        //8. Расчет годовой прибыли
        System.out.println("\n8. Расчет годовой прибыли");
        int monthlyRevenue = 13000;
        int monthlyRent = 5000;
        int monthlyCosts = 9000;
        int annualProfit = (monthlyRevenue - monthlyRent - monthlyCosts) * 12;
            if (annualProfit > 0) {
                System.out.println("Прибыль за год: +" + annualProfit + " руб.");
            } else if (annualProfit == 0) {
                System.out.println("Прибыль за год: " + annualProfit + " руб.");
            } else {
                System.out.println("Прибыль за год: " + annualProfit + " руб.");
            }
    }
}