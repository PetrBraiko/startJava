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
        if (height < 1.8) {
            System.out.println("да");
        } else {
            System.out.println("нет");
        }

        char firstLetterOfName = "Mir".charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("да");
        } else if (firstLetterOfName == 'i') {
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
        } else if (a < b) {
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
        int hundreds1 = number1 / 100;
        int tens1 = (number1 / 10) % 10;
        int ones1 = number1 % 10;
        int hundreds2 = number2 / 100;
        int tens2 = (number2 / 10) % 10;
        int ones2 = number2 % 10;
        System.out.println("Исходные числа: " + number1 + " и " + number2);
        if (hundreds1 == hundreds2 || tens1 == tens2 || ones1 == ones2) {
            if (hundreds1 == hundreds2) {
                System.out.println("Одинаковая цифра: " + hundreds1);
                System.out.println("Номер разряда: 1");
            }
            if (tens1 == tens2) {
                System.out.println("Одинаковая цифра: " + tens1);
                System.out.println("Номер разряда: 2");
            }
            if (ones1 == ones2) {
                System.out.println("Одинаковая цифра: " + ones1);
                System.out.println("Номер разряда: 3");
            }
        } else {
            System.out.println("Отсутствуют одинаковые цифры в одинаковых разрядах");
        }

        //5.определеннее символа по его коду
        System.out.println("\n5. Определеннее символа по его коду");
        char code = '\u0057';
        if (code >= 'A' && code <= 'Z') {
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
        int percent = 7;
        if (deposit < 100000) {
            percent = 5;
        }else if (deposit >= 300000) {
            percent = 10;
        }
        double interest = deposit * percent / 100;
        double sum = deposit + interest;
        System.out.println("Сумма вклада: " + deposit + " руб.");
        System.out.println("Сумма начисленных процентов: " + interest + " руб.");
        System.out.println("Итоговая сумма с процентами: " + sum + " руб.");

        //7.Определение оценки по предметам
        System.out.println("\n7. Определение оценки по предметам");
        int historyPercent = 59;
        int programmingPercent = 92;
        int historyGrade = 5;
        if (historyPercent <= 60) {
            historyGrade = 2;
        } else if (historyPercent <= 73) {
            historyGrade = 3;
        } else if (historyPercent <= 91) {
            historyGrade = 4;
        }
        int programmingGrade = 5;
        if (programmingPercent <= 60) {
            programmingGrade = 2;
        } else if (programmingPercent <= 73) {
            programmingGrade = 3;
        } else if (programmingPercent <= 91) {
            programmingGrade = 4;
        }
        System.out.println("Оценка по истории: " + historyGrade);
        System.out.println("Оценка по программированию: " + programmingGrade);
        double averageGrade = (historyGrade + programmingGrade) / 2.0;
        System.out.println("Средний балл по предметам: " + averageGrade);
        double averagePercent = (historyPercent + programmingPercent) / 2.0;
        System.out.println("Средний % по предметам: " + averagePercent + "%");

        //8. Расчет годовой прибыли
        System.out.println("\n8. Расчет годовой прибыли");
        int monthlyRevenue = 13000;
        int monthlyRent = 5000;
        int monthlyCosts = 9000;
        int yearlyRevenue = monthlyRevenue * 12;
        int yearlyExpenses = (monthlyRent + monthlyCosts) * 12;
        int yearlyProfit = yearlyRevenue - yearlyExpenses;
        if (yearlyProfit > 0) {
            System.out.println("Прибыль за год: + " + yearlyProfit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + yearlyProfit + " руб.");
        }
    }
}