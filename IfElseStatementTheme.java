public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java\n");
        int age = 27;
        boolean maleGender = false;
        float hight = 1.88f;
        char firstLetter = "Stas".charAt(0);
        if (age > 20) {
            System.out.println("Тебе больше 20 лет.");
        } else {
            System.out.println("Тебе 20 лет или меньше.");
        }
        if (!maleGender) {
            System.out.println("Ты мужского пола.");
        } else {
            System.out.println("Ты женского пола.");
        }
        if (hight > 1.8) {
            System.out.println("Твой рост больше 180 см.");
        } else {
            System.out.println("Твой рост 180 см или меньше.");
        }
        if (firstLetter == 'M') {
            System.out.println("Твое имя начинается с буквы М.");
        } else if (firstLetter == 'I') {
            System.out.println("Твое имя начинается с буквы I.");
        } else {
            System.out.println("Твое имя не начинается с буквы M или I.");
        }

        System.out.println("\n2. Поиск max и min числа\n");
        int num1 = 10;
        int num2 = 100;
        if (num1 > num2) {
            System.out.println("Число max " + num1 + ", число min " + num2);
        } else if (num1 < num2) {
            System.out.println("Число max " + num2 + ", число min " + num1);
        } else {
            System.out.println("Число " + num1 + " число " + num2 + " равны.");
        }

        System.out.println("\n3. Проверка чисел.");
        System.out.println("\nЧисло " + num1 + ":");
        if (num1 == 0) {
            System.out.println("число равно нулю");
        } else if (num1 % 2 == 0) {
            System.out.println("\nявляется четным");
        } else {
            System.out.println("\nявляется не четным");
        } if (num1 >= 0 && num1 != 0) {
            System.out.println("\nявляется положительным");
        } else if (num1 != 0) {
            System.out.println("\nявляется отрицательным");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах.");
        num1 = 123;
        num2 = 153;
        System.out.println("\nИсходные числа " + num1 + " и " + num2);
        if (num1 / 100 == num2 / 100) {
            System.out.println("Одинаковые числа в 3 разряде : " + num1 / 100);
        }
        if (num1 % 100 / 10 == num2 % 100 / 10) {
            System.out.println("Одинаковые числа во 2 разряде : " + num1 % 100 / 10);
        }
        if (num1 % 10 == num2 % 10) {
            System.out.println("Одинаковые числа в 1 разряде : " + num1 % 10);
        }
        if (num1 / 100 != num2 / 100 && num1 % 100 / 10 != num2 % 100 / 10 && 
            num1 % 10 != num2 % 10) {
            System.out.println ("Одинаковых чисел нет.");
        }

        System.out.println("\n5. Определение символа по его коду.");
        char symbol = '\u0057';
        System.out.print(symbol);
        if (symbol <= '/'  || symbol >= ':' && symbol <= '@' || symbol >= '[' && symbol <= '`' || 
                symbol >= '{' && symbol <= '⌂' || symbol >= '░' && symbol <= '▀' || 
                symbol >= 'Є' && symbol <= '■') {
            System.out.print(" символ");
        } else if (symbol >= '1' && symbol <= '9') {
            System.out.print(" цифра");
        } else if (symbol >= 'A' && symbol <= 'Z' || symbol >= 'А' && symbol <= 'Я' ||
                 symbol == 'Ё') {
            System.out.print(" большая буква");
        } else if (symbol >= 'a' && symbol <= 'z' || symbol >= 'а' && symbol <= 'п' || 
                symbol >= 'р' && symbol <= 'я' || symbol == 'ё') {
            System.out.print(" маленькая буква");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        float depositSum = 300000f;
        float accruedInterest, result;
        if (depositSum < 100000) {
            accruedInterest = depositSum * 0.05f;
        } else if (depositSum >= 100000 && depositSum <= 300000) {
            accruedInterest = depositSum * 0.07f;
        } else {
            accruedInterest = depositSum * 0.1f;
        }
        System.out.println("Сумма вклада " + depositSum + "\nНачисленный процент " + 
                accruedInterest + "\nИтоговая сумма с % " + 
                (result = depositSum + accruedInterest));

        System.out.println("\n7. Определение оценки по предметам");
        int histroryPercent = 59;
        int programmingPercent = 91;
        int histroryGrade = 0;
        int programmingGrade = 0;
        int GradePointAverage = 0;
        if (histroryPercent <= 60) {
            histroryGrade = 2;
        } else if (histroryPercent > 60 && histroryPercent <= 73) {
            histroryGrade = 3;
        } else if (histroryPercent > 73 && histroryPercent <= 91) {
            histroryGrade = 4;
        } else if (histroryPercent > 91) {
            histroryGrade = 5;
        }
        if (programmingPercent <= 60) {
            programmingGrade = 2;
        } else if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingGrade = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingGrade = 4;
        } else if (programmingPercent > 91) {
            programmingGrade = 5;
        }
        System.out.println("История " + histroryGrade + "\nПрограммирование " + programmingGrade + 
                "\nСредний балл оценок по предметам " + ((histroryGrade + programmingGrade) / 2) + 
                "\nСредний процент по предметам " + (histroryPercent + programmingPercent) / 2);

        System.out.println("\n8. Расчет прибыли за год");
        int sumOfficeRent = 5000;
        int sumSalesAmount = 13000;
        int productionCosts = 9000;
        int sumAnnualProfit = ((sumSalesAmount) - (sumOfficeRent + productionCosts)) * 12;
        if (sumAnnualProfit > 0) {
            System.out.println("прибыль за год: +" + sumAnnualProfit);
        } else {
            System.out.println("прибыль за год: " + sumAnnualProfit);
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int billUSD1 = 50;
        int billUSD10 = 5;
        int billUSD100 = 10;
        int sumUSD = 567;
        int sumUSDHundred = 0;
        int sumUSDtens = 0;
        int sumUSDones = 0;
        int sumMax = (billUSD100 * 100) + (billUSD10 * 10) + billUSD1;
        boolean isEnough = sumMax < sumUSD;
        if (isEnough) {
            System.out.println("Недостаточно банкнот. Максимально сумма для выдачи " + sumMax);
        } else if((sumUSD / 100) <= billUSD100 && !isEnough && (sumUSD / 100) != 0) {
            sumUSDHundred = sumUSD / 100;
            sumUSD = sumUSD - (sumUSDHundred * 100);
            billUSD100 = billUSD100 - sumUSDHundred;
            System.out.println("Банкноты номиналом по 100 USD в количестве " + sumUSDHundred + 
                    " шт на сумму " + sumUSDHundred * 100 + " USD");
            sumUSDHundred *= 100;
        } else if (!isEnough && (sumUSD / 100) != 0) {
            sumUSDHundred = ((sumUSD / 100) - ((sumUSD / 100) - billUSD100)) * 100;
            System.out.println("Банкноты номиналом по 100 USD в количестве " + billUSD100 + 
                    " шт на сумму " + billUSD100 * 100 + " USD");
            sumUSD = sumUSD - (billUSD100 * 100);
            billUSD100 = 0;
        }
        if ((sumUSD / 10) <= billUSD10 && !isEnough) {
            sumUSDtens = sumUSD / 10;
            billUSD10 = billUSD10 - sumUSDtens;
            System.out.println("Банкноты номиналом по 10 USD в количестве " + sumUSDtens + 
                    " шт на сумму " + sumUSDtens * 10 + " USD");
            sumUSD = sumUSD - (sumUSDtens * 10);
            sumUSDtens *= 10;
        } else if (!isEnough) {
            sumUSDtens = ((sumUSD / 10) - ((sumUSD / 10) - billUSD10)) * 10;
            System.out.println("Банкноты номиналом по 10 USD в количестве " + billUSD10 + 
                    " шт на сумму " + billUSD10 * 10 + " USD");
            sumUSD = sumUSD - (billUSD10 * 10);
            billUSD10 = 0;
        }
        if (sumUSD <= billUSD1 && !isEnough) {
            sumUSDones = sumUSD;
            billUSD1 = billUSD1 - sumUSDones;
            System.out.println("Банкноты номиналом по 1 USD в количестве " + sumUSDones + 
                    " шт на сумму " + sumUSDones + " USD");
            sumUSD = sumUSD - sumUSDones;
        } else if (!isEnough) {
            sumUSDones = sumUSD - (sumUSD - billUSD1);
            System.out.println("Банкноты номиналом по 1 USD в количестве " + billUSD1 + 
                    " шт на сумму " + billUSD1 + " USD");
            sumUSD = sumUSD - billUSD1;
            billUSD1 = 0;
        }
        if (sumUSD == 0) {
            System.out.println("Купюры выданы на общую сумму " + 
                    (sumUSDones + sumUSDtens + sumUSDHundred + " USD"));
        } else if (sumUSD != 0) {
            System.out.println("Произошла ошибка");
        }
    }
}